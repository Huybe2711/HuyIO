/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luongtyte;

import java.io.*;
import baitap1.SanPham;

/**
 *
 * @author HOME
 */
public class ReadFileBinary {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sanpham.dat");
            DataInputStream dis = new DataInputStream(fis);
            String maso = dis.readUTF();
            String ten = dis.readUTF();
            float gia = dis.readFloat();

            SanPham p = new SanPham(maso, ten, gia);

            System.out.println(p);
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
    }
}
