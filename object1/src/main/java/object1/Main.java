package object1;

import java.util.logging.Logger;

public class Main {


    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person1 = new Person("john",14,137);
        Chair chair = new Chair("Wooden","Brown");
        Dog dog = new Dog(2,"Toy Pom","Male");
        Car car = new Car("Tesla","Model-y",2023,50000);
        System.out.println(person1.height);
        System.out.println(chair);
        System.out.println(dog);
        System.out.println("Car: "+car.getMake()+"Model: "+ car.getModel()+"Mileage"+ car.getMileage()+ "Year: "+car.getYear());


    }


}
