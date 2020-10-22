import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean end = true;
        int temp;
        int tempd;
        int delete;
        System.out.println("введите количество людей");
        int count =scan.nextInt();
        People array[] = new People[count];
        for(int i =0 ;i<count;i++){
            array[i] = new People();
        }
        while(end){
            System.out.println("выберите объект");
            for(int i =0;i<count;i++){
                System.out.println((i+1)+"."+array[i].name);
            }
            temp=scan.nextInt()-1;
            System.out.println("введите 1,чтобы вывести информацию об объекте");
            System.out.println("введите 2,выйти");
            System.out.println("введите 3, чтобы удалить автомобиль");


            tempd=scan.nextInt();
            switch (tempd){
                case 1:
                    array[temp].getinfo();
                    break;
                case 2:
                    end=false;
                    break;
                case 3:
                    for(int j=0;j<count;j++){
                        array[temp].getcar();
                    }
                    System.out.println("введите номер автомобиля");
                    delete=scan.nextInt()-1;
                    array[temp].delete(delete);


            }
        }
    }
}
class People{
    int count;
    int age;
    String name;
    Cars cars[];
    People(){
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите имя");
        this.name=scan.next();
        System.out.println("введите возраст");
        this.age=scan.nextInt();
        System.out.println("введите количество автомобилей");
        this.count=scan.nextInt();
        this.cars = new Cars[count];
        for(int i = 0;i<count;i++){
            cars[i] = new Cars();
        }}
    void getinfo(){
        System.out.println("имя: "+this.name);
        System.out.println("возраст: "+this.age);
        System.out.println("количество автомобилей: "+this.count);
        System.out.println("список автомобилей: ");
        for(int i = 0;i<count;i++){
            cars[i].getcar();
        }

    }
    void getcar(){
        for(int i = 0;i<count;i++){

            cars[i].getcar();
        }
    }
    void delete(int i){
        int temp;
        Cars cars1[] = new Cars[count-1];
        temp=0;
        for(int k=0;k<count;k++){

            if(i!=k){
                cars1[temp]=this.cars[k];
                temp++;
            }
        }
        this.cars = new Cars[count-1];
        for(int j =0;j<count-1;j++){
            this.cars[j]=cars1[j];
        }
        this.count--;
    }
}
class Cars{
    String name;
    Cars(){
        System.out.println("введите название автомобиля");
        Scanner scan = new Scanner(System.in);
        this.name=scan.next();
    }
    void getcar(){
        System.out.println(this.name);
    }
}
