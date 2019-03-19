package sanpham;

import Session5.Human;

import java.util.Scanner;

public class Jewelry extends SanPham {

/*    public int ID;
    public String name;
    public double price;
    public int amount;*/
    public double weight;
    public String species;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Jewelry(){


    }
    public Jewelry(int ID,String name,double price,int amount,int weight,String species){
        super(ID,name,price,amount);
        this.weight = weight;
        this.species= species;
    }
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Trọng Lượng");
        this.weight = scanner.nextDouble();
        System.out.println("Nhập Chủng Loại: ");
        this.species = scanner.nextLine();

    }
    public void show(){
        super.show();
        System.out.println("Trọng Lượng là: "+this.getWeight());
        System.out.println("Chủng Loại: "+this.getSpecies());
    }
    public void lamMoi(){

    }
}
