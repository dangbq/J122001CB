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
public class SinhVien {
    
    private String maSV = "";
    
    private String hoTen;
    private String dienThoai;
    private String email;
    private String diaChi;
    
    /**
     * Hàm khởi tạo không có đối số
     */
    public SinhVien()
    {
        diaChi = "Hà Nội";
    }
    
    /**
     * Hàm khởi tạo có 1 đối số là địa chỉ
     * @param diaChi 
     */
    public SinhVien(String diaChi)
    {
        this.diaChi = diaChi;
    }
    
    /**
     * Hàm khởi tạo có 5 đối số
     * @param maSV
     * @param hoTen
     * @param dienThoai
     * @param email
     * @param diaChi 
     */
    public SinhVien(String maSV, String hoTen, String dienThoai, String email, String diaChi)
    {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }
    
    //Getter: Đọc thông tin
    public String getMaSV()
    {
        return maSV;
    }
    
    //Setter: Ghi thông tin
    public void setMaSV(String maSV)
    {
        if(maSV.startsWith("SF"))
        {
            System.out.println("Đây là học viên của stanford.com.vn");    
        }
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
