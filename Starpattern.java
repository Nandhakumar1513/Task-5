package com.task5;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int num=scanner.nextInt();

		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num; j++)
			{
				if (i==j||i+j==num-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
