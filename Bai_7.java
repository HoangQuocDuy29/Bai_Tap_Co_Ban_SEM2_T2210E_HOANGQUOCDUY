package Bai_Tap;

import java.util.Scanner;

public class Bai_7 
{

	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Nhap gio bat dau: ");
	        int startHour = sc.nextInt();
	
	        System.out.print("Nhap gio ket thuc: ");
	        int endHour = sc.nextInt();
	
	        if (startHour >= endHour) 
		        {
		            System.out.println("Thoi gian khong hop le!");
		        } else 
			        {
			            int playTime = endHour - startHour;
			            int chargePerHour = (startHour < 18) ? 30000 : 25000;
			            int totalCharge = chargePerHour * playTime;
			
			            System.out.println("So gio choi: " + playTime);
			            System.out.println("Tong tien: " + totalCharge);
			        }
	    }

}
