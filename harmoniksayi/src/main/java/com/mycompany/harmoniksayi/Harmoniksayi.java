/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.harmoniksayi;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Harmoniksayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("N sayısını giriniz: ");

        int n = scanner.nextInt();
        
        double result = 0;

        for (int i = 1; i <= n; i++) {
            
            result +=(1/i); 
            
        }
        System.out.println(result);
    }
}
