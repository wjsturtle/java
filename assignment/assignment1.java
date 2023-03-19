import java.util.Random;
import java.util.Scanner;


public class Assignment1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int sumDraw = 0;  //step1-3.가위바위보 결과를 저장할 변수 선언
		int sumWin = 0;
		int sumDefeat = 0;		
		
		for (int i=0; i<99999; i++) { //step2.가위바위보 무한루프
			System.out.println("사용자는 가위바위보를 입력하세요(가위:0, 바위:1, 보:2)"); 
			String userInputString = s.nextLine();
			
			if (userInputString.equals("q")) {
				System.out.println("가위바위보 게임을 종료합니다");
				break;
			} else {		
				int userInputNumber = Integer.parseInt(userInputString); //step1.가위바위보 실시
				Random r = new Random();
				int pcOutputNumber = r.nextInt(3);
				System.out.println("컴퓨터가 낸 가위바위보는 "+pcOutputNumber+"입니다");
				
				if ( userInputNumber==pcOutputNumber ) { //step1-2.결과출력 후 결과카운트
					System.out.println("무승부입니다");
					sumDraw++;
				} else if ( userInputNumber-pcOutputNumber==1  || userInputNumber-pcOutputNumber==-2 ) {
					System.out.println("승리하셨습니다");
					sumWin++;
				} else {
					System.out.println("패배하셨습니다");
					sumDefeat++;
				}
			}
		} 
		System.out.println("무승부한 횟수: "+sumDraw);
		System.out.println("사용자가 승리한 횟수: "+sumWin);
		System.out.println("사용자가 패배한 횟수: "+sumDefeat);
	}
}