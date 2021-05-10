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

@WebServlet(name = "UpdateServlet",urlPatterns = {"/update"})
public class UpdateServlet extends HttpServlet {
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            updateProduct(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("sid"));
        ProductEntity product = dao.findProduct(id);
        System.out.println("Product : " + product);
        request.setAttribute("st",product);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = java.lang.Integer.parseInt(request.getParameter("price"));
        int quantity = java.lang.Integer.parseInt(request.getParameter("quantity"));
        String image = request.getParameter("image");
        ProductEntity product = new ProductEntity(id,name,price,quantity,image);
        dao.updateProduct(product);
        response.sendRedirect("product");

   }

}
