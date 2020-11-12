package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int temp=-1; //временная переменная
        int temp1=0;//временная переменная
        String tempstr="";//временная переменная
        boolean stat=true; //статус работы цикла
        //Person vasya = new Person("Вася",12,"nokia 3310","76438921231"); // Создание двух экземпляров
        // Person petya = new Person("Петя",12,"siemens c65","79827629911");
        // vasya.getinfo();
        //  petya.getinfo();//вывод данных двух экземпляров
        System.out.println("введите количество объектов");
        int count = scan.nextInt();
        Person[] arr = new Person[count];
        for(int i =0;i<count;i++){              //создание объектов
            System.out.println("создание "+(i+1)+"-того объекта");
            arr[i]= new Person();
            arr[i].Personcreate();
        }
        while(stat==true){
            System.out.println("Выберите объект");
            for(int i=0;i<count;i++){
                System.out.println((i+1)+"."+arr[i].name);
            }
            temp=scan.nextInt()-1; //номер оьъекта
            System.out.println("Выберите действие \n 1.изменить номер телефона \n 2.изменить модель телефона \n 3.показать количество экземпляров \n 4.сравнить по именам\n 5.показать данные\n 6.выход");
            temp1=scan.nextInt(); //выбор действия над объектом
            switch(temp1){
                case 1://изменение номера
                    System.out.println("введите новый номер");
                    tempstr= scan.next();
                    arr[temp].setnumber(tempstr);
                    break;
                case 2://изменение модели телефона
                    System.out.println("введите новую модель телефона");
                    tempstr= scan.next();
                    arr[temp].setmodel(tempstr);
                    break;
                case 3: //вывод количества экземпляров
                    System.out.println("количество экземпляров объекта"+Person.count);
                    break;
                case 4: //сравнение экземпляров
                    System.out.println("введите номер экземпляра для сравнения");
                    for(int i=0;i<count;i++){
                        System.out.println((i+1)+"."+arr[i].name);}
                    temp1= scan.nextInt();
                    arr[temp].nameequal(arr[temp1-1]);
                    break;
                case 5:    arr[temp].getinfo(); //получение информации о объекте
                    break;
                case 6:    stat=false; //выход
            }}

    }}



class Person{ //создание класса
    static int count=0; //количество экземпляров
    public String name;
    public int age;
    public String model;
    public String number;
    Person(){ //конструктор по умолчанию
        count++;
        name="name";
        age=0;
        model="none";
        number="none";
    }
    Person(String name,int age,String model,String number){ //конструктор
        count++;
        this.name=name;
        this.age=age;
        this.model=model;
        this.number=number;
    }
    public void Personcreate(){ //метод создание объекта через консоль
        Scanner scan = new Scanner(System.in);
        System.out.println("введите имя: ");
        String name = scan.next();
        System.out.println("введите возраст: ");
        int age = scan.nextInt();
        System.out.println("введите модель телефона: ");
        String model = scan.next();
        System.out.println("введите номер телефона: ");
        String number = scan.next();
        this.name=name;
        this.age=age;
        this.model=model;
        this.number=number;

    }
    public void getinfo(){ //метод вывода данных
        System.out.println("Имя: "+name+"\n"+"возраст: "+age+"\n"+"модель телефона: "+model+"\n"+"номер телефона: "+number);
    }
    public void setmodel(String model){
        this.model=model;
    } //метод измеения модели телефона
    public void setnumber(String number){ //изменение номера
        if((number.substring(0,2)).equals("+7")&&(number.length()==12)){ //проверка корректности номера
            this.number=number;
            System.out.println("номер изменен");
        }
        else{
            System.out.println("неправильно введен номер");
        }
    }
    public void nameequal(Person p){ //метод сравнения по именам
        if(this.name.equals(p.name)) {
            System.out.println("имена элементов совпадают");}
        else {
            System.out.println("имена элементов не совпадают");
        }


    }
    public void equal(Person p){ //метод сравнения по именам
        if((this.name.equals(p.name))&&(this.model.equals(p.model))&&(this.number.equals(p.number))&&(this.age==p.age)) {
            System.out.println("элементы совпадают");}
        else {
            System.out.println("элементы не совпадают");
        }


    }
}


