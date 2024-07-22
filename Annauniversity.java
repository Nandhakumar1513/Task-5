package com.task5;

import java.util.Scanner;

public class Annauniversity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mark (out of 100): ");
        int mark = scanner.nextInt();

        if (mark > 100) {
            System.out.println("Invalid Input");
        } else {
            String grade = getGrade(mark);
            System.out.println("Your grade is: " + grade);
        }
    }

    public static String getGrade(int mark) {
        if (mark == 100) {
            return "S";
        } else if (mark >= 90 && mark <= 99) {
            return "A";
        } else if (mark >= 80 && mark <= 89) {
            return "B";
        } else if (mark >= 70 && mark <= 79) {
            return "C";
        } else if (mark >= 60 && mark <= 69) {
            return "D";
        } else if (mark >= 50 && mark <= 59) {
            return "E";
        } else {
            return "F";
        }
	}

}
