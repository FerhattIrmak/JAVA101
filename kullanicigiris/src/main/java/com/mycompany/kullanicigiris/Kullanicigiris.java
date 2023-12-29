/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kullanicigiris;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Kullanicigiris {

    public static void main(String[] args) {

        String userName, password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");

        userName = scanner.nextLine();

        System.out.println("Parolanızı giriniz: ");

        password = scanner.nextLine();

        if (userName.equals("Ferhat") && password.equals("Mühendis.72")) {

            System.out.println("Giriş Yaptınız...");

        } else {
            System.out.println("Girdiğiniz bilgiler yanlış.\n Tekrar Deneyiniz.");
        }
    }
}
