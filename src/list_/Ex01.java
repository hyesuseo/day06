package list_;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
	//ArrayList< String > arr = new ArrayList< String >();
	// 위와 같이<E>에 int로 작성하면 에러발생
	//<String>을 사용하면 에러가 사라짐 => Class자료형만 가능
	
	int num = 100; //기본자료형
	
	Integer i = num; // Wrapper Class : 클래스 자료형
	
	System.out.println("i : "+i);
	System.out.println("num : "+num);
	
	
	ArrayList< Integer > arr = new ArrayList< Integer >();
	// 배열과 다른점?
	// int arr[] = new int [5] ; 이렇게 공간 몇개인지 알려줘야했는데
	//컬렉션 프레임워크는 크기가 가변적이다. 
	arr.add(100);
	arr.add(300);
	System.out.println("arr : "+ arr);
	System.out.println("get(0) : "+arr.get(0) );
	System.out.println("get(1) : "+arr.get(1) );
	
	System.out.println("----------------------");
	int n = arr.get(0); //
	
	for ( int k = 0; k<2 ; k++) {
		System.out.println(arr.get(k));
		}
	}

}
