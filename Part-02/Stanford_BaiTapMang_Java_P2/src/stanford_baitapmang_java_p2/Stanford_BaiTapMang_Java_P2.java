/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_baitapmang_java_p2;

import java.util.Scanner;

/**
 *
 * @author dangquang
 */
public class Stanford_BaiTapMang_Java_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Khai báo đối tượng
        Scanner sc = new Scanner(System.in);
        
         //Nhập giá trị n nhỏ hơn 20 sau đó tính tổng các số nguyên tố trong dãy nhỏ hơn hoặc bằng n
        
        //Khai báo biến
        int n = 0, tongNguyenTo = 0;
        
        System.out.print("Nhập dãy gồm n số với n = ");
        
        n = sc.nextInt();
        
        boolean isSoNguyenTo = true;
        
        System.out.println("Các số nguyên tố là: ");
        //Duyệt các số
        for(int i = 2; i <= n; i++)
        {
            isSoNguyenTo = true;
            //Kiểm tra xem có phải là số nguyên tố không
            for(int j = 2; j <= (int)Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    isSoNguyenTo = false;
                    break;
                }
            }
            
            if(isSoNguyenTo)
            {
                System.out.println(i);
                tongNguyenTo += i;
            }
        }
        
        System.out.println("Tổng các số nguyên tố là: " + tongNguyenTo);
    }
    
}
