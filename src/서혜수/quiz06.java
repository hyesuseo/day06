package 서혜수;

public class quiz06 {

	public static void main(String[] args) {
		int i=0, sum=0;
		
		for (i =1 ; ; i+=2) {
			sum += i;
			if (sum >=10000) {
				break;
			}
		}
		System.out.println("마지막 수 : "+(i-2));
		System.out.println("i의 총 합: "+ (sum-i));
		

	}

}
