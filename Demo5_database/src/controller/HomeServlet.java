package controller;

import dao.ProductDAO;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    ProductDAO dao = new ProductDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = insertProduct();
        request.setAttribute("message",msg);
        request.setAttribute("products",getListProduct());
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected List<Product> getListProduct(){
        List<Product> list = dao.getProductByCategory(1);
        return list;
    }

    protected String insertProduct(){
        Product p = new Product();
        p.setName("Iphone8");
        p.setPrice(20000);
        p.setQuantity(30);
        p.setCategoryID(2);
        return dao.insertProduct(p);
    }

    protected String updateProduct(){
        Product p = new Product();
        p.setName("Iphone7");
        p.setPrice(20000);
        p.setId(1);
        return dao.updateProduct(p);
    }

    protected String deleteProduct(){
        return dao.deleteProduct(1);
    }


}
