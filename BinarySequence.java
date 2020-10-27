package recursion;

import java.util.Scanner;

public class BinarySequence {
	static void binary(int a[], int k, int n ) {
		if(k == n) {
			for(int i = 0; i < n; i++)
				System.out.print(a[i]);
			System.out.println();
			return;
		}
		if(a[k-1] == 0) {
			a[k] = 0;
			binary(a, k+1, n);
			a[k] = 1;
			binary(a, k+1, n);
		}
		else {
			a[k] = 0;
			binary(a, k+1, n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0) {
			n = sc.nextInt();
			int a[] = new int[n];
			a[0] = 0;
			binary(a,1,n);
			a[0] = 1;
			binary(a,1,n);
		}
		sc.close();
	}

}
