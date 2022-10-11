package com.gokhankaplan.recursiveushesab;

import java.util.Scanner;

public class RecursiveUs {

    static int power(int a, int b){

        int result = 1;
        if (a>0) {
            for (int i = 1; i<=b; i++){
                result *= a;
        }
        }
        else
            return 0;

        return result;
    }

    public static void main(String[] args){
        int a, b;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Taban değerini giriniz: ");
            a = input.nextInt();
            System.out.println("Üs değerini giriniz: ");
            b = input.nextInt();
            System.out.println("Sonuç: " + power(a,b));
        }

    }
}
