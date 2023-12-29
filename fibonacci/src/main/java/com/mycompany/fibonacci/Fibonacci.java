/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Fibonacci {

    public static void main(String[] args) {
        // Fibonacci serisinin eleman sayısını kullanıcıdan alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        // Fibonacci serisinin ilk iki elemanını tanımlıyoruz
        int f0 = 0;
        int f1 = 1;

        // Fibonacci serisini oluşturuyoruz
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        // Fibonacci serisini ekrana yazdırıyoruz
        System.out.println("Fibonacci serisi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(f0 + " ");
            f0 = f1;
            f1 = f0 + f1;
        }
    }
}
