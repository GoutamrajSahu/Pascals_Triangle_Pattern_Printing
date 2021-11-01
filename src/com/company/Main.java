package com.company;

import java.util.Scanner;

class Main {
    static  int fact(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num *= i;
        }
        return num;
    }
    static int getNum(int n, int k){
        int num = fact(n)/(fact(k)*(fact(n-k)));
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int space = num;
        int count = 1;
        int printNum = 1;
        for(int i=0; i<num ; i++){
            for(int j=1; j<space; j++){
                System.out.print(" ");
            }
            for(int z=0; z<count;z++){
                printNum = getNum(i,z);
                System.out.print(" "+ printNum);
            }

            count = count+1;
            space = space-1;
            System.out.print("\n");
        }
    }
}