import java.lang.String;

public class Car{
    static int countofCars=0;
    String brand;
    int year;
    String color;
    public void carInfo(){
        System.out.println(brand);
        System.out.println(year);
        System.out.println(color);
    }

    public Car(){
        System.out.println("새로운 자동차 객체 생성");
        this.carInfo();
    }

    public Car(String brand,int year){
        System.out.println("새ㄹ운 자동차 객체 생성됨");
        this.brand=brand;
        this.year=year;
        this.color="white";
        this.carInfo();
    }

    public Car(String brand,int year,String color){
        System.out.println("새ㄹ운 자동차 객체 생성됨");
        this.brand=brand;
        this.year=year;
        this.color=color;
        this.carInfo();
    }

    public static void countofCarsInfo(){
        System.out.println("자동차 수량:"+countofCars);
    }
}

