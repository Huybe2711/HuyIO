/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import baitap1.SanPham;
/**
 *
 * @author HOME
 */
public class ReadObject {
    
    public static void main(String[] args) {
        ArrayList<SanPham> ds= null;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream (fis);
            ds =( ArrayList<SanPham>) ois.readObject();
            
            ois.close();
        }catch (Exception ex){
            System.out.println("Loi xay ra:" +ex.toString());
        }
        for (SanPham x : ds){
            System.out.println(x);
        }
    }
}
