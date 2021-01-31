package vn.com.stanford.j1220.cautruclaptrinhjava;

//Khai báo package này để lấy thông tin từ bàn phím
import java.util.Scanner;

public class Stanford_CauTrucLapTrinhJava {

	public static void main(String[] args) {
		
		//Viết code ở đây
		System.out.println("Chào mừng các bạn đến với Java của Stanford.com.vn !");
		
		//Khai báo 1 biến kiểu số nguyên để chứa tuổi
		int tuoiSV = 20;
		
		System.out.println("Tuổi sinh viên là: " + tuoiSV);
		
		//Gán giá trị mới cho tuoiSV lần 1
		tuoiSV = 22;
		System.out.println("Tuổi mới sinh viên là: " + tuoiSV);
		
		//Gán giá trị mới lần 2
		tuoiSV = 25;
		System.out.println("Tuổi sinh viên lần 2 là: " + tuoiSV);
		
		//Khai báo 1 biến kiểu số thực
		float soThuc = 12.576f;
		
		System.out.printf("Số thực là: %.2f\n", soThuc);
		
		//Khai báo 1 biến kiểu kí tự
		char kiTu = 'A';
		
		System.out.printf("Kí tự là: %s\n", kiTu);
		
		//Khai báo 1 chuỗi
		String tenCongTy = "Stanford Dạy lập trình";
		
		System.out.println("Tên công ty là: " + tenCongTy);
		
		//Ví dụ 1: Nhập vào 2 số nguyên từ bàn phím sau đó tính tổng rồi in ra màn hình
		
		//Khai báo 1 đối tượng để lấy dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		//Khai báo biến
		int soa = 0, sob = 0, tong = 0;
		
		//Đưa thông tin và yêu cầu người dùng nhập số a
		
		System.out.print("Nhập số a = ");
		//Lấy dữ liệu từ bàn phím rồi gán cho biến
		soa = sc.nextInt();
		
		System.out.print("Nhập số b = ");
		//Lấy dữ liệu gán cho số b
		sob = sc.nextInt();
		
		//Tính toán
		tong = soa + sob;
		
		System.out.printf("Tổng hai số %d và %d là: %d\n", soa, sob, tong);
		
		//Hàm tính căn
		double giaTri = 0;
		
		giaTri = Math.sqrt(9);
		
		System.out.println("Căn bậc hai là: " + giaTri);
		
		//Hàm số mũ
		giaTri = Math.pow(2, 3);
		
		System.out.println("Giá trị 2^3 là: " + giaTri);
	}

}
