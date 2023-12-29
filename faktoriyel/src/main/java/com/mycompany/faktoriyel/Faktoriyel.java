/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.faktoriyel;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Faktoriyel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktöriyel Sayısını Giriniz: ");

        int n = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;

        }
        
        System.out.println("Faktöriyel: " +total);

    }
}
