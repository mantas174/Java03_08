package com.company;

import java.util.Scanner;

public class Main {
    private int sk;

    public static void main(String[] args) {

        Main objektas = new Main();

        objektas.ivedimas();
    }
    public void ivedimas(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nurodykite kiek ketinate ivesti skaiciu: ");
        sk = in.nextInt();
        int[] mas = new int[sk];
        for (int i = 0; i < sk; i++){
            System.out.println("Iveskite " +(i+1)+ " skaiciu");
            mas[i] = in.nextInt();
        }
        rezultatas(mas);
    }
    public void rezultatas(int [] masyvas){
        for (int i = 0; i < sk; i++){
            if (masyvas[i] > 100) {
                System.out.println(masyvas[i]);
            }
        }
    }
}
