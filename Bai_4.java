/*
 * Bài 4: Viết chương trình đổi nhiệt độ C sang nhiệt độ F theo công thức:
doF = doC / 5 * 9 + 32;
Diễn giải:
- Nhập số thực doC từ bàn phím
- Tính doF
 */
package Bai_Tap;

import java.util.Scanner;

public class Bai_4 
	{
	
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				
				System.out.printf("Nhap nhiet do C: ");
				double doC = scanner.nextDouble();
				
				double doF = doC *9/5+32;
						
				System.out.println("Nhiet do F tuong ung la: " + doF);
		
			}
	
	}
