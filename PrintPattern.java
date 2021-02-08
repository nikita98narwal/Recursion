import java.util.*;
  import java.io.*;
  
  public class Main {
    static void printNum(int n){
      System.out.print(n +" ");
      if(n <= 0)
        return;
      printNum(n-5);
      System.out.print(n +" ");
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        printNum(n);
        System.out.println();
      }
    }
  }