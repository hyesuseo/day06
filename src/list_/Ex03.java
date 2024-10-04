package list_;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList <String>();
		
		arr.add("홍길동");
		arr.add("aaa");
		arr.add("ccc");

		//List는 비교해주는 기능이 따로 있어서 반복문을 쓸 필요가 없다
		
		System.out.println("arr = "+arr);
		System.out.println(arr.contains("222"));
		boolean bool = arr.contains("홍길동");
		System.out.println("bool = "+bool);
		
		
		//remove 기능
		System.out.println("===================");
		System.out.println("삭제 전 arr: "+arr);
		System.out.println("삭제 전 arr size: "+arr.size());
		arr.remove(1); //index로 삭제하는 방법
		System.out.println("삭제 후 arr: "+arr);
		System.out.println("삭제 후 arr size: "+arr.size());
	
		arr.remove("홍길동"); //data를 삭제하는 방법
		//데이터 입력받아서 다른 변수에 저장한 후 그 변수를 삭제하는 방법 쓸 수 있겠다!
		System.out.println("삭제 후 arr: "+arr);
		System.out.println("삭제 후 arr size: "+arr.size());
	
		
	
	
	}

}
