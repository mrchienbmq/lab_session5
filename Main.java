package sanpham;

import Session4.*;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args ) {

        SanPham sanPham = new SanPham();
        Fashion fashion = new Fashion();
        Jewelry jewelry = new Jewelry();
        Nhan nhan = new Nhan();
        Ao ao = new Ao();
        int tong =0;

        ArrayList<Ao> aoArrayList = new ArrayList<>();
        aoArrayList.add(new Ao());
/*        aoArrayList.add(new Ao());
        aoArrayList.add(new Ao());
        aoArrayList.add(new Ao());
        aoArrayList.add(new Ao());*/
        for (Ao a:aoArrayList){
            a.nhap();
            a.show();
        }

        ArrayList<Nhan> nhanArrayList = new ArrayList<>();
        nhanArrayList.add(new Nhan());
/*        nhanArrayList.add(new Nhan());
        nhanArrayList.add(new Nhan());
        nhanArrayList.add(new Nhan());
        nhanArrayList.add(new Nhan());*/
        for (Nhan na:nhanArrayList){
            na.nhap();
            na.show();
        }
    }
}
