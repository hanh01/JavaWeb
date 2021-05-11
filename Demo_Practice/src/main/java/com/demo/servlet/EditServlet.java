package com.demo.servlet;

import com.demo.dao.ProductDao;
import com.demo.entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditServlet", urlPatterns = {"/edit"})
public class EditServlet extends HttpServlet {
    ProductDao dao = new ProductDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        edit(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("sid"));
        ProductEntity product = dao.findProduct(id);
        request.setAttribute("products", product);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ProductEntity product = new ProductEntity(id, name, price, quantity);
        dao.updateProduct(product);
        response.sendRedirect("product");
    }
}
