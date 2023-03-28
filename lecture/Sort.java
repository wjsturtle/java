import java.util.Arrays;
import java.util.Random;

public class Sort {
	public void doSort() {
		int[] numbers = {0,0,0,0,0,0,0,0,0,0,};	//상황에 따라서는 이렇게 배열을 만들어 쓰는것도 괜찮!!
			
			//random값 세팅
			Random random=new Random();	
			for(int i=0; i<numbers.length;i++) {
				//numbers[i]=(int)math.floor(Math.random()*100)+1; <-나중에 써보기 ㅎㅎ 
				numbers[i]=random.nextInt(100)+1;
			}
			System.out.println(Arrays.toString(numbers));
			
//		SORT
//		 1.SELECTION SORT(가장 직관적)
			for (int i=0; i<numbers.length-1; i++) {
				for (int j=i+1;j<numbers.length; j++) {
					if (numbers[i]>numbers[j]) {
						int temp = numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(numbers));
	}
}
