/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class ReadTextFile {
    public static void main(String[] args) {
        List<SanPham> danhSachSanPham = new ArrayList<>();

        // Đọc nội dung file sanpham.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("sanpham.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                String maso = data[0];
                String ten = data[1];
                float gia = Float.parseFloat(data[2]);
                SanPham sp = new SanPham(maso, ten, gia);
                danhSachSanPham.add(sp);
            }
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra: " + e.getMessage());
        }

        // Xuất danh sách sản phẩm ra màn hình
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }
}
