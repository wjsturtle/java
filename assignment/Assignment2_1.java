// ST1.0���� 100������ �������� ��� �迭 ����
// ST2.�迭�� �ּҰ��� ���ؼ� 0��° �ڸ��� �ְ�, ���� 0��° �ڸ��� �ִ� ���� �ּҰ��� �ִ� �ڸ��� ����(����). �� ������ �迭�� 0��°���� 29��°���� ���������� ����

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
		System.out.println(Arrays.toString(list));	//�迭 ������������ �����ϱ� ����
		for (int i=0; i<30; i++) {
			int minNumber=Integer.MAX_VALUE;
			int temp=-1;	//�����ϱ� ���� ���� ����		
			for (int j=i; j<30; j++) {	
				if (list[j] < minNumber) {
					minNumber=list[j];	//�ּҰ� ����
					
					temp=list[i];	//���� ����
					list[i]=minNumber;
					list[j]=temp;
				}	
			}			
		}System.out.println(Arrays.toString(list));	//�迭 ������������ ���� ���� 
	}
}

