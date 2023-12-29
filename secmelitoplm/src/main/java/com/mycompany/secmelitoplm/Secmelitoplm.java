/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secmelitoplm;
 
import java.util.Scanner;

/**
 *
 * @author ferha
 */
public class Secmelitoplm {

    public static void main(String[] args) {
       
        int n1,n2,select;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ilk sayıyı seçiniz: ");
        
        n1 = scanner.nextInt();
        
        System.out.println("ikinci sayıyı seçiniz: ");
        
        n2 = scanner.nextInt();
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        
        select = scanner.nextInt();
        
        if (select == 1){
        
            System.out.println("İşlem sonucu: " +(n1+n2) );
        }
        else if (select == 2){
            
            System.out.println("İşlem sonucu: " +(n1-n2) );
    }
        else if (select == 3){
            
            System.out.println("İşlem sonucu: " +(n1*n2) );
        }
        else if (select == 4){
            
            System.out.println("İşlem sonucu: " +(n1/n2) );
        }
        
        
    }
}
