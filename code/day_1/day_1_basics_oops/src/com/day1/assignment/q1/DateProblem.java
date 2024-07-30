package com.day1.assignment.q1;

import java.util.Scanner;

/*
 * we have today date you need to find tommorow date:-
	29-7-2024
	30-7-2024
	
	28-2-2024
	29-2-2024
	
	31-12-2024
	1-1-2025
 */
//it is procedural way
public class DateProblem {

	public static void main(String[] args) {

		int day, month, year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE day part");
		day = scanner.nextInt();

		System.out.println("PE month part");
		month = scanner.nextInt();

		System.out.println("PE year part");
		year = scanner.nextInt();

		System.out.println("current date: " + day + "/" + month + "/" + year);
		// i need to keep track of how many days are thre in every month?

		int daysOfMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// i need to find leap year

		if (isLeapYear(year)) {
			daysOfMonth[2] = 29;
		}
		// 1/13/2024
		// logic of finding next date?
		day = day + 1;
		if (day > daysOfMonth[month]) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}

		}
		
		System.out.println("next date: " + day + "/" + month + "/" + year);
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
