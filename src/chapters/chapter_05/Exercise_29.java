package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_29 {
	public static void main(String[] args) {
		
		//NOT FINISHED YET !
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year and the first day of the year: ");
		int year = input.nextInt();
		int day = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		for (int i = 2; i < 13; i++) {
			if (i < 9) {
				if (i % 2 == 0) {

					day = (day + 31) % 7;
				}
				if (i % 2 == 1) {
					if (i == 3) {
						if (isLeapYear) {
							day = (day + 29) % 7;
						}
						if (!isLeapYear) {
							day = (day + 28) % 7;
						}
					} else {
						day = (day + 30) % 7;
					}
				}
			}
			if (i > 8) {
				if (i % 2 == 0) {
					day = (day + 30) % 7;
				}
				if (i % 2 == 1) {
					day = (day + 31) % 7;
				}
			}
			
			switch(i) {
			case 2: System.out.printf("%20s %-2d \n%-6s%-6s%-6s%-6s%-6s%-6s%-6s " , "February" , year , "Mon" ,   "Tue", "Wed" , "Thu" , "Fri" , "Sat" , "Sun" );
				for(j = 1 ; j)	
				for(int k = 0; k < day; k++) {
						System.out.print("%-6s" , " ");
					}
			}
	}

	}
}
