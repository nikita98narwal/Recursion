package Recursion;

public class SumOfArray {
	static int sum(int A[],int n) {
		if(n <= 0) {
			return 0;
		}
		else {
			return sum(A,n-1) + A[n-1];
		}
	}

	public static void main(String[] args) {
		int n =5;
		int[] arr = {1,2,3,4,5};
		System.out.print(sum(arr,n));
	}

}
