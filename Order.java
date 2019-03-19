package sanpham;

import Session5.Human;

import java.util.Scanner;

public class Order extends SanPham {
    public int totalMoney;
    public String listOfProducts;

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(String listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public Order() {

    }

    public Order(int ID, String name, double price, int amount, int totalMoney, String listOfProducts) {
        super(ID, name, price, amount);
        this.totalMoney = totalMoney;
        this.listOfProducts = listOfProducts;
    }
    public double buyProducts() {
        double buy = 0;
        return buy;

    }
}
