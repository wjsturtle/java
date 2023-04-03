import java.util.Scanner;

public class Safe {
	int coin = 0;
		
	public void deposit() {	//ST0. 입금 및 출금 메서드 생성
		System.out.println("얼마를 넣겠습니까?");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int inputNumber = Integer.parseInt(inputString);
		this.coin =  this.coin + inputNumber;
		System.out.println("저금통의 잔액은 "+this.coin+"원 입니다");
	}
	
	public void withdraw() {
		this.coin = this.coin - this.coin;
		System.out.println("출금 후, 저금통의 잔액은 "+this.coin+"원 입니다");
	}
	
	public void check() {
		System.out.println("저금통의 잔액은 "+this.coin+"원 입니다");
	}
}
