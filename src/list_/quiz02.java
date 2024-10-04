package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		
		int choice;
		String namein, telin;
		boolean run = true;
		Scanner sc=new Scanner (System.in);
		ArrayList<String> name = new ArrayList <String> ();
		ArrayList<Integer> phone = new ArrayList <Integer> ();
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 이름 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: //연락처 등록 메뉴
				System.out.print("등록할 이름 : ");
				namein=sc.next();
					if(name.contains(namein)) {
						System.out.println("이미 등록된 이름입니다.");
					} else if(!name.contains(namein)) {
						name.add(sc.next());
				}
				System.out.print("등록할 전화번호 : ");
				phone.add(sc.nextInt());
				System.out.println("등록 성공, 로그인해주세요!");
				
				
			case 2: //이름 검색 메뉴
			case 3: //연락처 삭제 메뉴
			case 4: //모든 연락처 보기 메뉴
			case 5: 
				run=false;
				break;
			
			} //switch문 종료 중괄호
		
		}//while문 종료 중괄호

	}

}
