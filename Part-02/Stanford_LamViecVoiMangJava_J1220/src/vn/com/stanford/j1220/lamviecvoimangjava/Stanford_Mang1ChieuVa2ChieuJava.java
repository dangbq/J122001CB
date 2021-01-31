/**
 * 
 */
package vn.com.stanford.j1220.lamviecvoimangjava;

import java.util.Scanner;

/**
 * @author dangquang
 *
 */
public class Stanford_Mang1ChieuVa2ChieuJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ví dụ 1: Khai báo 1 mảng số nguyên gồm 3 phần tử
		int arr[] = new int[3];
		
		//Gán giá trị cho các phần tử
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 6;
		
		//Lấy giá trị của phần tử thứ 2 là
		System.out.println("Giá trị của phần tử thứ 2 là: " + arr[1]);
		
		System.out.println("Các phần tử của mảng số nguyên: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//Khai báo 1 đối tượng để lấy thông tin người dùng nhập từ bàn phím
		Scanner sc = new Scanner(System.in);
		/*
		//Ví dụ 2: Khai báo 1 mảng số thực gồm n phần tử sau đó nhập giá trị cho các phần tử từ bàn phím rồi in màn hình
		//Khai báo biến
		int n = 0;
		
		System.out.print("Nhập vào mảng gồm n phần tử n = ");
		
		//Lấy thông tin từ bàn phím rồi gán cho biến
		n = sc.nextInt();
		
		//Khai báo 1 mảng số thực gồm n phần tử
		double arr1[] = new double[n];
		
		System.out.println("Nhập các phần tử cho mảng: ");
		
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print("arr1[" + i + "] = ");
			arr1[i] = sc.nextDouble();
		}
		
		System.out.printf("Các phần tử của mảng gồm %d là: \n", n);
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + "\t");
		}*/
		
		//Ví dụ 3: Khai báo 1 mảng số nguyên gồm 3 dòng và 2 cột
		/*
		 * a00		a01
		 * a10		a11
		 * a20		a21*/
		 
		//Khai báo biến
		int arr2[][] = new int[3][2];
		
		//Gán giá trị dòng 1
		arr2[0][0] = 2;
		arr2[0][1] = 3;
		//Dòng 2
		arr2[1][0] = 5;
		arr2[1][1] = 6;
		//Dòng 3
		arr2[2][0] = 8;
		arr2[2][1] = 9;
		
		System.out.println("Giá trị của phần tử tại dòng 2 và cột 1: " + arr2[1][0]);
		
		System.out.println("Các phần tử của mảng là: ");
		//Duyệt theo dòng
		for(int i = 0; i < 3; i++)
		{
			//Duyệt theo cột
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr2[i][j] + "\t");
			}
			//Xuống dòng
			System.out.println("");
		}
		
		//Ví dụ 4: Khai báo 1 mảng số thực gồm m dòng và n cột
		//KHai báo biến
		int m = 0, n = 0;
		
		System.out.print("Nhập vào mảng gồm m dòng m = ");
		m = sc.nextInt();
		
		System.out.print("Nhập vào mảng gồm n cột n = ");
		n = sc.nextInt();
		
		//Khai báo mảng
		double arr3[][] = new double[m][n];
		
		System.out.println("Nhập các phần tử cho mảng:");
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("arr3[" + i + "," + j + "] = ");
				//Lấy giá trị người dùng nhập từ bàn phím rồi gán cho các phần tử
				arr3[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("Các phần tử của mảng là: ");
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr3[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}

}
