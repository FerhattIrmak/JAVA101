package com.mycompany.ogrencinotsistemi;

public class OgrenciNotSistemi {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", "0532 532 3232", "TRH");

        Teacher t2 = new Teacher("Anıl", "0532 333 3333", "MAT");

        Teacher t3 = new Teacher("Ahmet", "0532 333 3333", "MAT");

        Course tarih = new Course("Tarih", "101", "TRH");

        Course fizik = new Course("Fizik", "102", "FZK");

        Course biyo = new Course("Biyoloji", "104", "BİO");

        fizik.addTeacher(t2);

        tarih.addTeacher(t1);

        biyo.addTeacher(t3);

        Student s1 = new Student("Salih", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(40, 80, 99);
        s1.isPass();
        
    

        Student s2 = new Student("Barış", "133", "5", tarih, fizik, biyo);
        s2.addBulkExamNote(80, 90, 95);
        s2.isPass();

    }
}
