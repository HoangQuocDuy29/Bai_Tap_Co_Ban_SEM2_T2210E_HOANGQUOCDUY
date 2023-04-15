/*
 * Bài 1: Hiển thị kết quả như sau nếu nhập 1 số từ bàn phím
Diễn giải:
Nếu nhập 1: thì hiển thị 1 11 111 1111
 */
package Bai_Tap;

import java.util.Scanner;

public class Bai_1 
	{
	
		public static void main(String[] args) 
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhap so: ");
				int n = scanner.nextInt();
				String str = "";
				for(int i = 0;i<n;i++) 
					{
						str += n;
						System.out.printf(str + " "+str+str+" "+str+str+str+" "+str+str+str+str);
					}
		
			}
	
	}
