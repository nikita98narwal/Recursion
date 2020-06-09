package Recursion;

import java.util.Scanner;

public class GridPath {
	static int path(int n, int m) {
		if(n == 1 || m == 1) return 1;
		else return path(n,m-1)+path(m,n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(path(n,m));
		sc.close();
		
	}

}
