package chapters.chapter_03.checkpoints_03;

public class Checkpoint_19 {
	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 100);
		
		if(number > 1 && number < 100) {
			System.out.println(number > 1 && number < 100);
		}
		if((number > 1 && number < 100) || number < 0) {
			System.out.println((number > 1 && number < 100) || number < 0);
			
		}
		
		
		
	}
	

}
