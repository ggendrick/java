package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rez="";
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        String temp = "";
        int rank = 6;
        int num[][] = new int[7][7];
        while (scan.length() > 2) {
            temp = String.valueOf(scan.charAt(scan.length() - 3)) + String.valueOf(scan.charAt(scan.length() - 2)) + String.valueOf(scan.charAt(scan.length() - 1));
            num[rank][0] = Integer.parseInt(temp);
            num[rank][1] = rank+1;
            scan = scan.substring(0, scan.length() - 3);
            rank--;
        }
        if (scan.length() == 2) {
            temp = String.valueOf(scan.charAt(scan.length() - 2)) + String.valueOf(scan.charAt(scan.length() - 1));
            num[rank][0] = Integer.parseInt(temp);
            num[rank][1] = rank+1;
            scan = scan.substring(0, scan.length() - 2);
            rank--;
        } else if (scan.length() == 1) {
            temp = String.valueOf(scan.charAt(scan.length() - 1));
            num[rank][0] = Integer.parseInt(temp);
            num[rank][1] = rank+1;
            scan = scan.substring(0, scan.length() - 1);
            rank--;
        }
        Alpha alpha;
        alpha = new Alpha();

        for(int i=0;i<=6;i++){
            if(num[i][1]!=0){
              rez+=  alpha.mainfoo(num[i][0],num[i][1]);
            }
        }
       System.out.println(rez);
}}
 class Alpha {
    String rez;
        public String mainfoo(int num,int info){
          //  String rez ="";
            rez = foo(num);
            if(num>0){
            switch (info){
                case 1:rez+=" quintillion ";
                    break;
                case 2: rez+=" quadrillion ";
                    break;
                case 3: rez+=" trillion ";
                    break;
                case 4: rez+=" billion ";
                    break;
                case 5:rez+=" million ";
                    break;
                case 6:rez+=" thousand ";
                    break;
                case 7:
                    break;

            }}
            return rez;
        }
        public String foo(int num) {
            String rez = "";
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;
            rez=rez+single(a);
            if(num>100){
                rez+=" hundred";
            }
            if((b*10+c<20)&&(b*10+c>10)){
                rez+=" "+tenm(b*10+c);
            }
            else if (b*10+c<10){
                rez+=" "+single(c);
            }
            else{ rez+=" "+ten(b)+" "+single(c);
            }

                return rez;
        }
        public String single(int num) {
            String rez = "";
            switch (num) {
                case 0:
                    break;
                case 1:
                    rez = "one";
                    break;
                case 2:
                    rez = "two";
                    break;
                case 3:
                    rez = "three";
                    break;
                case 4:
                    rez = "four";
                    break;
                case 5:
                    rez = "five";
                    break;
                case 6:
                    rez = "six";
                    break;
                case 7:
                    rez = "seven";
                    break;
                case 8:
                    rez = "eight";
                    break;
                case 9:
                    rez = "nine";
                    break;

            }
            return rez;
        }
        public String tenm (int num) {
            String rez = "";
            switch (num) {
                case 10:
                    rez = "ten";
                    break;
                case 11:
                    rez = "eleven";
                    break;
                case 12:
                    rez = "twelve";
                    break;
                case 13:
                    rez = "thirteen";
                    break;
                case 14:
                    rez = "fourteen";
                    break;
                case 15:
                    rez = "fifteen";
                    break;
                case 16:
                    rez = "sixteen";
                    break;
                case 17:
                    rez = "seventeen";
                    break;
                case 18:
                    rez = "eighteen";
                    break;
                case 19:
                    rez = "nineteen";
                    break;

            }
            return rez;
        }
        public String ten (int num) {
            String rez = "";
            switch (num) {
                case 2:
                    rez = "twenty";
                    break;
                case 3:
                    rez = "thirty";
                    break;
                case 4:
                    rez = "fourty";
                    break;
                case 5:
                    rez = "fifty";
                    break;
                case 6:
                    rez = "sixty";
                    break;
                case 7:
                    rez = "seventy";
                    break;
                case 8:
                    rez = "eighty";
                    break;
                case 9:
                    rez = "ninety";
                    break;
            }
            return rez;
        }
    }