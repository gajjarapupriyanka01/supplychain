package com.wecp.progressive.entity;

public class Warehouse implements Comparable<Warehouse>{
    private int warehouseId;
    private int supplierId;
    private String warehouseName;
    private String location;
    private int capacity;
    private int warehouse_id;
    public Warehouse() {
    }
    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouse_id;
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
    public int getSupplier_id() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public int compareTo(Warehouse otherWarehouse) {
        return Double.compare(otherWarehouse.getCapacity(),this.getCapacity());
        
        
    }

    

    

}