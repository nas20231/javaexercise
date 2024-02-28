package org.example;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello Word");
        System.out.println("Hello Word Now");
        System.out.print("Hello panda");

        boolean flag;
        float num;
        for (int i=1; i<=5; i++) {
            System.out.print("i = " + i);
        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Nanda AS";
        char q = 'Y';
        boolean flag1 = false;

        int result;
        result = a/b;
        System.out.println(result);

        float resultFloat;
        resultFloat = a/c;
        int resultType = (int) (a/c);
        System.out.println(resultFloat);
        System.out.println(resultType);

        int timeStart = 8;
        int timeFinish =17;
        int waktuSaya = 7;
        int waktuPulang = 14;
        //Karyawan tepat waktu datang dan pulang dapat selamat, karyawan tepat waktu
        //Karyawan pulang cepat di sorki.
        //Karyawan telat, pulang lama, dimaafkan
        //Karyawan datang duluan, pulang cepat, di cengin.

        if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("selamat kamu tepat waktu");
            System.out.println("anda datang " + (timeStart - waktuSaya) + " jam lebih cepat");
            System.out.println("anda pulang" + (waktuPulang - timeFinish) + " jam lebih cepat");
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("dateng awal pulang cepat");

        } else if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaafkan dateng telatnya");
        } else {
            System.out.println("kamu telat nih");
            System.out.println("anda telat " + (waktuSaya - timeStart) + "jam");
            System.out.println(("anda pulang duluan" + (timeFinish - waktuPulang) + "jam lebih cepat"));

        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("saya WFO");
                break;
            case 2:
                System.out.println("saya Libur/Cuti");
                break;
            case 3:
                System.out.println("Liburan alias weekend");
                break;
        }
        System.out.println("test");

        //Loop
        //While dan for loop, foreach
    }
}