import java.util.*;
  import java.io.*;
  
  public class Main {
     static void printRec(String number, 
                         int extraOnes,
                         int remainingPlaces)
    {
        // if number generated
        if (0 == remainingPlaces) {
            System.out.print(number + " ");
            return;
        }
 
        // Append 1 at the current number and
        // reduce the remaining places by one
        printRec(number + "1", extraOnes + 1,
                 remainingPlaces - 1);
 
        // If more ones than zeros, append 0 to the
        // current number and reduce the remaining
        // places by one
        if (0 < extraOnes)
            printRec(number + "0", extraOnes - 1,
                     remainingPlaces - 1);
    }
 
    static void printNums(int n)
    {
        String str = "";
        printRec(str, 0, n);
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
         int n = sc.nextInt();
        printNums(n);
        System.out.println();
      }
     
      
    }
  }