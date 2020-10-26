package recursion;
import java.util.Scanner;

public class RecursiveSum {

		public static int sum(int num) {
			if(num != 0)
				return num + sum(num-1);
			return num;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t > 0) {
				int n = sc.nextInt();
				int rec_sum = sum(n);
				System.out.println(rec_sum);
			}
			sc.close();
		}

	}
