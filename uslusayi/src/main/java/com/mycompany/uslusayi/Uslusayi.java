/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uslusayi;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Uslusayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, k;

        System.out.print("Üssü alınacak sayı: ");

        n = scanner.nextInt();

        System.out.print("Tabanı olcak sayı: ");

        k = scanner.nextInt();
        
        int total = 1;

        int i = 1;

        while (i <= k) {

            total *= n;

            i++;

        }
        System.out.println("Cevap: "+total);
    }
}
