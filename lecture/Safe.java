import java.util.Scanner;

public class Safe {
	int coin=0;
//	String name="돼지";

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<999; i++) {
			System.out.println("원하시는 메뉴를 입력하세요(1:입금, 2:출금, q:종료)");
			String inputString = scanner.nextLine();
			if (inputString.equals("q")) {
				System.out.println("고객님은 입금도 출금도 선택하지 않으셨습니다. 세션이 종료됩니다");
				break;
			}else if (inputString.equals("1")) {
				System.out.println("몇 번 저금통에 입금하시겠습니까? (1:1번 저금통, 2:2번 저금통, 3:3번 저금통");
				inputString = scanner.nextLine(); 
				if (inputString=="1") {
					System.out.println("얼마를 입금하시겠습니까?");
					inputString=scanner.nextLine();
					int inputCoin=Integer.parseInt(inputString);
					System.out.println("땡그랑!");
					this.coin = this.coin + inputCoin;
					System.out.println("현재 보유금액: "+this.coin);
				}else if (inputString=="2") {
					System.out.println("얼마를 입금하시겠습니까?");
					inputString=scanner.nextLine();
					int inputCoin=Integer.parseInt(inputString);
					System.out.println("땡그랑!");
					this.coin = this.coin + inputCoin;
					System.out.println("현재 보유금액: "+this.coin);
				}else {
					System.out.println("얼마를 입금하시겠습니까?");
					inputString=scanner.nextLine();
					int inputCoin=Integer.parseInt(inputString);
					System.out.println("땡그랑!");
					this.coin = this.coin + inputCoin;
					System.out.println("현재 보유금액: "+this.coin);
				}
			}else {
				System.out.println("몇 번 저금통에서 출금하시겠습니까? (1:1번 저금통, 2:2번 저금통, 3:3번 저금통");
				inputString = scanner.nextLine();
				if (inputString=="1") {				
					System.out.println("최종 출금 금액은 "+coin+"입니다");
					System.out.println("출금 후 잔액은 "+0+"원 입니다");
				}else if (inputString=="2") {				
					System.out.println("최종 출금 금액은 "+coin+"입니다");
					System.out.println("출금 후 잔액은 "+0+"원 입니다");
				}else {				
					System.out.println("최종 출금 금액은 "+coin+"입니다");
					System.out.println("출금 후 잔액은 "+0+"원 입니다");
				}			
			}	
		}
	}
}
	
//	public void deposit() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(this.name+" 에 입금 금액을 입력하시오: ");
//		String inputString = scanner.nextLine();
//		int inputCoin = Integer.parseInt(inputString);
//		
//		coin = coin + inputCoin;
//	}
	
//	public void withdraw() {
//		System.out.println("저금통을 깼습니다");
//		System.out.println("최종 출금 금액은"+coin+"입니다"); //+잔액은 얼마입니다
//	}
//	public void setName(String name) {
//		this.name=name;	
//	}
//}
