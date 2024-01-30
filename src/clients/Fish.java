package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не летают!");
    }

    @Override
    public void toGo() {
        System.out.println("Рыбы не ходят!");
    }
}
