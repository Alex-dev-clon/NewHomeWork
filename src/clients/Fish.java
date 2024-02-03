package clients;

import interfaces.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    public Fish (String name){
        super(name);
    }
    @Override
    public double swim() {
        System.out.println("Рыба плывёт со скоростью: ");
        return 5.0;
    }
}
