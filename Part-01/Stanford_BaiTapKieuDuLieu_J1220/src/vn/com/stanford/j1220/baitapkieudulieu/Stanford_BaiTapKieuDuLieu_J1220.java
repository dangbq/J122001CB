package vn.com.stanford.j1220.baitapkieudulieu;

import java.util.Scanner;

public class Stanford_BaiTapKieuDuLieu_J1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bài tập 1: Viết câu lệnh khai báo biến để lưu các giá trị sau:
		//− Tuổi của một người
		short tuoiNguoi = 25;
		//− Độ dài cạnh một tam giác
		float canhTamGiac = 12.56f;
		//− Một chữ số
		char chuSo = '9';
		//− Một chữ cái
		char chuCai = 'A';
		//− Số lượng cây trong thành phố
		int soLuongCay = 1000;
		//− Khoảng cách giữa các hành tinh
		double khoangCach = 1234534645.456f;
		//− Nghiệm x của phương trình bậc 1 − Biệt thức Δ của phương trình bậc 2
		float x = 45.346f;
		float delta = 25.6876f;
		
		//In thông tin ra màn hình
		System.out.println("Tuổi của người là: " + tuoiNguoi);
		System.out.printf("Cạnh tam giác = %.1f\n", canhTamGiac);
		System.out.println("Chữ số: " + chuSo);
		System.out.println("Chữ cái: " + chuCai);
		System.out.printf("Số lượng cây: %d\n", soLuongCay);
		System.out.printf("Khoảng cách giữa các hành tinh = %.2f\n", khoangCach);
		System.out.printf("Nghiệm x = %.2f\n", x);
		System.out.printf("Biệt thức delta  = %.2f\n", delta);
		
		//Bài tập 2: Viết câu lệnh nhập vào 4 giá trị lần lượt là số thực, nguyên, nguyên dài và kí
		//tự. In ra màn hình các giá trị này để kiểm tra
		//Khai báo biến
		float soThuc = 0;
		short soNguyen = 0;
		long nguyenDai = 0;
		char kiTu;
		
		//Khai báo 1 đối tượng để nhập thông tin từ bàn phím
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Nhập số thực  = ");
		//Lấy thông tin người dùng nhập từ bàn phím kiểu số thực sau gán cho biến
		soThuc = sc.nextFloat();
		System.out.print("Nhập số nguyên = ");
		soNguyen = sc.nextShort();
		
		System.out.print("Nhập số nguyên dài = ");
		nguyenDai = sc.nextLong();
		
		System.out.print("Nhập kí tự = ");
		//Lấy kí tự đầu tiên trong chuỗi
		kiTu = sc.next().charAt(0);
		
		System.out.printf("Số thực là: %.2f\n", soThuc);
		System.out.printf("Số nguyên là: %d\n", soNguyen);
		System.out.printf("Số nguyên dài là: %d\n", nguyenDai);
		System.out.println("Kí tự là: " + kiTu);
		
		//Bài tập 4: Viết chương trình nhập vào một kí tự. In ra kí tự đó và mã ascii của nó.
		System.out.printf("Kí tự %s có mã ascii là: %d\n", kiTu, (int)kiTu);
		*/
		//Bài tập 7
		//Khai báo biến
		double cau7a = 0, cau7b = 0;
		cau7a = Math.sqrt(3.0 + Math.sqrt(3.0 + Math.sqrt(3.0)));
		cau7b = 1/(2.0 + 1/(2.0 + 1/2.0));
		
		System.out.printf("Câu 7a = %f\n", cau7a);
		System.out.printf("Câu 7b = %f\n", cau7b);
		
		//Bài tập 8
		//Khai báo biến
		double a = 0, b = 0, c = 0, cau8a = 0, cau8b = 0, cau8c = 0, cau8d = 0;
		
		System.out.print("Nhập số a = ");
		a = sc.nextDouble();
		
		System.out.print("Nhập số b = ");
		b = sc.nextDouble();
		
		System.out.print("Nhập số c = ");
		c = sc.nextDouble();
		
		//Tính toán
		cau8a = Math.pow(a, 2) - 2*b + (a*b)/c;
		cau8b = (b*b - 4*a*c)/(2*a);
		cau8c = 3*a - Math.pow(b, 3) - 2*Math.sqrt(c);
		cau8d = (a*a)/b - (4*a)/(b*c) + 1;
		cau8d = Math.sqrt(cau8d);
		
		System.out.printf("Câu 8a = %.2f\n", cau8a);
		System.out.printf("Câu 8b = %.2f\n", cau8b);
		System.out.printf("Câu 8c = %.2f\n", cau8c);
		System.out.printf("Câu 8d = %.2f\n", cau8d);
	}

}
