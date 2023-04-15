//Bài 6: Tính diện tích, chu vi, đường kính của hình tròn khi nhập bán kính từ bàn phím
package Bai_Tap;

import java.util.Scanner;

public class Bai_6 
	{
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Nhap ban kinh hinh tron: ");
	        double banKinh = scanner.nextDouble();
	
	        double dienTich = Math.PI * Math.pow(banKinh, 2);
	        double chuVi = 2 * Math.PI * banKinh;
	        double duongKinh = 2 * banKinh;
	
	        System.out.println("Dien tich hinh tron la: " + dienTich);
	        System.out.println("Chu vi hinh tron la: " + chuVi);
	        System.out.println("Duong kinh hinh tron la: " + duongKinh);
	
		}

}
