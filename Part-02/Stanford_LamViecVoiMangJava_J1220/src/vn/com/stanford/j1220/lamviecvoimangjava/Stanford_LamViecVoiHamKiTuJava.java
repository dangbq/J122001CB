/**
 * 
 */
package vn.com.stanford.j1220.lamviecvoimangjava;

/**
 * @author dangquang
 *
 */
public class Stanford_LamViecVoiHamKiTuJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strTenCongTy = "Stanford";
		
		strTenCongTy = strTenCongTy.concat(" - Dạy kinh nghiệm lập trình");
		
		int idx = strTenCongTy.indexOf('t');
		
		System.out.println("Vị trí đầu tiên của kí tự t = " + idx);
		
		idx = strTenCongTy.lastIndexOf('t');
		
		System.out.println("Vị trí cuối cùng của kí tự t = " + idx);
		
		//Lấy chuỗi con
		String tenVietTat = strTenCongTy.substring(0, 9);
		
		System.out.println("Tên viết tắt: " + tenVietTat);
		
		//Chuyển về mảng kí tự
		char arr[] = tenVietTat.toCharArray();
		
		System.out.println("Các kí tự của mảng: ");
		for(char ch : arr)
		{
			System.out.println(ch);
		}
		
		//Khai báo 1 data
		String data = "20;30;60;50";
		
		//Băm chuỗi theo từng dấu ; để đưa về mảng
		String arr1[] = data.split(";");
		
		System.out.println("Các chuỗi số lấy được là: ");
		for(String gt : arr1)
		{
			System.out.println(gt);
		}
	}

}
