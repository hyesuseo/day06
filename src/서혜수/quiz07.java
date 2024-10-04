package 서혜수;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		int num, sum=0;
		boolean bool = true;
		Scanner sc=new Scanner(System.in);
		
		
		while (bool) {
			System.out.print("10 ~ 20 사이 숫자 입력: ");
			num = sc.nextInt();
		if (num <10 || num>20) {
			System.out.println("범위초과, 숫자 다시 입력");
		}else if (num>=10 && num <=20) {
			bool = false;
			for (int i = 0; i<=num; i++) {
				sum += i;
			}
			System.out.println(num + "까지의 합: "+sum);
		}
	}
	}

}
