package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> arr= new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		for (int i =0; i<3; i++) {
			System.out.print(i+".번째 입력");
			//String n = input.next();
			//arr.add(n);
			arr.add(input.next()); //이렇게도 쓸 수 있다.
					}
		System.out.println(arr);
		//값 찾기
		System.out.println("찾을 값 입력: ");
		String search = input.next();
		System.out.println("contains: "+ arr.contains(search));
		System.out.println("indexOf: "+ arr.indexOf(search));
	

		//[라면, 김밥, 떡볶이] if 김밥을 다른 값으로 변경하고 싶을 때?
		//김밥이 있는지 찾아서 remove 후 add로 추가
		//변경 후 [라면 , 떡볶이, 순대] 
		//근데 순서가 밀림......ㅜㅜ
		System.out.println("변경할 위치 입력: ");
		int index = input.nextInt();
		System.out.println("변경할 값 입력: ");
		String data = input.next();
		
		arr.set(index, data);
		System.out.println(arr);
		
	
	
	
	
	}
	

}
