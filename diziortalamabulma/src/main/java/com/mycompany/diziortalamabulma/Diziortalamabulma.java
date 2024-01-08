package com.mycompany.diziortalamabulma;

public class Diziortalamabulma {

    public static void main(String[] args) {

        int[] list = {1, 2, 5, 7, 4, 54, 234, 32, 6, 34, 23, 4, 543, 5, 64};
        
        double sum = 0;
        
        for (int i = 0; i < list.length; i++){
        
            sum += list[i];
        
    }
        double avarage = sum / list.length;
        
        System.out.println(avarage);
        
    }
}
