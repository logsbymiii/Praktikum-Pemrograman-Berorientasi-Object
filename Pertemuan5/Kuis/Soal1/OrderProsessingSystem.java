package Pertemuan5.Kuis.Soal1;

import java.time.LocalDate;

public class OrderProsessingSystem {
    public static void main(String[] args) {
        System.out.println("=== DIAGRAM CLASS FOR ORDER PROCESSING SYSTEM ===\n");

        Customer c1 = new Customer(1, "Helmi", "Malang", 81234567);
        Customer c2 = new Customer(2, "Fajari", "Surabaya", 8234567);

        Product p1 = new Product(101, 4500000f, "Laptop");
        Product p2 = new Product(102, 250000f, "Mouse");

        p1.tambahStock(10, 1);
        p1.tambahStock(5, 2);
        p2.tambahStock(30, 1);

        Order o1 = new Order(1001, LocalDate.now(), p1.getProductPrice(), c1, p1);
        Order o2 = new Order(1002, LocalDate.now(), p2.getProductPrice(), c2, p2);
        Order o3 = new Order(1003, LocalDate.now(), p2.getProductPrice(), c1, p2);

        o1.createOrder();
        o2.createOrder();
        o3.createOrder();

        System.out.println("\n--- Detail Order milik " + c1.getCustomerName() + " ---");
        for (Order o : c1.getOrderList()) {
            System.out.println(o);
        }

        System.out.println("\n--- Detail Stock Product id=" + p1.getProductId() + " ---");
        for (Stock s : p1.getStockList()) {
            System.out.println(s);
        }

        System.out.println("\n--- Ringkasan ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p1);
        System.out.println(p2);
    }
}