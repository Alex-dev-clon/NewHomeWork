import clients.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();
        Animal animal4 = new Dog();
        Animal animal5 = new Duck();
        Animal animal6 = new Duck();
        Animal animal7 = new Fish();
        Animal animal8 = new Fish();

        animal1.fly();
        animal2.fly();
        animal3.fly();
        animal4.fly();
        animal5.fly();
        animal6.fly();
        animal7.fly();
        animal8.fly();
    }
}
