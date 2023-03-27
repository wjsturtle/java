import java.util.Arrays;
import java.util.Scanner;

//st1. 이중배열 만들기
//st2. 합 계산하기


public class Assignment2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr=new int[4][4];	//비어있는 이중배열 생성
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				 String inputString = scanner.nextLine();
				 arr[i][j] = Integer.parseInt(inputString);
			}
		}
		
		for (int i=0; i<3; i++) {	//열의 합
			arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
		}
		
		
		for (int i=0; i<3; i++) {	//행의 합
			arr[3][i] = arr[0][i]+arr[1][i]+arr[2][i];
		}
		
		
		int total=0; 	//[i=3, j=3]
		for (int i=0; i<3; i++) {
			total = total + arr[i][3]+arr[3][i];
		}		
		arr[3][3] = total;

		
		for (int i=0; i<4; i++) {	//이중배열 값 출력
			for (int j=0; j<4; j++) {
				System.out.print(arr[i][j]+"	");
			}System.out.println();				
		}	
	}
}
