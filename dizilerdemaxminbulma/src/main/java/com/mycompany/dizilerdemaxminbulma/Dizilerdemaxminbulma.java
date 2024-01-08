package com.mycompany.dizilerdemaxminbulma;

public class Dizilerdemaxminbulma {

    public static void main(String[] args) {

        int[] list = {56, 312, 322, 414, 564, 535, 113, 839, 5632, 56, 4};

        int min = list[0];

        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }

            if (i > max) {

                max = i;
            }
        }

        System.out.println("Minimim değer: " + min);
        System.out.println("Maximum değer: " + max);
    }
}
