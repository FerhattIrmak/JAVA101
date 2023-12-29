/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.yidizlarlaucgen;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Yidizlarlaucgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(i);

            for (int k = 1; k <= (n - i); k++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");

            }
            
            System.out.println();
        }

    }
}
