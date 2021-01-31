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
public class HinhTron {
    
    private final double PI = 3.14f;
    
    private double banKinh = 0;
    
    /**
     * Hàm khởi tạo có 1 tham số truyền vào
     * @param banKinh 
     */
    public HinhTron(double banKinh)
    {
        this.banKinh = banKinh;
    }
    
    /**
     * Hàm tính chu vi hình tròn
     * @return 
     */
    public double chuVi()
    {
        return 2 * PI * banKinh;
    }
    
    /**
     * Hàm tính diện tích hình tròn
     * @return 
     */
    public double dienTich()
    {
        return PI * banKinh * banKinh;
    }
}
