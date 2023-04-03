import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ST1. 저금통 객체배열 및 변수 생성
		System.out.println("저금통을 몇 개 생성하시겠습니까?(1이상 100이하의 숫자를 입력하세요)");
		String inputString = scanner.nextLine();
		int inputNumber = Integer.parseInt(inputString);
		
		System.out.println("저금통 "+inputNumber+"개를 생성하였습니다");
		Safe[] safe = new Safe[inputNumber];
		for (int i = 0; i < inputNumber ; i++) {
			safe[i] = new Safe();			
		}
			
		System.out.println("c: 조회하기");	//ST2. 저금통 선택 및 입출금 묻기(2단 메뉴 만들기)
		System.out.println("q: 종료하기");
		String inputMenuString = scanner.nextLine(); //-> q 및 c를 입력해도 if문에 걸리지 않고 else문으로 넘어가는 이유?
		
		if(inputMenuString=="q") {
			System.out.println("세션을 종료합니다");
			return;
		}
		if(inputMenuString=="c") {
			System.out.println("몇 번째 저금통을 조회하시겠습니까?(0부터 "+(inputNumber-1)+"까지의 숫자를 입력하세요");
			String inputMenuString2 = scanner.nextLine();
			int inputMenuNumber2 = Integer.parseInt(inputMenuString2);
			System.out.println(inputMenuNumber2+"번째 저금통의 잔액을 조회합니다");
			safe[inputMenuNumber2].check();
			
			System.out.println("추가로 입금 혹은 출금을 진행하시겠습니까?( q:종료하기, 1: 입금하기, 2:출금하기)");
			String inputMenuString3 = scanner.nextLine();
			if(inputMenuString3=="q") {
				System.out.println("세션을 종료합니다");
				return;
			}
			if (inputMenuString3=="1") {
				safe[inputMenuNumber2].deposit();
			}
			if (inputMenuString3=="2") {
				safe[inputMenuNumber2].withdraw();
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}		
	}
}
