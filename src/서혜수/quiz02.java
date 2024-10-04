package 서혜수;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a, b;
		
		System.out.print("두 수 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ((a+b)%2==0 && (a+b)%3==0) {
			System.out.println("합이 짝수, 3의 배수");
		}else if ((a+b)%2!=0 || (a+b)%3!=0){
			System.out.println("아님");
		}
	}

}
