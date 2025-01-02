package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
// import java.sql.SQLDataException;
import java.sql.SQLException;
=======
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
import java.util.List;

public interface ProductService {

<<<<<<< HEAD
    List<Product> getAllProducts() throws SQLException;

    Product getProductById(int productId)throws SQLException;

    int addProduct(Product product)throws SQLException;

    void updateProduct(Product product)throws SQLException;

    void deleteProduct(int productId)throws SQLException;
=======
    List<Product> getAllProducts();

    Product getProductById(int productId);

    int addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int productId);
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f

    //Do not implement these methods in ProductServiceImplJdbc.java class
    default List<Product> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
