package monica.hackerrank;

import java.util.Scanner;

public class LetsReviewDay6 {

    public static void main(String[] args) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if( num <1 || num>10 ) {
            System.out.println("number is too large");
            return;
        }
        scanner.nextLine();
        String[] stringlist = new String[num];
        for( int i=0; i<num; i++) {
            stringlist[i] = scanner.nextLine();
        }
        for(int j=0 ; j<num ; j++) {
            char[] x = stringlist[j].toCharArray();
            StringBuffer even = new StringBuffer();
            StringBuffer odd =new StringBuffer();
            for( int k=0; k<x.length ; k++) {
                if(k%2 == 0) {
                    even.append(x[k]);
                }
                else {
                    odd.append(x[k]);
                }
            }
            System.out.println(even.toString() + " " + odd.toString());
        }
    }

}
