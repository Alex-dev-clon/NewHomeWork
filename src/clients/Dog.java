package clients;

import animalInterfaces.Goable;
import animalInterfaces.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    public Dog (String name) {
        super(name);
    }
    @Override
    public double run() {
        System.out.println("Собака бежит со скоростью: ");
        return 10.0;
    }

    @Override
    public double swim() {
        System.out.println("Собака плывёт со скоростью: ");
        return 1.0;
    }
}
