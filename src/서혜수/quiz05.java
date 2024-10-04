package 서혜수;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int kor, math, eng, avg, sum;
		
		
		System.out.print("국어점수: ");
		kor = sc.nextInt();
		System.out.print("수학점수: ");
		math = sc.nextInt();
		System.out.print("영어점수: ");
		eng = sc.nextInt();

		sum = kor + math + eng;
		avg = sum/3;
		/*임시*/ System.out.println(avg);
		if (avg >=60 && kor>=40 && math >=40 && eng >=40) {
			System.out.println("합격입니다");
		}
		if (avg <60) {
			System.out.println("평락입니다");
		}
		if (kor<40 || math<40 || eng<40) {
			System.out.println("과락입니다");
		}
		
		if (avg >=90) {
			System.out.println("A등급");
		}else if (avg >=80) {
			System.out.println("B등급"); 
		}else if (avg >=70) {
			System.out.println("C등급");
		}else if (avg >=60) {
			System.out.println("D등급");
		}else if (avg <60) {
			System.out.println("F등급");
		}
		
		
		
		
	}

}
