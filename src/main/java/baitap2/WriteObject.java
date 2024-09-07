/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2;
import java.io.FileOutputStream;
import baitap1.SanPham;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author HOME
 */
public class WriteObject {
    
     public static void main(String[] args) {
     ArrayList<SanPham> ds = new ArrayList<>();
     ds.add(new SanPham("SP01", "Gao", 30000));
     ds.add(new SanPham("SP02", "Duong", 45000));
     ds.add(new SanPham("SP03", "Sua", 75000));
     
     try {
         FileOutputStream fos = new FileOutputStream("sanpham.bin");
         ObjectOutputStream oos = new ObjectOutputStream (fos);
         oos.writeObject (ds);
         oos.close();
         System.out.println("Da ghi xong");
         
     }catch (Exception ex) {
         System.out.println("Loi: " + ex.toString());
         System.out.println("That bai");
     }
    }
}
