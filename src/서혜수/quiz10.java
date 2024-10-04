package 서혜수;

public class quiz10 {

	public static void main(String[] args) {
		int arr [] = new int [] {4,8,2,7,6};
		
		int change=0, min=0, max=0;
		
		min = arr[0];
		for (int i =0; i<arr.length; i++) {
			if(min>arr[i]) {
				
				change = min;
				min = arr[i];
				arr[0]=change;
				System.out.println(min);
			}
		} 
		
		max = arr[0];
		for (int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				
				change = max;
				max = arr[i];
				arr[0]=change;
				System.out.println(max);
			}
		}
		//최소값, 최대값은 구했는데
	//서로 위치 바꾸는 과정을 못하겠습니다
		
		int tem = 0;
		for (int i =0; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					tem = arr[j];
					arr[j]= arr[i];
					arr[i]=tem;
				}
			}
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}



