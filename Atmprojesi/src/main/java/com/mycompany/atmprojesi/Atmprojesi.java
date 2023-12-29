/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atmprojesi;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Atmprojesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int right = 3;

        int balance = 2000;

        int select;

        while (right > 0) {

            String userName, password;

            System.out.println("Kullanıcı adınız: ");

            userName = scanner.nextLine();

            System.out.println("Parola: ");

            password = scanner.nextLine();
            if (userName.equals("Ferhat") && password.equals("Mühendis")) {
                System.out.println("MERHABA, Banka Sistemine Başarılı Bir Şekilde Giriş Yaptınız.");
                do {

                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap ");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");

                    select = scanner.nextInt();

                    if (select == 1) {

                        System.out.println("Yatırılacak Para Miktarı: ");
                        int price = scanner.nextInt();
                        balance += price;

                        System.out.println("Güncel Bakiyeniz: " + balance);
                    } else if (select == 2) {

                        System.out.println("Çekilecek Para Miktarı: ");
                        int price = scanner.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye.");
                        } else {
                            balance -= price;

                            System.out.println("Güncel Bakiyeniz: " + balance);
                        }

                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }

                } while (select != 4);

                System.out.println("Tekrar Görüşmek üzere.");
                break;
            } else {
                right--;

                System.out.println("Şifre veya Kullanıcı adı yanlış.\n Tekrar Deneyiniz...");

                if (right == 0) {

                    System.out.println("Hesabınız Bloke Olmuştur.");
                } else {

                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
