// ST1.0부터 100사이의 랜덤값이 담긴 배열 생성
// ST2.배열의 최소값을 구해서 0번째 자리에 넣고, 원래 0번째 자리에 있던 값을 최소값이 있던 자리로 보냄(스왑). 이 과정을 배열의 0번째부터 29번째까지 순차적으로 진행

import java.util.Arrays;
import java.util.Random;

public class Assignment2_1 {
	public static void main(String[] args) { 
		Random random = new Random();		
		
		int[] list = new int [30];	//ST1
		for (int i=0; i<30; i++) {
			int randomNumber = random.nextInt(101);			
			list[i]=randomNumber;
		}
		System.out.println(Arrays.toString(list));	//배열 오름차순으로 정렬하기 이전
		for (int i=0; i<30; i++) {
			int minNumber=Integer.MAX_VALUE;
			int temp=-1;	//스왑하기 위해 변수 생성		
			for (int j=i; j<30; j++) {	
				if (list[j] < minNumber) {
					minNumber=list[j];	//최소값 산출
					
					temp=list[i];	//스왑 실행
					list[i]=minNumber;
					list[j]=temp;
				}	
			}			
		}System.out.println(Arrays.toString(list));	//배열 오름차순으로 정렬 이후 
	}
}

