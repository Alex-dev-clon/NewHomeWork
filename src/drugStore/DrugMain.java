package drugStore;

import drugStore.components.Azitronite;
import drugStore.components.Penicillin;
import drugStore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugMain {

    public static void main(String[] args) {
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);
        Component water = new Water("Water", 10D, 1);

        Pharmacy p1 = new Pharmacy(azitronite, water);
        Pharmacy p2 = new Pharmacy(penicillin, water);
        Pharmacy p3 = new Pharmacy(azitronite, penicillin);
        Pharmacy p4 = new Pharmacy(azitronite, water, penicillin);
        Pharmacy p5 = new Pharmacy(penicillin);

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);
        pharmacies.add(p4);
        pharmacies.add(p5);

        showPharmacies(pharmacies);
        System.out.println();
        showSortPharmacies(pharmacies);
        System.out.println();
        showSortWeightPharmacies(pharmacies);
    }

    static void showPharmacies (List <Pharmacy> pharmacies){
        for (Pharmacy pharmacy : pharmacies){
            System.out.println(pharmacy);
        }
    }

    static void showSortPharmacies (List <Pharmacy> pharmacies){
        Collections.sort(pharmacies);
        for (Pharmacy pharmacy : pharmacies){
            System.out.println(pharmacy);
        }
    }
/*
Метод для сортировки лекарств по сумме веса компонентов
 */
    static void showSortWeightPharmacies (List <Pharmacy> pharmacies){
        Collections.sort(pharmacies, (o1, o2) -> {
            double weightSum1 = 0;
            double weightSum2 = 0;
            for (Component component : o1.getComponents()) {
                weightSum1 += component.getWeight();
            }
            for (Component component : o2.getComponents()) {
                weightSum2 += component.getWeight();
            }
            return Double.compare((weightSum1), (weightSum2));
        });
        for (Pharmacy pharmacy : pharmacies){
            System.out.println(pharmacy);
        }
    }
}
