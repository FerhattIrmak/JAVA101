package com.mycompany.ogrencinotsistemi;

public class Teacher {

    String name;

    String mpno;

    String branch;

    Teacher(String name, String mpno, String brach) {
        this.name = name;
        this.mpno = mpno;
        this.branch = brach;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon No: " + this.mpno);
        System.out.println("Branşı: " + this.branch);
    }
}
