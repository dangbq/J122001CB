/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_laptrinhdesktop_j1220;

/**
 *
 * @author dangquang
 */
public class Stanford_LapTrinhDesktop_J1220 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Sử dụng vòng lặp while: ");
        
        //Khai báo biến
        int i = 1;
        
        //Sử dụng vòng lặp để in 10 câu I Love You
        while(i <= 10)
        {
            System.out.println("I Love You " + i);
            i++;//Tăng i lên 1 đơn vị
        }
        
        System.out.println("Sử dụng vòng lặp do while: ");
        do
        {
            System.out.println("Giá trị của i = " + i);
            i++;
        }
        while(i < 20);
            
        System.out.println("Sử dụng vòng lặp for:");
        
        for(int j = 80; j <= 90; j+=2)//i = j + 2
        {
            System.out.println(j);
        }
    }
    
}
