package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Value " + ( i + 1 ));
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nguyetu: " + (i+1) + " : " + a[i]);
        }
        int min =a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min =a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Min "+ min);
        System.out.println("Max "+ max);
        int[] d = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    t++;
                }
            }
            if (t == 0) {
                d[s] = a[i];
                s++;
            }
        }
        System.out.println("Cac so nguyen to :");
        for (int i = 0; i < s; i++) {
            System.out.print(" " + d[i]);
        }
        System.out.print("Sap xep tang dan:");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("  "+ a[i]);
        }
    }
}
