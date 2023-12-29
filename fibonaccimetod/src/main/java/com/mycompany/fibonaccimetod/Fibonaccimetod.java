/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fibonaccimetod;

/**
 *
 * @author ferha
 */
public class Fibonaccimetod {

    static int fib(int n) {

        if (n == 1 || n == 2) {
            
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        
        System.out.println(fib(6));

    }
}
