/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usalma;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class UsAlma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        System.out.println(taban + " üzeri " + us + " = " + usAlma(taban, us));
    }

    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }
}
