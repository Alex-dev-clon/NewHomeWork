import clients.*;
import employee.Doctor;
import employee.Nurse;
import employee.Personal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal doctor1 = new Doctor("Bob");
        Personal doctor2 = new Doctor("Greg");
        Personal nurse1 = new Nurse("Lila");
        Personal nurse2 = new Nurse("Mary");

        VeterinaryClinic.hirePersonal(doctor1);
        VeterinaryClinic.hirePersonal(doctor2);
        VeterinaryClinic.hirePersonal(nurse1);
        VeterinaryClinic.hirePersonal(nurse2);

        Cat cat1 = new Cat("Cat");
        Dog dog1 = new Dog("Dog");
        Duck duck1 = new Duck("Duck");
        Fish fish1 = new Fish("Fish");

        VeterinaryClinic.getAnimal(cat1);
        VeterinaryClinic.getAnimal(dog1);
        VeterinaryClinic.getAnimal(duck1);
        VeterinaryClinic.getAnimal(fish1);

        System.out.println(VeterinaryClinic.getGoable());
        System.out.println(VeterinaryClinic.getFlyable());
        System.out.println(VeterinaryClinic.getSwimable());

        VeterinaryClinic.showPersonal();
        System.out.println();
        VeterinaryClinic.firePersonal(nurse2);
        VeterinaryClinic.showPersonal();
    }
}
