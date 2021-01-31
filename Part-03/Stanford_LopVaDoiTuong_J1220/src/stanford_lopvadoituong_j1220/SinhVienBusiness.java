/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_lopvadoituong_j1220;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dangquang
 */
public class SinhVienBusiness {
    
    //Khai báo 1 biến toàn cục dạng danh sách SinhVien
    private List<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
    
    /**
     * Hàm lấy danh sách sinh viên
     * @return 
     */
    public List<SinhVien> layDanhSach()
    {
        if(lstSinhVien.isEmpty())
        {
            //Gọi hàm tạo dữ liệu ban đầu
            taoDuLieuBanDau();
        }
        return lstSinhVien;
    }
    
    /**
     * Hàm tạo dữ liệu danh sách sinh viên
     */
    private void taoDuLieuBanDau()
    {
        //Khai báo 1 đối tượng
        SinhVien objThu = new SinhVien();
        
        //Gán giá trị cho các thuộc tính
        objThu.setMaSV("SF001");
        objThu.setHoTen("Đinh Đình Thu");
        objThu.setDienThoai("0903256668");
        objThu.setEmail("thudd@gmail.com");
        
        //Thêm vào danh sách
        lstSinhVien.add(objThu);
        
        //Tạo đối tượng thứ 2
        SinhVien objNghia = new SinhVien("Bắc Ninh");
        objNghia.setMaSV("SF002");
        objNghia.setHoTen("Trương Ngọc Nghĩa");
        objNghia.setDienThoai("0903212568");
        objNghia.setEmail("ngocnghia@gmail.com");
        //Thêm vào danh sách
        lstSinhVien.add(objNghia);
        
        //Tạo đối tượng thứ 3
        SinhVien objHuong = new SinhVien("SF003", "Đào Quốc Hương", "0987223445", "huongdq@yahoo.com", "Nam Định");
        lstSinhVien.add(objHuong);
        
        //Tạo đối tượng thứ 4
        SinhVien objDam = new SinhVien("SF004", "Đinh Thị Đầm", "0987221256", "damdt@gmail.com", "Bắc Giang");
        lstSinhVien.add(objDam);
    }
    
    /**
     * Hàm thực hiện thêm mới 1 sinh viên vào trong hệ thống
     * @param objSV, Đối tượng sinh viên cần thêm
     * @return True nếu thêm thành công, False nếu thất bại
     */
    public boolean themMoi(SinhVien objSV)
    {
        if(objSV != null)
        {
            //Thêm vào danh sách
            lstSinhVien.add(objSV);
            
            return true;
        }
        
        return false;
    }
    
    /**
     * Hàm lấy thông tin chi tiết của sinh viên theo mã sv
     * @param maSV, Mã sinh viên cần lấy chi tiết
     * @return Đối tượng sinh viên chứa thông tin chi tiết nếu có hoặc null
     */
    public SinhVien layChiTietTheoMa(String maSV)
    {
        //Khai báo 1 đối tượng
        SinhVien objSV = null;
        
        //Duyệt danh sách sv trong hệ thống để tìm sinh viên có mã cần tìm
        for(SinhVien sv : lstSinhVien)
        {
            if(sv.getMaSV().equals(maSV))//Nếu thấy mã SV cần tìm
            {
                objSV = sv;
                break;
            }
        }
        
        return objSV;
    }
}
