package chapters.chapter_05;

public class Exercise_33 {
	public static void main(String[] args) {
		
		//NOT FINISHED YET
		double sum = 0;
		for(int i = 2; i < 10001; i++) {
			int divisor = 2;
			int number = i;
			while(true) {
				if(number % divisor == 0) {
					number /= divisor;
					sum += divisor;
				}
				else
					divisor++;
				if(number == 1) {
					break;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

}
