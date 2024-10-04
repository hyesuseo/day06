package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class work_to_do_1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList 정리하고 실습해보기 - 퀴즈 풀던거 마저 풀기
		// 다음에 나갈 진도 예습하기
		//키보드 갖고오기!!!!!
	//to do list app
		
		Scanner sc=new Scanner (System.in);
		ArrayList <String> date = new ArrayList <String> ();
		ArrayList <Integer> no = new ArrayList <Integer> ();
		ArrayList <String> todo = new ArrayList <String> ();
		ArrayList <String> check = new ArrayList <String>();
		boolean run = true;
		int choice, num, index, complt;
		String answer ;
		
		while(run) {
		System.out.println("1. 할 일 입력");
		System.out.println("2. 리스트 삭제");
		System.out.println("3. 끝 난 업 무");
		System.out.println("4. 할일 리스트");
		System.out.print(">>>>>>>");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1 : 
//			System.out.print("날짜(m/d): ");
//			date.add(sc.next());
			System.out.print("no.: ");
			no.add(sc.nextInt());
			System.out.print("todo(띄워쓰기금지):");
			todo.add(sc.next());
			check.add("");
			break;
			
		case 2 : 
			System.out.print("삭제하려는 번호: " );
			num=sc.nextInt();
			index = num;
			System.out.print("정말 삭제할거야? 응/아니: ");
			answer = sc.next();
			if(answer.contains("응")) {
				no.remove(index);
				todo.remove(index);
				check.remove(index);
			}
			else if (answer.contains("아니")) {
				System.out.println("초기화면 돌아간다~");
			}
			else if (no.isEmpty()) {
				System.out.println("저장된 자료 없음~");
			}
			break;//case 2 break;
		
		case 3 :
			System.out.println("완료한 업무번호: ");
			complt = sc.nextInt();
			check.add(complt, "\tV");
			break;
			
		case 4: 
			System.out.println("리스트 보여줄게");
			if (!no.isEmpty()) {
				System.out.println("no.\twork-to-do\tcheck");
				for (int i =0; i<no.size(); i++) {
				System.out.println(no.get(i)+"\t"+todo.get(i)+"\t"+check.get(i));
			}
			}
			else if (no.isEmpty()) {
				System.out.println("저장된 리스트가 없음!");
			}
			
			
		}
		
		
		
		}
	}

}
