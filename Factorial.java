package Recursion;
import java.util.Scanner;

public class Factorial {
//	static int fact(int n) {
//		if(n == 0) return 1;
//		else return n * fact(n-1);
//	}
	
	//ITERATIVE METHOD
//	static int fact(int n) {
//		int res = 1;
//		for(int i = 2; i <= n; i++) {
//			res = res*i;
//		}
//		return res;
//	}
	//While loop
//	static int fact(int n) {
//		int i = n, fac = 1;
//		while(n/i != 0) {
//			fac = fac * (n-1);
//			i--;
//		}
//		return fac;
//	}
	
	//one line solution
	static int fact(int n) {
		return (n==1 || n ==0)? 1 : n * fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fact(n));
		sc.close();
	}
}
