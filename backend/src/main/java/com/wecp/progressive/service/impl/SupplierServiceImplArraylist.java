package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService {
    private static List<Supplier> supplierList=new ArrayList<>();


    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
       return supplierList;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        supplierList.add(supplier);
        return supplierList.size();
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        List<Supplier> sortSupplier=supplierList;
        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName));
        return sortedSupplier;

    }
    @Override
    public void emptyArrayList(){
        supplierList=newArrayList<>();
    }

}