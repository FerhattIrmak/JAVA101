/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.metodlarlahesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Metodlarlahesapmakinesi {

    static int sum(int a, int b) {

        int result = a + b;
        System.out.println("Toplamları : " + result);
        return a + b;
    }

    static int minus(int a, int b) {

        int result = a - b;
        System.out.println("Çıkarma Sonucu: " + result);
        return result;

    }

    static int carpma(int a, int b) {

        int result = a * b;
        System.out.println("Çarpma Sonucu: " + result);
        return result;

    }

    static int bolme(int a, int b) {

        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan Farklı Olmalı");

        }
        return 0;
    }

    static int power(int a, int b) {

        int result = 1;
        for (int i = 1; i < b; i++) {
            result *= a;

        }

        return result;
    }

    static int mod(int a, int b) {

        return a % b;

    }

    static int calc(int a, int b) {

        System.out.println("Çevresi: " + (2 * (a + b)));
        System.out.println("Alanı: " + (a * b));
        
        return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select;

        String menu = "1-Toplama İşlemi\n2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n4-Bölme İşlemi\n5-Üslü Sayı Hesaplama\n"
                + "6-Mod Alma\n7-Dikdörtgen Alan ve Çevre Hesabı\n0-Çıkış";

        while (true) {
            System.out.println(menu);

            System.out.print("Bir işlem seçiniz: ");

            select = scanner.nextInt();

            if (select == 0) {
                break;
            }

            System.out.println("Bir A sayısı Giriniz: ");

            int a = scanner.nextInt();

            System.out.println("Bir B sayısı Giriniz: ");

            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println(sum(a, b));
                    break;

                case 2:
                    System.out.println(minus(a, b));
                    break;
                case 3:
                    System.out.println(carpma(a, b));
                    break;
                case 4:
                    System.out.println(bolme(a, b));
                    break;
                case 5:
                    System.out.println("Üs Hesabı" + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi" + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz...");
            }

        }

        System.out.println("Güle Güle...");
    }

}
