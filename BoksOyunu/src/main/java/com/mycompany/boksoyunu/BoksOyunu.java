/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.boksoyunu;

/**
 *
 * @author ferha
 */
public class BoksOyunu {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Selman", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Barış", 20, 50, 85, 10);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
