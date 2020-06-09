package Recursion;

import java.util.Scanner;

public class SumSeries {
	static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n+sum(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println(sum(n));
		sc.close();
	}

}
