import clients.Animal;
import employee.Doctor;
import employee.Nurse;
import employee.Personal;
import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public abstract class VeterinaryClinic {
    static List <Animal> arrayAnimals = new ArrayList<>();
    static List <Personal> arrayPersonal = new ArrayList<>();

    static List <Goable> getGoable (){
        List <Goable> goableList = new ArrayList<>();
        for (Animal animal : arrayAnimals){
            if (animal instanceof Goable) goableList.add((Goable) animal);
        }
        return goableList;
    }
    static List <Flyable> getFlyable (){
        List <Flyable> flyableList = new ArrayList<>();
        for (Animal animal : arrayAnimals){
            if (animal instanceof Flyable) flyableList.add((Flyable) animal);
        }
        return flyableList;
    }
    static List <Swimable> getSwimable (){
        List <Swimable> swimableList = new ArrayList<>();
        for (Animal animal : arrayAnimals){
            if (animal instanceof Goable) swimableList.add((Swimable) animal);
        }
        return swimableList;
    }
    public static void hirePersonal (Personal personal){
        arrayPersonal.add(personal);
    }
    public static void firePersonal (Personal personal){
        arrayPersonal.remove(personal);
    }
    public static void getAnimal (Animal animal){
        arrayAnimals.add(animal);
    }
    public static void removeAnimal (Animal animal){
        arrayAnimals.remove(animal);
    }

    public static void showPersonal (){
        for (Personal personal : arrayPersonal){
            personal.showInfo();
            System.out.println();
        }
    }

    public static String getDoctor(Doctor doctor){
        return doctor.getName();
    }

    public static String getNurse(Nurse nurse){
        return nurse.getName();
    }


//    public static void cure (Animal animal){
//        for (Personal personal : arrayPersonal){
//            if (personal instanceof Doctor) ((Doctor) personal).cure(animal);
//            break;
//        }
//    }
//    public static void cure (Animal animal, Nurse nurse){
//        for (Personal personal : arrayPersonal){
//            if (personal instanceof Doctor) {
//                ((Doctor) personal).cure(animal, nurse);
//                break;
//            }
//        }
//    }
}
