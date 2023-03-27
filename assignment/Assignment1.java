import java.util.Random;
import java.util.Scanner;


public class Assignment1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int sumDraw = 0;  //step1-3.���������� ����� ������ ���� ����
		int sumWin = 0;
		int sumDefeat = 0;		
		
		for (int i=0; i<99999; i++) { //step2.���������� ���ѷ���
			System.out.println("����ڴ� ������������ �Է��ϼ���(����:0, ����:1, ��:2)"); 
			String userInputString = s.nextLine();0
			
			if (userInputString.equals("q")) {
				System.out.println("���������� ������ �����մϴ�");
				break;
			} else {		
				int userInputNumber = Integer.parseInt(userInputString); //step1.���������� �ǽ�
				Random r = new Random();
				int pcOutputNumber = r.nextInt(3);
				System.out.println("��ǻ�Ͱ� �� ������������ "+pcOutputNumber+"�Դϴ�");
				
				if ( userInputNumber==pcOutputNumber ) { //step1-2.������ �� ���ī��Ʈ
					System.out.println("���º��Դϴ�");
					sumDraw++;
				} else if ( userInputNumber-pcOutputNumber==1  || userInputNumber-pcOutputNumber==-2 ) {
					System.out.println("�¸��ϼ̽��ϴ�");
					sumWin++;
				} else {
					System.out.println("�й��ϼ̽��ϴ�");
					sumDefeat++;
				}
			}
		} 
		System.out.println("���º��� Ƚ��: "+sumDraw);
		System.out.println("����ڰ� �¸��� Ƚ��: "+sumWin);
		System.out.println("����ڰ� �й��� Ƚ��: "+sumDefeat);
	}
}