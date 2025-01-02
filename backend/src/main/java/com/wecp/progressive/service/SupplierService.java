package com.wecp.progressive.service;


import com.wecp.progressive.entity.Supplier;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers() throws SQLException;

    int addSupplier(Supplier supplier) throws SQLException;

    List<Supplier> getAllSuppliersSortedByName() throws SQLException;
=======
import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers();

    int addSupplier(Supplier supplier);

    List<Supplier> getAllSuppliersSortedByName();
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f

    default public void emptyArrayList() {
    }

    //Do not implement these methods in SupplierServiceImplArraylist.java class
<<<<<<< HEAD
    default void updateSupplier(Supplier supplier) throws SQLException {
    }

    default void deleteSupplier(int supplierId) throws SQLException {
    }

    default Supplier getSupplierById(int supplierId) throws SQLException {
        return null;
    }

}
=======
    default void updateSupplier(Supplier supplier) {
    }

    default void deleteSupplier(int supplierId) {
    }

    default Supplier getSupplierById(int supplierId) {
        return null;
    }

}
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
