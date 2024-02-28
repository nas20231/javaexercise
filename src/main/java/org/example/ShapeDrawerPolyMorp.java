package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

interface Shape{ //implementation of polymorphism
    void draw(int height, int side);
}
class drawTriangelSS implements Shape {
    @Override//overriding (mengganti secara paksa content dari function dalam polimopirsm)
    public void draw(int height, int side) {
        //nested loop
        //outer loop (take care the rows)
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }
}
class drawTriangelSK implements Shape{
    @Override
    public void draw(int height, int side) {
        //nested loop
        //outer loop (take care the rows)
        for(int i = 1; i <= height; i++){
            for (int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            //inner loop
            System.out.println();

        }
    }
}

