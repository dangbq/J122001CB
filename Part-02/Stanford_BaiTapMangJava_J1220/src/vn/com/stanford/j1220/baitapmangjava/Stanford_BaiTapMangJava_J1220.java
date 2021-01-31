/**
 * 
 */
package vn.com.stanford.j1220.baitapmangjava;

import java.util.Scanner;

/**
 * @author dangquang
 *
 */
public class Stanford_BaiTapMangJava_J1220 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //Khai báo 1 đối tượng để nhập thông tin từ bàn phím
        Scanner sc = new Scanner(System.in);
        /*
        //Bài tập 1
        //Khai báo biến
        int n = 0;
        double tongDay = 0, trungBinh = 0, tongDuong = 0, tongAm = 0, tongChan = 0, tongLe = 0;
        
        System.out.print("Nhập mảng gồm n phần tử n = ");
        
        n = sc.nextInt();
        
        //Khai báo mảng
        double arr[] = new double[n];
        
        System.out.println("Nhập các phần tử cho mảng: ");
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextDouble();
        }
                
        //Tính toán
        for(int i = 0; i < arr.length; i++)
        {
            tongDay += arr[i];
            
            if(arr[i] >= 0)
            {
                tongDuong += arr[i];
            }
            else
            {
                tongAm += arr[i];
            }
            
            if(i%2==0)//Vị trí chẵn
            {
                tongChan += arr[i];//tongChan = tongChan + arr[i]
            }
            else
            {
                tongLe += arr[i];
            }
        }
        
        trungBinh = tongDay/n;
        
        System.out.printf("Tổng dãy là: %.2f\n", tongDay);
        System.out.printf("Trung bình dãy là: %.2f\n", trungBinh);
        System.out.printf("Tổng dương: %.2f\n", tongDuong);
        System.out.printf("Tổng âm: %.2f\n", tongAm);
         System.out.printf("Tổng các số vị trí chẵn: %.2f\n", tongChan);
        System.out.printf("Tổng các số vị trí lẻ: %.2f\n", tongLe);
        
        //Bài tập 2
        //Khai báo biến
        double x = 0;
        
        System.out.print("Nhập giá trị x cần tìm trong dãy x = ");
        
        x = sc.nextDouble();
        
        //Tìm x trong dãy
        for(int i = 0; i < arr.length; i++)
        {
        	//Nếu có giá trị bằng x
        	if(x==arr[i])
        	{
        		System.out.println("Vị trí của x là: " + (i + 1));
        		//Thoát ra khỏi vòng lặp
        		break;
        	}
        }
        
        
        //Bài tập 3
        //Khai báo biến
        double max = arr[0], min = arr[0];
        
        //Duyệt danh sách để tìm max, min
        for(int i = 1; i < arr.length; i++)
        {
        	if(arr[i] > max)
        	{
        		max = arr[i];
        	}
        	
        	if(arr[i] < min)
        	{
        		min = arr[i];
        	}
        }
        
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);
        
        //Bài tập 4
        //Sắp xếp tăng dần
        double temp = 0;
        
        //Xử lý tăng dần
        for(int i = 0; i < arr.length-1; i++)
        {
        	for(int j = i + 1; j < arr.length; j++)
        	{
        		if(arr[j] < arr[i])
        		{
        			//Thực hiện hoán đổi
        			temp = arr[i];
        			
        			arr[i] = arr[j];
        			
        			arr[j] = temp;
        		}
        	}
        }
        
        System.out.println("Dãy sắp xếp tăng dần: ");
        for(int i = 0; i < arr.length; i++)
        {
        	System.out.print(arr[i] + "\t");
        }
        
        System.out.println("");
        
        System.out.println("Sắp xếp giảm dần:");
        
        for(int i = arr.length-1; i >=0; i--)
        {
        	System.out.println(arr[i]);
        }*/
        
        //Bài tập 6
        String tenCongTy = "Stanford - Đào tạo và phát triển công nghệ";
        
        //Chia theo dấu khoảng trắng để lấy từng từ
        String kiTu[] = tenCongTy.split(" ");
        
        System.out.println("Các từ sau khi tách là: ");
        for(String tu : kiTu)
        {
        	System.out.println(tu);
        }
        
        //Bài tập 8
        //Khai báo 1 biến mảng 2 chiều
        int arr[][] = new int[4][4];
        
        //Khai báo mảng số dương, âm
        int arrDuong[] = new int[16], arrAm[] = new int[16], duong = 0, am = 0, tongDuong = 0, tongAm = 0;
        
        System.out.println("Nhập các phần tử cho mảng 4x4:");
        
        for(int i = 0; i < 4; i++)
        {
        	for(int j = 0; j < 4; j++)
        	{
        		System.out.print("arr[" + i + "][" + j + "] = ");
        		arr[i][j] = sc.nextInt();
        	}
        }
        
        //Duyệt vòng lặp để tính toán
        for(int i = 0; i < 4; i++)
        {
        	for(int j = 0; j < 4; j++)
        	{
        			if(arr[i][j] >=0)//Nếu là số dương
        			{
        				arrDuong[duong] = arr[i][j];
        				tongDuong += arr[i][j];
        				duong++;
        			}
        			else
        			{
        				arrAm[am] = arr[i][j];
        				tongAm += arr[i][j];
        				am++;
        			}
        	}
        }
        
        //In kết quả
        System.out.println("Tổng các số dương là: " + tongDuong);
        System.out.println("Các số dương: ");
        for(int i = 0; i < duong; i++)
        {
        	System.out.println(arrDuong[i]);
        }
        
        System.out.println("Tổng các số âm là: " + tongAm);
        System.out.println("Các số âm: ");
        for(int i = 0; i < am; i++)
        {
        	System.out.println(arrAm[i]);
        }
	}

}
