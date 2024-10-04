package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		
		int choice, telin;
		String namein, yorn;
		boolean run = true;
		Scanner sc=new Scanner (System.in);
		ArrayList<String> name = new ArrayList <String> ();
		ArrayList<Integer> phone = new ArrayList <Integer> ();
		
		while(run) {
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
				if (name.contains(namein)) {
					System.out.println("이미 등록된 이름입니다.");
				}else if (!name.contains(namein)) {
					name.add(namein); 
					System.out.print("등록할 전화번호 : ");
					telin=sc.nextInt();
					if(phone.contains(telin)) {
						System.out.println("이미 등록된 번호입니다");
						name.remove(namein);
					}else if (!phone.contains(telin)) {
						phone.add(telin);
						System.out.println("등록 성공!");
					}
				
				}
				
				System.out.println(name); //입력하는 만큼 쌓인다!
				break; //case 1 break;
				
			case 2: //이름 검색 메뉴
				
				System.out.print("찾으려는 이름: ");
				namein=sc.next();
				
					if (name.contains(namein)) {
					System.out.println("연락처는 "+ phone.get(name.indexOf(namein))+"입니다.");}
					else if (name.isEmpty()) {
						System.out.println("등록된 이름이 없습니다.");
						break;
					}
					else if (!name.contains(namein)) {
						System.out.println("해당이름은 없습니다.");
						break;
					}
				break; //case 2 break;
			case 3: //연락처 삭제 메뉴
				
				System.out.print("삭제하려는 이름: ");
				namein=sc.next();
				int index = name.indexOf(namein);
				if (index != -1) {
				System.out.println("해당 연락처는 "+phone.get(name.indexOf(namein))+ "입니다.");
				System.out.println("정말 삭제하시겠습니까?(y/n)");
				yorn=sc.next();
				if(yorn.contains("y") || yorn.contains("yes")) {
					name.remove(index); 
					phone.remove(index);
					System.out.println("정보가 삭제되었습니다.");
					
				}else if (yorn.contains("n") || yorn.contains("no")) {
					System.out.println("초기화면으로 돌아갑니다");
					System.out.println("=================");
				}
				}
				else if( index == -1) {
					System.out.println("해당 이름은 존재하지 않습니다");
					
				}
				
				break; // case 3 break;
			case 4: //모든 연락처 보기 메뉴
				
					System.out.println("이름\t연락처\t");
					System.out.println("===============");
					for (int i =0; i<name.size(); i++) {
					System.out.println(name.get(i)+"\t"+phone.get(i)+"\t");
					}
					System.out.println("===============");
				break; //case 4 break;
			case 5: 
				run=false;
				System.out.println("시스템을 종료합니다");
				break;
			
			} //switch문 종료 중괄호
		
		}//while문 종료 중괄호

	}

}
