/*
             *
           * *
         * * *
       * * * *
     * * * * *
*/
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int sp = n-1;
        int st = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();

        }
    }
}