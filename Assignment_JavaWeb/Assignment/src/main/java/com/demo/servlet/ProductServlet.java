package com.demo.servlet;

import com.demo.dao.ProductDao;
import com.demo.entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            addProduct(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductEntity> products = dao.getAllProduct();
        request.setAttribute("products", products);
        request.getRequestDispatcher("tables.jsp").forward(request, response);

    }


    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        int price = java.lang.Integer.parseInt(request.getParameter("price"));
        int quantity = java.lang.Integer.parseInt(request.getParameter("quantity"));
        String image = request.getParameter("image");
        ProductEntity products = new ProductEntity(name,price,quantity,image);
        dao.insertProduct(products);
        response.sendRedirect("product");
    }


}
