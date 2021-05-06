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

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //insertDB();
        //deleteDB();
        List<ProductEntity> products = getAllProduct();
        request.setAttribute("products", products);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private List<ProductEntity> getAllProduct() {
        return dao.getAllProduct();
    }

    private void insertDB(){
        for (int i = 4; i < 10; i++) {
            ProductEntity product = new ProductEntity();
            product.setName("Iphone" + i);
            product.setPrice(1000 +i);
            product.setQuantity(5+i);
            product.setCategoryId(1);
            dao.insertProduct(product);
        }
    }

    private void updateDB() {
        ProductDao dao = new ProductDao();
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1);
        productEntity.setName("Iphone X");
        productEntity.setQuantity(100);
        productEntity.setPrice(800);
        dao.updateProduct(productEntity);
    }

    private void deleteDB() {
        ProductDao dao = new ProductDao();
        dao.deleteProduct(34);
    }
}
