package PozostaleZadaniaDomowe;

import javax.crypto.spec.PSource;

public class CarTest {

    public static void main(String[] args) {

        Car car=new Car("opel","astra");
        Car car1=new Car("toyota","corolla");


        System.out.println(car.description());
        System.out.println(car1.description());
        System.out.println(car.getBrand());

        Car[] cars=new Car[2];
        cars[0]=car;
        cars[1]=car1;

        for (Car auto:cars) {
            System.out.println(auto.description());
        }
    }


}
