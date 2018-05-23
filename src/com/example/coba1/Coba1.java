package com.example.coba1;

import java.util.Scanner;

/**
 *
 */
public class Coba1 {
    public static void main(String[] args) {
        int x;
        String c;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Mencari NAB tertinggi");
            System.out.println("List NAB :");
            System.out.println("1. Rentang NAB 1000-3000");
            System.out.println("2. Rentang NAB 31000-6000");
            System.out.println("3. Rentang NAB 6100-10000");
            System.out.println("Silahkan Masukkan pilihan (1/2/3) :");
            x = input.nextInt();

            switch (x) {
                case 1:
                    int[] nab = {1200, 2500, 3000, 1800};
                    for (int i = 1; i < nab.length; i++) {
                        System.out.println("Perusahaan ke-" + i + ": " + nab[i]);
                    }
                    int max = nab[0];
                    for (int i = 1; i < nab.length; i++) {
                        if (nab[i] > max) max = nab[i];
                    }
                    System.out.println("Nab tertinggi : " + max);
                    break;
                case 2:
                    int[] nab1 = {5000, 3500, 4500, 6000};
                    for (int i = 1; i < nab1.length; i++) {
                        System.out.println("Perusahaan ke-" + i + ": " + nab1[i]);
                    }
                    int max1 = nab1[0];
                    for (int i = 1; i < nab1.length; i++) {
                        if (nab1[i] > max1) max1 = nab1[i];
                    }
                    System.out.println("Nab tertinggi : " + max1);
                    break;
                case 3:
                    int[] nab2 = {6500, 7500, 8000, 9000};
                    for (int i = 1; i < nab2.length; i++) {
                        System.out.println("Perusahaan ke-" + i + ": " + nab2[i]);
                    }
                    int max2 = nab2[0];
                    for (int i = 1; i < nab2.length; i++) {
                        if (nab2[i] > max2) max2 = nab2[i];
                    }
                    System.out.println("Nab tertinggi : " + max2);
                    break;
            }
            System.out.println("Apakah ingin mengulangi(Y/N)?");
            c = input.next();
            System.out.println();
        } while (c.equalsIgnoreCase("y"));
    }
}