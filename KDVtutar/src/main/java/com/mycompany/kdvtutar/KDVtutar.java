/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kdvtutar;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class KDVtutar {

    public static void main(String[] args) {
        
        double kdv,tutar;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Alacağınız ürünün fiyatını yazınız: ");
        
        tutar = scanner.nextInt();
        
        kdv = tutar * 0.18;
        
        System.out.println("Alcağınız ürünün  kdvli fiyatı: " +(kdv + tutar));
        
        System.out.println("Ürünün KDV miktarı: " + kdv);
        
        System.out.println("Alacağınız ürünün kdvsiz fiyatı: " +tutar);
       
    }
}
