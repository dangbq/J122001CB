/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_lopvadoituong_j1220;

/**
 *
 * @author dangquang
 */
public class TinhToan {
    
    final double PI = 3.14f;
    
    private double x = 1;
    
    /**
     * Dạng 1: Hàm không có giá trị trả về và không có tham số truyền vào
     */
    public void inThongTin()
    {
        System.out.println("Hằng số PI = " + PI);   
        System.out.println("Giá trị của x = " + x);
    }
    
    /**Overload
     * Dạng 2: Hàm không có giá trị trả về và có tham số truyền vào
     * @param n 
     */
    public void inThongTin(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.println("I Love You " + i);
        }
    }
    
    /**
     * Dạng 3: Hàm có dữ liệu trả về và không có tham số truyền vào
     * @return 
     */
    public String layTenCongTy()
    {
        return "Stanford - Đào tạo và phát triển công nghệ";
    }
    
    /**
     * Dạng 4: Hàm có giá trị trả về và có tham số truyền vào
     * @param a
     * @param b
     * @return 
     */
    public int tongHaiSo(int a, int b)
    {
        int tong = 0;
        tong = a + b;
        return tong;
    }
    
    /**
     * Hàm tính tổng hai số thực
     * @param a
     * @param b
     * @return 
     */
    public double tongHaiSo(double a, double b)
    {
        return a + b;
    }
}
