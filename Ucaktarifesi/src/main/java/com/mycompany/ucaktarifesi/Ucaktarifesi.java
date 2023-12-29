/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ucaktarifesi;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Ucaktarifesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tip, km, yas, cocuk, genc, yaslı, ergin, indirim;
        double tutar;

        System.out.println("Uçuş tipini seçiniz: \n1-Tek Yön\n2-Gidiş-Dönüş");

        tip = scanner.nextInt();

        System.out.println("Gideceğiniz toplam mesafeti KM cinsinden giriniz: ");

        km = scanner.nextInt();

        System.out.println("Yaşınızı Giriniz: ");

        yas = scanner.nextInt();

        tutar = km * 0.10;

        if (tip == 1) {

            if (yas < 12) {

                tutar = (km * 0.1) - (km * 0.10) * 0.5;
                System.out.println("Toplam Çocuk bİlet tutarınız: " + tutar);

            } else if (12 <= yas && yas <= 24) {

                tutar = (km * 0.1) - (km * 0.10) * 0.1;
                System.out.println("Toplam Genç bİlet tutarınız: " + tutar);

            } else {
                tutar = (km * 0.1) - (km * 0.10) * 0.3;
                System.out.println("Toplam Yaşlı bİlet tutarınız: " + tutar);
            }

        } else if (tip == 2) {

            if (yas < 12) {

                tutar = ((km * 0.1) - (km * 0.10) * 0.5) * 0.8;
                
                
                System.out.println("Toplam Çocuk bİlet tutarınız: " + tutar);

            } else if (12 <= yas && yas <= 24) {

                tutar = ((km * 0.1) - (km * 0.10) * 0.1) * 0.8;
                System.out.println("Toplam Genç bİlet tutarınız: " + tutar);

            } else {
                tutar = ((km * 0.1) - (km * 0.10) * 0.3) * 0.8;
                System.out.println("Toplam Yaşlı bİlet tutarınız: " + tutar);
            }

        }

    }
}
