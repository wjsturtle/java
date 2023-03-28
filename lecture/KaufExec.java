import java.util.Scanner;

public class KaufExec{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("체중을 입력하세요(kg): ");
		double weight = scanner.nextDouble();		
		System.out.println("신장을 입력하세요(m): ");
		double height = scanner.nextDouble();		
		System.out.println("카우프 지수는 " + (int) + "입니다");
		
		Kauf kauf = new Kauf();		
		kauf.calculate(weight,height);
	}
}
