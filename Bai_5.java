//Bài 5: Tính diện tích, chu vi của hình chữ nhật, khi nhập chiều dài và chiều rộng
package Bai_Tap;

import java.util.Scanner;

public class Bai_5 
	{
	
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				
				System.out.printf("Nhap chieu dai hinh chu nhat: ");
				double chieuDai = scanner.nextDouble();
				
				System.out.printf("Nhap chieu rong hinh chu nhat: ");
				double chieuRong = scanner.nextDouble();
				
				double dienTich = chieuDai*chieuRong;
				double chuVi = 2*(chieuDai+chieuRong);
				
				System.out.println("Dien tich hinh chu nhat la: " +dienTich);
				System.out.println("Chu vi hinh chu nhat la: " +chuVi);
			}

	}
