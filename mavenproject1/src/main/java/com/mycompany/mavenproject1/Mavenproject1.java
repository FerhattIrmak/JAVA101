/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        int mat,fizik,kimya,turkce,ingilizce,muzik;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik Notunuzu giriniz: ");
        
        mat = scanner.nextInt();
        
        System.out.println("fizik notunuz: ");
        
        fizik = scanner.nextInt();
        
        System.out.println("kimya notunuz: ");
        
        kimya = scanner.nextInt();
        
        System.out.println("turkce notunuz: ");
        
        turkce = scanner.nextInt();
        
        System.out.println("ingilizce notunuz: ");
        
        ingilizce = scanner.nextInt();
        
        System.out.println("muzik notunuz: ");
        
        muzik = scanner.nextInt();
        
        double sonuc = (mat + fizik + kimya + turkce + ingilizce + muzik)/6.0;
        
        
        System.out.println("ortalama ders notlarınız: " +sonuc);
        
        
        
    }
}
