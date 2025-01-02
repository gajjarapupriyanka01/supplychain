package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Warehouse;

<<<<<<< HEAD
import java.sql.SQLException;
// import java.sql.SQLException;
import java.util.List;

public interface WarehouseDAO {
    int addWarehouse(Warehouse warehouse) throws SQLException ;
    Warehouse getWarehouseById(int warehouseId) throws SQLException ;
    void updateWarehouse (Warehouse warehouse) throws SQLException ;
    void deleteWarehouse (int warehouseId) throws SQLException ;
    List<Warehouse> getAllWarehouse() throws SQLException ;
=======
import java.util.List;

public interface WarehouseDAO {
    int addWarehouse(Warehouse warehouse);
    Warehouse getWarehouseById(int warehouseId);
    void updateWarehouse (Warehouse warehouse);
    void deleteWarehouse (int warehouseId);
    List<Warehouse> getAllWarehouse();
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}