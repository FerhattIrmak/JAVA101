/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asalbulma;

/**
 *
 * @author ferha
 */
public class Asalbulma {

    public static void main(String[] args) {
       // 1-100 arasındaki sayıları bir döngüde tarıyoruz
        for (int i = 2; i <= 100; i++) {
            // Sayımız asaldır
            boolean asal = true;

            // Sayıyı 2'den başlayarak kendisine kadar olan sayılara bölme işlemini yapıyoruz
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // Sayımız asal değildir
                    asal = false;
                    break;
                }
            }

            // Sayımız asal ise ekrana yazdırıyoruz
            if (asal) {
                System.out.println(i);
            }
        }
    }
}
