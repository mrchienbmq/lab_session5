package sanpham;

import java.util.Scanner;

public class Nhan extends Jewelry {
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
    public double getWeight() {
        return super.getWeight();
    }
    public void setWeight(){
        super.setWeight(weight);
    }

    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }

    public Nhan() {
    }

    public Nhan(int ID, String name, double price, int amount, int weight, String species) {
        super(ID, name, price, amount, weight, species);
    }
    public void nhap(){
        System.out.println("=============================");
        System.out.println("Nhập Thông Tin Nhẫn");
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public void show(){
        super.show();
    }
}
