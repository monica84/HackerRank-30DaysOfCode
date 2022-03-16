package monica.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsDay5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if( n <2 || n>20 ) {
            System.out.println("Out of range");
        }
        for( int i=1; i<11 ; i++) {
            System.out.println(n + " x " + i + " = " + n*i );
        }
    }
}
