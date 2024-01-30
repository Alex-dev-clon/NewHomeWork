package clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    @Override
    public void fly() {
        System.out.println("Собаки не летают!");
    }
}
