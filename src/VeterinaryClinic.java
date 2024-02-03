import clients.Animal;
import employee.Personal;
import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VeterinaryClinic {
    static List <Animal> array = Main.arrayAnimals;
    static List <Personal> arrayPersonal = Main.arrayPersonal;

    static List <Goable> getGoable (){
        List <Goable> goableList = new ArrayList<>();
        for (Animal animal : array){
            if (animal instanceof Goable) goableList.add((Goable) animal);
        }
        return goableList;
    }
    static List <Flyable> getFlyable (){
        List <Flyable> flyableList = new ArrayList<>();
        for (Animal animal : array){
            if (animal instanceof Flyable) flyableList.add((Flyable) animal);
        }
        return flyableList;
    }
    static List <Swimable> getSwimable (){
        List <Swimable> swimableList = new ArrayList<>();
        for (Animal animal : array){
            if (animal instanceof Goable) swimableList.add((Swimable) animal);
        }
        return swimableList;
    }

    public static void showPersonal (){
        for (Personal personal : arrayPersonal){
            personal.showInfo();
        }
    }

}
