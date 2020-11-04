package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) throws Exception {
    FileReader file1 = new FileReader("t1.txt"); //имена файлов t1.txt , t2.txt
    FileReader file2 = new FileReader("t2.txt");
    Scanner scanfile1 = new Scanner(file1);
    Scanner scanfile2 = new Scanner(file2);
    int count1=0;
    int count2=0;
    String strtemp1;
    String strtemp;
    ArrayList<String> array1 = new ArrayList<String>();
    ArrayList<String> array2 = new ArrayList<String>();
    while(scanfile1.hasNextLine()){ //считывание первого файла в строковый arraylist
        array1.add(scanfile1.nextLine());
        count1++;
    }
    while(scanfile2.hasNextLine()){//считывание второго файла в строковый arraylist
        array2.add(scanfile2.nextLine());
        count2++;
    }
    file1.close();
    file2.close();
    FileWriter filew1 = new FileWriter("t1.txt");
    FileWriter filew2 = new FileWriter("t2.txt");

    for(int i = 0;i<count2;i++){ //запись в первый файл
        strtemp="";
        strtemp1=array2.get(i);
            for(int j=strtemp1.length()-1;j>=0;j--){
                strtemp=strtemp+strtemp1.charAt(j);
            }
            filew1.write(strtemp+"\n");
        }
    for(int i = 0;i<count1;i++){ //запись во второй файл
        strtemp="";
        strtemp1=array1.get(i);
            for(int j=strtemp1.length()-1;j>=0;j--){
                strtemp=strtemp+strtemp1.charAt(j);
            }
            filew2.write(strtemp+"\n");
        }
filew1.close();
filew2.close();

}
}




