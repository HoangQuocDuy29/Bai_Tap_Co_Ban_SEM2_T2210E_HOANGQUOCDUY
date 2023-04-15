/*
 * Bài 3: Viết chương trình giải phương trình bậc nhất: ax + b = 0;
Diễn giải:
- Nhập 2 hệ số là số nguyên a, b
- Xét a, rồi tìm x
 */
package Bai_Tap;

import java.util.Scanner;

public class Bai_3 
	{
	
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Nhap he so a: ");
		        int a = scanner.nextInt();
		        
		        System.out.print("Nhap he so b: ");
		        int b = scanner.nextInt();
		
		        if (a == 0) 
			        {
			            if (b == 0) 
				            {
				                System.out.println("Phuong trinh vo so nghiem");
				            } else 
					            {
					                System.out.println("Phuong trinh vo nghiem");
					            }
				     } else 
					     {
					            double x = (double) -b / a;
					            System.out.println("Nghiem cua phuong trinh là: " + x);
					     }
		    
			}
	
	}
