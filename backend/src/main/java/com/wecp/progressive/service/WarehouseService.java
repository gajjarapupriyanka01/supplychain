package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;
=======
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses();

    int addWarehouse(Warehouse warehouse);

    List<Warehouse> getWarehousesSortedByCapacity();
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f

    default public void emptyArrayList() {
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
<<<<<<< HEAD
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
=======
    default void updateWarehouse(Warehouse warehouse) {
    }

    default void deleteWarehouse(int warehouseId) {
    }

    default Warehouse getWarehouseById(int warehouseId) {
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
