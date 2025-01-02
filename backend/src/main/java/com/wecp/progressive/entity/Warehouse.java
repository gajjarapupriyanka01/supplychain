package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Warehouse implements Comparable<Warehouse> {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
    
    //@ManyToOne(cascade = CascadeType.MERGE)
    //@JoinColumn(name = "supplierId")
=======
public class Warehouse implements Comparable<Warehouse>{
    private int warehouseId;
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
    private int supplierId;
    private String warehouseName;
    private String location;
    private int capacity;
<<<<<<< HEAD

    public Warehouse() {}

    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
=======
    private int warehouse_id;
    public Warehouse() {
    }
    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouse_id;
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }
<<<<<<< HEAD

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplier) {
        this.supplierId = supplier;
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
        return otherWarehouse.getCapacity() - this.getCapacity();
    }
=======
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

    

    

>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}