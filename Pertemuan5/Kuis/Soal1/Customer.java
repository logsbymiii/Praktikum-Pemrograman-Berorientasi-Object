package Pertemuan5.Kuis.Soal1;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int phone;

    private List<Order> orderList = new ArrayList<>();

    public Customer(int customerId, String customerName, String address, int phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void tambahOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addCustomer() {
        System.out.println("Customer '" + customerName + "' berhasil ditambahkan.");
    }

    public void editCustomer() {
        System.out.println("Data customer '" + customerName + "' berhasil diubah.");
    }

    public void deleteCustomer() {
        System.out.println("Customer '" + customerName + "' berhasil dihapus.");
    }

    public String getInfo() {
        return "Customer{id=" + customerId + ", nama=" + customerName
                + ", alamat=" + address + ", telp=" + phone + "}";
    }
}