package com.demo.servlet;

import com.demo.dao.ProductDao;
import com.demo.entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addProduct(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductEntity> products = dao.getAllProduct();
        request.setAttribute("products",products);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void addProduct(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ProductEntity product = new ProductEntity(name,price,quantity);
        dao.insertProduct(product);
        response.sendRedirect("product");
    }
}
