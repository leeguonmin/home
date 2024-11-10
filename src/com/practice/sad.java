package com.practice;

public class sad {

	public static void main(String[] args) {
		
		int amount;
	    int printf("Enter the amount in won: ");
	    scanf("%d", &amount);

	    int bills_50000 = amount / 50000;
	    amount %= 50000;

	    int bills_10000 = amount / 10000;
	    amount %= 10000;

	    int bills_5000 = amount / 5000;
	    amount %= 5000;

	    int bills_1000 = amount / 1000;
	    amount %= 1000;

	    int coins_500 = amount / 500;
	    amount %= 500;

	    int coins_100 = amount / 100;
	    amount %= 100;

	    int coins_50 = amount / 50;
	    amount %= 50;

	    int coins_1 = amount;  // Remaining amount is in 1-won coins

	    printf("50000-won bills: %d\n", bills_50000);
	    printf("10000-won bills: %d\n", bills_10000);
	    printf("5000-won bills: %d\n", bills_5000);
	    printf("1000-won bills: %d\n", bills_1000);
	    printf("500-won coins: %d\n", coins_500);
	    printf("100-won coins: %d\n", coins_100);
	    printf("50-won coins: %d\n", coins_50);
	    printf("1-won coins: %d\n", coins_1);

	    return 0;

	}

}
