package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        fib fibon = new fib(count);
        for(int i=0;i<count;i++){ //доступ к массиву
            System.out.println(fibon.getfibb()[i]);
        }
    }
}}
class fib{
    int[] array;
    public fib(int i){
        int  count = i;
        int[] array = new int[count];
        for(int j = 0;j<count;j++){
            array[j]=this.fibb(count)[j];
            System.out.println(this.fibb(count)[j]);
        }
        this.array=array;

    }
    int[] fibb(int count){
        int[] array= new int[count];
        array[0]=1;
        array[1]=1;
        for(int i =2;i<count;i++){
            array[i]=array[i-2]+array[i-1];
        }
        return array;
    }
    int[] getfibb(){
        return this.array;
    }

}