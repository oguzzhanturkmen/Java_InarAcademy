package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_23 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the coordinate : ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x > 10 / 2 || y > 5 / 2.0)
			System.out.println("Point " + x + "," + y + " is not in the rectangle");
		else
			System.out.println("Point " + x + "," + y + " is  in the rectangle");

	}

}
