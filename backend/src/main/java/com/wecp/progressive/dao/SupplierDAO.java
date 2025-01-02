package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Supplier;

<<<<<<< HEAD
import java.sql.SQLException;
// import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier) throws SQLException ;
    Supplier getSupplierById(int supplierId) throws SQLException ;
    void updateSupplier(Supplier supplier) throws SQLException ;
    void deleteSupplier(int supplierId) throws SQLException ;
    List<Supplier> getAllSuppliers() throws SQLException ;
=======
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier);
    Supplier getSupplierById(int supplierId);
    void updateSupplier(Supplier supplier);
    void deleteSupplier(int supplierId) ;
    List<Supplier> getAllSuppliers();
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}
