/**
 * 
 */
package vn.com.stanford.j1220.baitapmangjava;

import java.util.Scanner;

/**
 * @author dangquang
 *
 */
public class Stanford_BaiTapChuoiJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Bài tập 11: Hãy nhập một xâu kí tự. In ra màn hình đảo ngược của xâu đó.
		
		Scanner sc = new Scanner(System.in);
		
		//Khai báo biến
		String chuoi = "";
		
		System.out.println("Nhập vào 1 chuỗi = ");
		
		chuoi = sc.nextLine();
		
		//Chuyển về dạng mảng kí tự
		char kiTu[] = chuoi.toCharArray();
		
		System.out.println("Chuỗi đảo ngược là: ");
		
		for(int i = kiTu.length-1; i>=0; i--)
		{
			System.out.print(kiTu[i]);
		}
		
		//Bài tập 12: Nhập xâu. Thống kê số các chữ số ‘0’, số chữ số ‘1’, ..., số chữ số ‘9’ trong xâu.
		
		int thongKe[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//Xử lý thống kê
		for(int i = 0; i < kiTu.length; i++)
		{
			switch(kiTu[i])
			{
			case '0':
				thongKe[0]++;
				break;
			case '1':
				thongKe[1]++;
				break;
			case '2':
				thongKe[2]++;
				break;
			case '3':
				thongKe[3]++;
				break;
			case '4':
				thongKe[4]++;
				break;
			case '5':
				thongKe[5]++;
				break;
			case '6':
				thongKe[6]++;
				break;
			case '7':
				thongKe[7]++;
				break;
			case '8':
				thongKe[8]++;
				break;
			case '9':
				thongKe[9]++;
				break;
			}
		}
		
		System.out.println("Thống kê số lượng các chữ số: ");
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i + ": " + thongKe[i]);
		}
	}

}
