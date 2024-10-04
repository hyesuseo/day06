package 서혜수;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int a, b, c, max, min;
		
		System.out.print("세 수 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		max = a;
		if (max<b) {
			max = b;
		}
		if (max<c) {
			max = c;
		}
		System.out.println("max: "+ max);
		
		min = a;
		if (min>b) {
			min = b;
		}
		if (min>c) {
			min = c;
		}
		System.out.println("min: "+ min);
		
		System.out.println("마지막 수 : "+c);

	}

}
