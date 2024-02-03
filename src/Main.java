import clients.*;
import employee.Doctor;
import employee.Nurse;
import employee.Personal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Animal> arrayAnimals = new ArrayList<>();
    public static List<Personal> arrayPersonal = new ArrayList<>();

    public static void main(String[] args) {
        Personal doctor1 = new Doctor("Bob");
        Personal doctor2 = new Doctor("Greg");
        Personal nurse1 = new Nurse("Lila");
        Personal nurse2 = new Nurse("Mary");

        arrayPersonal.add(doctor1);
        arrayPersonal.add(doctor2);
        arrayPersonal.add(nurse1);
        arrayPersonal.add(nurse2);

        Cat cat1 = new Cat("Кошка");
        Dog dog1 = new Dog("Собака");
        Duck duck1 = new Duck("Утка");
        Fish fish1 = new Fish("Рыбка");

        arrayAnimals.add(cat1);
        arrayAnimals.add(dog1);
        arrayAnimals.add(duck1);
        arrayAnimals.add(fish1);

        System.out.println(VeterinaryClinic.getGoable());
        System.out.println(VeterinaryClinic.getFlyable());
        System.out.println(VeterinaryClinic.getSwimable());

        VeterinaryClinic.showPersonal();
        VeterinaryClinic.cure(cat1);
    }
}
