package Pertemuan5.Kuis.Soal1;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private float amount;

    private Customer customer;
    private Product product;

    public Order(int orderId, LocalDate orderDate, float amount, Customer customer, Product product) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.customer = customer;
        this.product = product;
        customer.tambahOrder(this); 
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order createOrder() {
        System.out.println("Order #" + orderId + " dibuat untuk " + customer.getCustomerName()
                + " - Produk: " + product.getProductType() + " - Total: Rp" + amount);
        return this;
    }

    public void editOrder(int orderId) {
        System.out.println("Order dengan id " + orderId + " berhasil diubah.");
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer=" + customer.getCustomerName()
                + ", product=" + product.getProductId() + ", amount=" + amount
                + ", tanggal=" + orderDate + "}";
    }
}