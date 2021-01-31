/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_lopvadoituong_j1220;

import java.util.Scanner;

/**
 *
 * @author dangquang
 */
public class Stanford_LopVaDoiTuong_J1220 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Khai báo 1 đối tượng
        TinhToan tt = new TinhToan();
        
        System.out.println("Hằng số PI = " + tt.PI);
 
        //Gọi hàm in thông tin lần 1
        tt.inThongTin();
        
        //Lần 2
        tt.inThongTin();
        
        //In ra 10 câu i love you
        tt.inThongTin(10);
        
        //In tên công ty
        System.out.println("Tên công ty là: " + tt.layTenCongTy());
        
        //Tổng hai số nguyên
        int tong = tt.tongHaiSo(5, 4);
        
        System.out.println("Tổng hai số 5 và 4 là: " + tong);
        
        //Khai báo 1 đối tượng lấy thông tin từ bàn phím
        Scanner sc = new Scanner(System.in);
        
        //Khai báo biến
        double soa = 0, sob = 0, sum = 0;
        
        System.out.print("Nhập số a = ");
        soa = sc.nextDouble();
        
        System.out.print("Nhập số b = ");
        sob = sc.nextDouble();
        
        //Gọi hàm tổng
        sum = tt.tongHaiSo(soa, sob);
        
        System.out.println("Tổng hai số là: " + sum);
         
        System.out.printf("Tổng hai số %f và %f là %f\n", soa, sob, sum);
        
        //Khai báo 1 đối tượng
        SinhVien objSV = new SinhVien();
        
        objSV.setMaSV("SF001");
    }
    
}
