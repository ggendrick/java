package com.company;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        try{c=a/b;}
        catch (Exception e){
            c=0;
            System.out.println("на 0 делить нельзя");
        }
        System.out.println("деление a на b= "+c);


        try{c=b/a;}
        catch (Exception e){
            c=0;
            System.out.println("на 0 делить нельзя");
        }
        System.out.println("деление b на a= "+c);

    }




}