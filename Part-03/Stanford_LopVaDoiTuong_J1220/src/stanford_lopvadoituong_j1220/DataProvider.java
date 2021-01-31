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
public class DataProvider {
    
    /**
     * Khai báo 1 hàm trả về đối tượng thuộc lớp SinhVienBusiness ở dạng static để tạo ra 1 kho chung để sử dụng ở nhiều nơi
     */
    private static SinhVienBusiness sinhVienBus = null;
    
    public static SinhVienBusiness getSinhVienBus()
    {
        if(sinhVienBus == null)//Nếu là null
        {
            sinhVienBus = new SinhVienBusiness();
        }
        
        return sinhVienBus;
    }
}
