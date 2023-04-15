/*
 * Bài 2: Viết chương trình hiển thị kết quả của các phép tính +, -, *, /, % từ 2 số nguyên nhập từ bàn phím.
	Diễn giải:
	- Nhập 2 số nguyên num1, num2
	- Tính và in ra kết quả của các phép tính:
			Num1 + num2
			Num1 - num2
			Num1 * num2
			Num1 / num2
			Num1 % num2
 */
package Bai_Tap;

import java.util.Scanner;

public class Bai_2 
	{
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhap so thu nhat: ");
		        int num1 = scanner.nextInt();
		
		        System.out.print("Nhap so thu hai: ");
		        int num2 = scanner.nextInt();
		
		        int tong = num1 + num2;
		        int hieu = num1 - num2;
		        int tich = num1 * num2;
		        int thuong = num1 / num2;
		        int du = num1 % num2;
		
		        System.out.println(num1 + " + " + num2 + " = " + tong);
		        System.out.println(num1 + " - " + num2 + " = " + hieu);
		        System.out.println(num1 + " * " + num2 + " = " + tich);
		        System.out.println(num1 + " / " + num2 + " = " + thuong);
		        System.out.println(num1 + " % " + num2 + " = " + du);
			}
		
	
	}
