/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maashesaplama;

import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Maashesaplama {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Adı : ");
        String name = klavye.nextLine();
        System.out.print("Maaşı : ");
        double salary = klavye.nextDouble();
        System.out.print("Çalışma Saati : ");
        int workHours = klavye.nextInt();
        System.out.print("Başlangıç Yılı : ");
        int hireYear = klavye.nextInt();
        Employe calisan = new Employe(name, salary, workHours, hireYear);
        calisan._toString();
    }
}
