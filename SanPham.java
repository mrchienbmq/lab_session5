package sanpham;


import java.util.Scanner;

public class SanPham {
    public int ID;
    public String name;
    public double price;
    public int amount;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SanPham(){

    }
    public SanPham(int ID,String name,double price,int amount){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Nhập Thông Tin");*/
        System.out.println("Số Thứ Tự: ");
        this.ID = scanner.nextInt();
        System.out.println("Nhập Tên Sản Phẩm: ");
        this.name = scanner.next();
        System.out.println("Nhập giá Sản Phẩm: ");
        this.price = scanner.nextDouble();
        System.out.println("Nhập Số Lượng: ");
        this.amount = scanner.nextInt();
        System.out.println("=================");
    }
    public void show(){
        System.out.println("Số Thứ Tự: "+this.getID());
        System.out.println("Tên Sản Phẩm: "+this.getName());
        System.out.println("Gía Của Sản Phẩm: "+this.price);
        System.out.println("Nhập số lượng: "+this.getAmount());


    }
}
