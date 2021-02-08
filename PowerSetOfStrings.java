import java.util.*;
  import java.io.*;
  
  public class Main {
    static void permuteRec(String str, int n, 
                           int index, String curr) 
    { 
        // base case 
        if (index == n) { 
            return; 
        } 
        System.out.println(curr); 
        for (int i = index + 1; i < n; i++) { 
  
            curr += str.charAt(i); 
            permuteRec(str, n, i, curr); 
  
            // backtracking 
            curr = curr.substring(0, curr.length() - 1); 
        } 
        return; 
    } 
  
    // Generates power set in lexicographic 
    // order. 
    static void powerSet(String str) 
    { 
        char[] arr = str.toCharArray(); 
        Arrays.sort(arr); 
        permuteRec(new String(arr), str.length(), -1, ""); 
    } 
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.next(); 
        powerSet(str); 
      
    }
  }