/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maxsayibulma;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Maxsayibulma {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir A sayısını Giriniz.");
        a = scanner.nextInt();
        System.out.println("Lütfen bir B sayısını Giriniz.");
        b = scanner.nextInt();
        System.out.println("Lütfen bir C sayısını Giriniz.");
        c = scanner.nextInt();

        if (a > b && a > c) {

            if (b > c) {
                
                System.out.println("Büyükten Küçüğe sıralanış: A > B > C");
                
            } else if (c > b) {
                System.out.println("Büyükten Küçüğe sıralanış: A > C > B");
            }
        }
        if (b > a && b > c) {

            if (a > c) {
                
                System.out.println("Büyükten Küçüğe sıralanış: B > A > C");
                
            } else if (c > a) {
                System.out.println("Büyükten Küçüğe sıralanış: B > C > A");
            }
        }
        if (c > b && c > a) {

            if (b > a) {
                
                System.out.println("Büyükten Küçüğe sıralanış: C > B > A");
                
            } else if (a > b) {
                System.out.println("Büyükten Küçüğe sıralanış: C > A > B");
            }
        }

    }
}
