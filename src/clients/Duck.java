package clients;

import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimable {

    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }

    public Duck (String name){
        super(name);
    }
    @Override
    public double fly() {
        System.out.println("Утка летит со скоростью: ");
        return 4.0;
    }

    @Override
    public double run() {
        System.out.println("Утка бежит со скоростью: ");
        return 2.0;
    }

    @Override
    public double swim() {
        System.out.println("Утка плывёт со скоростью: ");
        return 3.0;
    }
}
