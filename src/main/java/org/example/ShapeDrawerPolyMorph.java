package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Ar

public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("selamat datang di ASCII gambar!");
        System.out.println("pilih gambar");
        System.out.println("1. Segitiga siku - siku");
        System.out.println("2. Segitiga sama kaki");
        System.out.println("3. Exit");
    }

    public void drawShape(int choice){
        //conditional menu
        switch (choice){
            case 1:
                System.out.println("masukan berapa tinggi segitiga");
                int height1 = scanner.nextInt();
                new drawTriangelSS().draw(height1, 1);
                break;
            case 2:
                System.out.println("masukan berapa tinggi segitiga");
                int height2 = scanner.nextInt();
                new drawTriangelSK().draw(height2, 2);
                break;
            case 3:
                break;
            default:
                System.out.println("invalid input");
        }

    }


    public void run (){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Masukan pilihan anda");
            try {
                int choice = scanner.nextInt();
                drawShape(choice); //dimana ada kondisional (if else atau switch case)
                System.out.println();
            }catch (InputMismatchException ime){
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }
    }
    public static void main (String[] args){
        //Inherintance (oop)
        //untuk running
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}
