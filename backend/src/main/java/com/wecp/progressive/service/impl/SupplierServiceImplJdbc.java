package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

public class SupplierServiceImplJdbc implements SupplierService {

    private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierDAO.getAllSuppliers();
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return supplierDAO.addSupplier(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> sortedSuppliers = supplierDAO.getAllSuppliers();
        if (sortedSuppliers != null) {
            sortedSuppliers.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name
        }
        return sortedSuppliers;
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
        supplierDAO.updateSupplier(supplier);
    }

    @Override
    public void deleteSupplier(int supplierId) throws SQLException {
        supplierDAO.deleteSupplier(supplierId);
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
        return supplierDAO.getSupplierById(supplierId);
    }
=======
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc  implements SupplierService {

    @Override
    public List<Supplier> getAllSuppliers() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllSuppliers'");
    }

    @Override
    public int addSupplier(Supplier supplier) {
    
        throw new UnsupportedOperationException("Unimplemented method 'addSupplier'");
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getAllSuppliersSortedByName'");
    }

>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}