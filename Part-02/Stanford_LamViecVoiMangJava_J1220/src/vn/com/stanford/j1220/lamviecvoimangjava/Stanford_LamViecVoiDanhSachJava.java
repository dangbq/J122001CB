/**
 * 
 */
package vn.com.stanford.j1220.lamviecvoimangjava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dangquang
 *
 */
public class Stanford_LamViecVoiDanhSachJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//Khai báo 1 mảng động arraylist
		ArrayList arrThongTin = new ArrayList();
		
		//In số lượng phần tử
		System.out.println("Số phần tử: " + arrThongTin.size());
		//Thêm phần tử vào danh sách
		arrThongTin.add("Stanford - Dạy lập trình");
		//In số lượng phần tử
		System.out.println("Số phần tử: " + arrThongTin.size());
		arrThongTin.add("stanford.com.vn");
		//In số lượng phần tử
		System.out.println("Số phần tử: " + arrThongTin.size());
		arrThongTin.add(20);
		
		//In số lượng phần tử
		System.out.println("Số phần tử: " + arrThongTin.size());
		
		arrThongTin.add(new Date());
		
		//Lấy phần tử thứ 2
		System.out.println("Giá trị của phần tử thứ 2: " + arrThongTin.get(1));
		
		System.out.println("Các phần tử của danh sách là: ");
		
		//Duyệt từng phần tử của danh sách
		for(Object giaTri : arrThongTin)
		{
			System.out.println(giaTri);
		}
		
		//Khai báo sử dụng List
		List<String> lstNgonNgu = new ArrayList<String>();
		
		//Thêm thông tin
		lstNgonNgu.add("Java");
		lstNgonNgu.add("Kotlin");
		lstNgonNgu.add("PHP");
		lstNgonNgu.add("Swift");
		
		//Chèn thông tin vào vị trí 2
		lstNgonNgu.add(1, "C#");
		
		System.out.println("Các phần tử của mảng là: ");
		
		for(String gt : lstNgonNgu)
		{
			System.out.println(gt);
		}
	}

}
