package clients;

import com.sun.tools.javac.Main;
import interfaces.Goable;
import interfaces.Swimable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }
    public Cat (String name){
        super(name);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void meow() {
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double run() {
        System.out.println("Кошка бежит со скоростью: ");
        return 10.0;
    }

    @Override
    public double swim() {
        System.out.println("Кошка плывёт со скоростью: ");
        return 1.0;
    }
}
