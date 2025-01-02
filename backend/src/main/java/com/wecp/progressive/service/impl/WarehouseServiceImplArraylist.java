package com.wecp.progressive.service.impl;

<<<<<<< HEAD

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

@Service
public class WarehouseServiceImplArraylist implements WarehouseService {

    private static List<Warehouse> warehouseList;

    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplArraylist (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }
 
    public WarehouseServiceImplArraylist() {
        warehouseList = new ArrayList<>();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
        return warehouseList.size();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedWarehouses = warehouseList;
        sortedWarehouses.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortedWarehouses;
    }

    @Override
    public void emptyArrayList() {
        warehouseList = new ArrayList<>();
    }
=======
import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.entity.Warehouse;

public class WarehouseServiceImplArraylist implements WarehouseDAO {

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addWarehouse'");
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWarehouseById'");
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateWarehouse'");
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteWarehouse'");
    }

    @Override
    public List<Warehouse> getAllWarehouse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllWarehouse'");
    }

>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}