import java.util.*;
  import java.io.*;
  
  public class Main {
    static int sumOfSubset(int []a, int n) 
{ 
    int times = (int)Math.pow(2, n - 1); 
  
    int sum = 0; 
  
    for (int i = 0; i < n; i++)  
    { 
        sum = sum + (a[i] * times); 
    } 
  
    return sum; 
} 
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <n; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println(sumOfSubset(arr, n)); 
      }
      
      
         
      
    }
  }