package list_;

import java.util.ArrayList;


public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList <String>();
	System.out.println("저장 전: "+ arr.size());
	arr.add("111"); arr.add("bbb"); arr.add("333");
	//가변적으로 만들어진다
	System.out.println("저장 후: "+ arr.size());
	System.out.println(arr);
	System.out.println("--------------------");
		for (int i = 0 ; i<arr.size(); i++) {
			//System.out.println(i+"."+arr.get(i));
			String s = arr.get(i);
			System.out.println(i+"."+s);
		}
		
	System.out.println("---for each---");
	for(String st : arr) {
		System.out.println( st );
		
	}
		
	

	}

}
