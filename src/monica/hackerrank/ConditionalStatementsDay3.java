package monica.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatementsDay3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if( N<1 || N>100 ) {
            System.out.println("number out of range");
            return;
        }

        if( N%2 == 1 )
            System.out.println("Weird");
        else if( N==2 || N== 4)
            System.out.println("Not Weird");
        else if( N>=6 && N<=20 )
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

    }
}
/*
Objective
In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

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

Sample Case 0:
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1:
 and  is even, so it is not weird. Thus, we print Not Weird.
 */