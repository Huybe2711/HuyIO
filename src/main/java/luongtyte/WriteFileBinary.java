/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luongtyte;

import baitap1.SanPham;
import java.io.*;


/**
 *
 * @author HOME
 */
public class WriteFileBinary {

    public static void main(String[] args) {
        SanPham p = new SanPham("SP1", "Gao", 45000);

        try {
            FileOutputStream fos = new FileOutputStream("sanpham.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(p.getMaso());
            dos.writeUTF(p.getTen());
            dos.writeFloat(p.getGia());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            System.out.println("Da ghi xong");

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("That bai");
        }
    }
}
