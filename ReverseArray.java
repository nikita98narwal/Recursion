package Recursion;

public class ReverseArray {
		static void reverse(int[] arr, int start, int end) {
		int temp;
		if(start > end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse(arr, start+1, end-1);
	}
	
	static void printArray(int[] arr, int n) {
		for(int i = 0; i <n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int start = 0;
		int end = n-1;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr, start, end);
		printArray(arr, n);
	}

}
