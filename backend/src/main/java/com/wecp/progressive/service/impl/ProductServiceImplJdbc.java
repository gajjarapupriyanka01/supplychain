package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImplJdbc implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImplJdbc(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productDAO.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        return productDAO.getProductById(productId);
    }

    @Override
    public int addProduct(Product product) throws SQLException {
        return productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        productDAO.deleteProduct(productId);
    }
=======
import java.util.List;

import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc implements ProductService {

    @Override
    public List<Product> getAllProducts() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public int addProduct(Product product) {
       
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public void updateProduct(Product product) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void deleteProduct(int productId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}