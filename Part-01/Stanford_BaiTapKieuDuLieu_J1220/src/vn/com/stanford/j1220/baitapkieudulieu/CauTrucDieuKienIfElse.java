/**
 * 
 */
package vn.com.stanford.j1220.baitapkieudulieu;

import java.util.Scanner;

/**
 * @author dangquang
 *
 */
public class CauTrucDieuKienIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Ví dụ 1: Nhập chiều cao của hai bạn Thu và Nghĩa sau đó xem ai cao hơn
		//Khai báo 1 đối tượng để lấy thông tin từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		//Khai báo biến
		double chieuCaoNghia = 0, chieuCaoThu = 0;
		
		System.out.print("Nhập chiều cao của Nghĩa = ");
		chieuCaoNghia = sc.nextDouble();
		
		System.out.print("Nhập chiều cao của Thu = ");
		chieuCaoThu = sc.nextDouble();
		
		//Sử dụng if else
		if(chieuCaoNghia == chieuCaoThu)//True
		{
			System.out.println("Chiều cao của 2 bạn bằng nhau");
		}
		else//False
		{
			if(chieuCaoNghia > chieuCaoThu)//True
			{
				System.out.println("Chiều cao của Nghĩa cao hơn Thu");
			}
			else//False
			{
				System.out.println("Chiều cao của Nghĩa thấp hơn Thu");
			}
		}
		
		//Ví dụ 2: Nhập vào 2 số thực sau đó tính thương với điều kiện b != 0
		//Khai báo biến
		double a = 0, b = 0, thuong = 0;
		
		System.out.print("Nhập vào số a = ");
		a = sc.nextDouble();
		
		System.out.print("Nhập vào số b = ");
		b = sc.nextDouble();
		
		if(b != 0)//True
		{
			thuong = a / b;
			System.out.printf("Thương của %.1f và %.1f là: %.2f\n", a, b, thuong);
		}
		else
		{
			System.out.println("Bạn phải nhập thương khác 0");
		}
	}

}
