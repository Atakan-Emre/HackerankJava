/*
Java If-Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow.
IF (A = TRUE) Then B
Else C
End IF
TRUE
A
FALSE
B
с
Source: Wikipedia
Task
Given an integer, #, perform the following conditional actions:
• If it is odd, print Weird
• If it is even and in the inclusive range of 2 to 5, print Not Weird • If n is even and in the inclusive range of 6 to 20, print Weird
If it is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
Input Format
A single line containing a positive integer, n.
Constraints
• 1 ≤ n ≤ 100
Output Format
Print Weird if the number is weird; otherwise, print Not Weird.
Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird
Explanation
Sample Case 0: n = 3
" is odd and odd numbers are weird, so we print weird.
Sample Case 1: n = 24
n> 20 and n is even, so it isn't weird. Thus, we print Not Weird.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
if(N % 2 == 1 || (N >= 6 && N <= 20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
