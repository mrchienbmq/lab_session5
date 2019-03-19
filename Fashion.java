package sanpham;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Fashion extends SanPham {
/*    public int ID;
    public String name;
    public double price;
    public int amount;*/
    public String size;
    public String color;
    public String trademark;

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public int getAmount() {
        return amount;
    }
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Fashion(){

    }

    public Fashion(int ID,String name,double price,int amount,String size, String color,String trademark){
        super(ID,name,price,amount);
        this.color = color;
        this.size = size;
        this.trademark = trademark;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Màu: ");
        this.color = scanner.next();
        System.out.println("Nhập kích Thức: ");
        this.size = scanner.next();
        System.out.println("Nhập Thương Hiệu: ");
        this.trademark = scanner.next();

    }
    @Override
    public void show(){
        super.show();
 /*       this.getPrice();
        this.getAmount();
        this.getName();
        this.getID();*/
        System.out.println("Màu: " +this.getColor());
        System.out.println("Kích Thước: "+this.size);
        System.out.println("Thương Hiệu: "+this.trademark);

    }
    public void giat(){

    }
    public void lamKho(){

    }
}
