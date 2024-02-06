package drugStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private final List<Component> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy(Component... components) {
        this.components.addAll(Arrays.asList(components));
    }

    public List <Component> getComponents(){
        return components;
    }
//    public void addComponents(Component... components) {
//        this.components.addAll(Arrays.asList(components));
//    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
/*
В методе compareTo сравниваю объекты по делению суммы массы
на суммы силы всех компонентов внутри лекарства
 */
    @Override
    public int compareTo(Pharmacy o) {
        double weightSum1 = 0;
        double weightSum2 = 0;
        double powerSum1 = 0;
        double powerSum2 = 0;
        for (Component component : this.components){
            weightSum1 += component.getWeight();
            powerSum1 += component.getPower();
        }
        for (Component component : o.components){
            weightSum2 += component.getWeight();
            powerSum2 += component.getPower();
        }
        return Double.compare((weightSum1/powerSum1), (weightSum2/powerSum2));
    }

    @Override
    public String toString() {
        StringBuilder name = new StringBuilder();
        for (Component component : components){
            name.append("Component " + component.getTitle() + ", Weight " + component.getWeight() + ", Power " + component.getPower() + ". ");
        }
        return String.valueOf(name);
    }
}
