package Recursion;

import java.util.Scanner;

public class Power {
	static int stepCount = 0;
	static int power(int a, int b) {
		stepCount++;
		if(b == 0) {
			return 1;
		}
		else {
			return a*power(a,b-1);
		}
	}
	static int fastPow(int a, int b) {
		System.out.println(b);
		stepCount++;
		if(b == 0) return 1;
		if(b % 2 == 0) {
			return fastPow(a*a,b/2);
		}
		return a *fastPow(a,b-1);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(power(a,b));
		System.out.println(stepCount);
		stepCount = 0;
		System.out.println(fastPow(a,b));
		System.out.println(stepCount);
		sc.close();
	}

}
