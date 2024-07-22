package com.task5;

import java.util.Scanner;

public class hoteltariff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Enter the room rent per day: ");
        double rentPerDay = scanner.nextDouble();
        System.out.println("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();

        double tariff = calculateTariff(month, rentPerDay, daysStayed);

        System.out.printf("The hotel tariff to be paid is: %.2f%n", tariff);
    }

    public static double calculateTariff(int month, double rentPerDay, int daysStayed) {
        double tariff = rentPerDay * daysStayed;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                tariff *= 1.2; // 20% increase during peak seasons
                break;
            default:
                break;
        }

        return tariff;
	}

}
