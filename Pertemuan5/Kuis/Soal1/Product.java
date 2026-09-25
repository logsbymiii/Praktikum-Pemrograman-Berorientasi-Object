package Pertemuan5.Kuis.Soal1;

import java.util.List;
import java.util.ArrayList;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;

    private List<Stock> stockList = new ArrayList<>();

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public Stock tambahStock(int quantity, int shopNo) {
        Stock stockBaru = new Stock(quantity, shopNo, this);
        stockList.add(stockBaru);
        System.out.println("Stok produk '" + productType + "' di toko #" + shopNo
                + " ditambahkan sebanyak " + quantity + " unit.");
        return stockBaru;
    }

    public void addProduct() {
        System.out.println("Produk '" + productType + "' berhasil ditambahkan.");
    }

    public void modifyProduct() {
        System.out.println("Produk '" + productType + "' berhasil diubah.");
    }

    public Product selectProduct(int productId) {
        System.out.println("Menampilkan detail produk id=" + productId);
        return this;
    }

    public String getInfo() {
        return "Product{id=" + productId + ", harga=" + productPrice + ", tipe=" + productType + "}";
    }
}