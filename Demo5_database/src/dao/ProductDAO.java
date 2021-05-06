package dao;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import database.ConnectionUtil;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO {
    Connection connection = ConnectionUtil.getConnection();

    public List<Product> getProductByCategory(int id) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product where categoryID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getInt("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCategoryID(rs.getInt("categoryID"));
                list.add(p);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public String insertProduct(Product p) {
        String sql = "INSERT INTO product (name,price,quantity,categoryID) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getPrice());
            ps.setInt(3, p.getQuantity());
            ps.setInt(4, p.getCategoryID());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0) {
                return "Success";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "Fail";
    }

    public String updateProduct(Product p) {
        String sql = "UPDATE product SET name = ? ,price = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getPrice());
            ps.setInt(3, p.getId());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0) {
                return "Success";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "Fail";
    }

    public String deleteProduct(int id) {
        String sql = "DELETE FROM product WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0) {
                return "Success";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "Fail";
    }
}
