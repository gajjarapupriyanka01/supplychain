package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
import java.sql.SQLException;
// import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product) throws SQLException ;
    Product getProductById(int productId) throws SQLException ;
    void updateProduct(Product product) throws SQLException ;
    void deleteProduct(int productId) throws SQLException ;
    List<Product> getAllProducts() throws SQLException ;
=======
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product);
    Product getProductById(int productId);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> getAllProducts();
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}