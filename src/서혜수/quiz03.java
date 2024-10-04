package 서혜수;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int a;
		
		System.out.print("수 입력: ");
		a = sc.nextInt();
		
		if (a%2==0 && a%3==0) {
			System.out.println("2의배수이며 3의배수");
		}else if (a%2!=0 && a%3!=0) {
			System.out.println("2의 배수도, 3의 배수도 아님");
			}
		
		else if(a%2!=0 || a%3!=0) {
			if (a%2 ==0) {
				System.out.println("3의 배수가 아님");
			} else if(a%3==0) {
				System.out.println("2의 배수가 아님");
			}
		}

}
}
