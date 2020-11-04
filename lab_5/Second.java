package com.company;


import java.io.*;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        BufferedReader bufferedreader = null;
        Scanner scanner = new Scanner(System.in);
        String line;
      try{ File file = new File("text.txt"); //имя файла text.txt
      if(!file.exists()){
          file.createNewFile(); }
          PrintWriter printwriter = new PrintWriter(file);
      for(int i = 0;i<200;i++){
          printwriter.println(i+1+": "+(int)(Math.random()*1000));
        }
        printwriter.close();
        bufferedreader = new BufferedReader(new FileReader("text.txt"));
        int a = scanner.nextInt();
        String a1 = Integer.toString(a);
        for(int i = 0;i<200;i++){
            line=bufferedreader.readLine();
            if(a<10){
                  if(a1.charAt(0)==line.charAt(0)&&line.charAt(1)==':'){
                          System.out.println(line);
                               }
                     }
            else if(a<100){
                  if(a1.charAt(0)==line.charAt(0)&&a1.charAt(1)==line.charAt(1)&&line.charAt(2)==':'){
                 System.out.println(line);
                               }
                     }
            else if(a<1000){
                  if(a1.charAt(0)==line.charAt(0)&&a1.charAt(1)==line.charAt(1)&&a1.charAt(2)==line.charAt(2)&&line.charAt(3)==':'){
            System.out.println(line);
                              }
                    }
        }
      }
      catch (IOException e){
          System.out.println("ошибка создания файла");
      }
}
}




