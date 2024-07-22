package com.task5;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        System.out.println("Pattern Number is : ");
        
        int num = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
	}

}
