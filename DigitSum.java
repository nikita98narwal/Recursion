package recursion;

import java.util.Scanner;

public class DigitSum {
	public static int digitSum(int n) {
		if(n == 0)
			return 0;
		return (n%10 + digitSum(n/10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t> 0) {
			int n = sc.nextInt();
			int res = digitSum(n);
			System.out.print(res);
		}
		sc.close();
	}

}
