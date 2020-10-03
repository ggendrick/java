package com.company;
public class Main {
    public static void main(String[] args){
        int arr[] = new int[4];
        int temp=0;
    for(int i=1000;i<9999;i++){
        arr[0]=i/1000;
        arr[1]=(i/100)%10;
        arr[2]=(i%100)/10;
        arr[3]=i%10;
        for(int j = 0;j<4;j++){
            for(int k=0;k<4;k++){
                for(int m=0;m<4;m++){
                    for(int n=0;n<4;n++){ //перебор всех возможных вариантов
                        if((j!=k)&&(j!=m)&&(j!=n)&&(k!=m)&&(k!=n)&&(m!=n)&&((arr[j]*10+arr[k])*(arr[m]*10+arr[n])==i)){//проверка различия цифр
                            if(temp!=i)//проверка повтора вариантов
                            System.out.println(i);
                            temp=i;
                        }
                    }
                }
            }
        }
    }
    }
}