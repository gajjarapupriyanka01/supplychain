package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier implements Comparable<Supplier> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    private String supplierName;
    private String email;
    private String phone;
=======
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String contactEmail;
    private String contactPhone;
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
    private String address;
    private String username;
    private String password;
    private String role;
<<<<<<< HEAD

    public Supplier() {
    }

    public Supplier(int supplierId, String supplierName, String email, String phone, String address, String username, String password, String role) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.email = email;
        this.phone = phone;
=======
    public Supplier() {
    }
    public Supplier(int supplierId, String supplierName, String contactEmail, String contactPhone, String address,
            String username, String password, String role) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }
<<<<<<< HEAD

    public String getEmail() {
        return email;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int compareTo(Supplier otherSupplier) {
        // Implement comparison logic based on account balance
        return this.getSupplierName().compareTo(otherSupplier.getSupplierName());
    }
=======
    public int getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
>>>>>>> 9c892efc1c820eb2825dfd9f848d6e3c1d2f1a6f
}