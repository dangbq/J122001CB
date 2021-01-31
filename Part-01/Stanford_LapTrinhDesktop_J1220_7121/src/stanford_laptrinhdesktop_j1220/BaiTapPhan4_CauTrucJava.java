/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_laptrinhdesktop_j1220;

import java.util.Scanner;

/**
 *
 * @author dangquang
 */
public class BaiTapPhan4_CauTrucJava {
    
    public static void main(String args[])
    {
      
        //Khai báo 1 đối tượng để lấy thông tin nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        /*
          //Bài tập 2 - P4
        //Khai báo biến
        double x = 0, fxa = 0, fxb = 0;
        
        System.out.print("Nhập giá trị của x = ");
        
        x = sc.nextDouble();
        
        if(x > 0)
        {
            fxa = 3*x + Math.sqrt(x);
        }
        else
        {
            fxa = Math.exp(x) + 4;
        }
        
        System.out.printf("Kết quả fxa = %.2f\n", fxa);
        
        //Câu 2b
        if(x >= 1)
        {
            fxb = Math.sqrt(x*x + 1);
        }
        else
        {
            if(x >-1 && x < 1)
            {
                fxb = 3*x + 5;
            }
            else
            {
                fxb = x*x -2*x + 1;
            }
        }
        
         System.out.printf("Kết quả fxb = %.2f\n", fxb);
        
        
        //Bài 3: Nhập vào tuổi cha và tuổi con hiện nay sao cho tuổi cha lớn hơn 2 lần tuổi con. Tìm xem bao nhiêu năm nữa tuổi cha sẽ bằng đúng 2 lần tuổi con (ví dụ 30 và 12, sau 6 năm nữa tuổi cha là 36 gấp đôi tuổi con là 18).
        //Khai báo biến
        int tuoiCha = 0, tuoiCon = 0, soNam = 0;
        
        do
        {
            System.out.print("Nhập tuổi cha = ");
            tuoiCha = sc.nextInt();
            System.out.print("Nhập tuổi con = ");
            tuoiCon = sc.nextInt();
        }
        while(tuoiCha <= 2*tuoiCon);
        
        soNam = tuoiCha - 2*tuoiCon;
        
        tuoiCha = tuoiCha + soNam;
        tuoiCon = tuoiCon + soNam;
        
        System.out.println("Số năm tuổi cha gấp 2 lần con: " + soNam);
        System.out.println("Tuổi mới của cha là: " + tuoiCha);
        System.out.println("Tuổi mới của con là: " + tuoiCon);
        
        //Bài tập 4-P4
        //Khai báo biến
        double S1 = 0, S2 = 0;
        int n = 0;
        
        System.out.print("Nhập vào dãy với n = ");
        
        n = sc.nextInt();
        
        //Sử dụng vòng lặp
        for(int i = 1; i <= n; i++)
        {
            S1 += i;
            S2 += Math.pow(i, 2);
        }
        
        S1 = S1/n;
        S2 = Math.sqrt(S2);
        
        System.out.printf("Câu 4a = %.2f\n", S1);
        System.out.printf("Câu 4b = %.2f\n", S2);*/
        
        //Bài 5-P4
        //Khai báo biến
        int tich = 0, tong = 0, donVi = 0, chuc = 0;
        
        System.out.println("Các số có Tích bằng 2 lần tổng là:");
        //Duyệt vòng lặp 2 số
        for(int i = 10; i <= 99; i++)
        {
            chuc = i/10;
            donVi = i%10;
            tich = chuc * donVi;
            tong = chuc + donVi;
            
            if(tich == 2*tong)
            {
                System.out.println(i);
                        
            }
        }
    }
}
