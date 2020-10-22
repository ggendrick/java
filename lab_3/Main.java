package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Class claasss = new Class(5,4); //пункт 1
        Dog dog = new Dog(); //пункт 2
        dog.bark(1);
        dog.bark(true);
        dog.bark('a');
        dog.bark("abc");
        */
        Money choice = new Money(); //пункт 3
        switch(choice.type){
            case RUB:
                System.out.println("Рубль - денежнгая единица Российской федерации");
                break;
            case USD:
                System.out.println("Доллар-денежнгая единица США");
                break;
            case EUR:
                System.out.println("Евро-денежнгая единица большинства стран Европы");
                break;
            case PND:
                System.out.println("Фунт стерлингов - денежная единица Великобритании и Северной Ирландии");
                break;
            case NIS:
                System.out.println("Новый израильский шейкель - денежная единица Израиля");
                break;
            case GRN:
                System.out.println("Гривна - денежная единица Украины");
                break;}

    }

    }

    class Class{
        String str = "text";
        int a; int b;
        Class(){
            a=0;
            b=0;
        }
        Class(int a,int b){
            this.a=a;
            this.b=b;
        }
        Class(int a,int b, int c){
            this.a=a+b;
            this.b=b+c;
        }
    }
    class Dog{
        void bark(int a){
        System.out.println("лай");}
        void bark(boolean a){
            System.out.println("завывание");
        }
        void bark(String a){
            System.out.println("поскуливание");
        }
        void bark(char a){
            System.out.println("рычание");
        }

    }
    class Money{
        MoneyTypes type;
        Money   (){
            System.out.println("1.Рубль\n2.Доллар\n3.Евро\n4.Фунт\n5.Шейкель\n6.Гривна");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            switch (i){
                case 1:
                    this.type=MoneyTypes.RUB;
                    break;
                case 2:
                    this.type=MoneyTypes.USD;
                    break;
                case 3:
                    this.type=MoneyTypes.EUR;
                    break;
                case 4:
                    this.type=MoneyTypes.PND;
                    break;
                case 5:
                    this.type=MoneyTypes.NIS;
                    break;
                case 6:
                    this.type=MoneyTypes.GRN;
                    break;

            }
             }
    }

    enum MoneyTypes {
        RUB, USD, EUR, PND, NIS, GRN

    }
