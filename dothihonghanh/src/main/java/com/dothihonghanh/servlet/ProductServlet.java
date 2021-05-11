package com.dothihonghanh.servlet;

import com.dothihonghanh.dao.ProductDao;
import com.dothihonghanh.entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addProduct(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductEntity> products = dao.getAllProduct();
        request.setAttribute("products",products);
        request.getRequestDispatcher("listphone.jsp").forward(request,response);
    }

    protected void addProduct(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String des = request.getParameter("description");
        String brand = request.getParameter("brand");
        ProductEntity product = new ProductEntity(name,price,des,brand);
        dao.insertProduct(product);
        response.sendRedirect("product");
    }
}
