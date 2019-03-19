package sanpham;

import java.util.Scanner;

public class Ao extends Fashion {
    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getTrademark() {
        return super.getTrademark();
    }

    @Override
    public void setTrademark(String trademark) {
        super.setTrademark(trademark);
    }

    public Ao() {
    }

    public Ao(int ID, String name, double price, int amount, String size, String color, String trademark) {
        super(ID, name, price, amount, size, color, trademark);
    }
    public void nhap(){
        System.out.println("Nhập Thông Tin áo");
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public void show(){
        super.show();
    }
}
