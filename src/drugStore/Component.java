package drugStore;

public abstract class Component implements Comparable<Component> {
    private final String title;
    private final double weight;
    private final int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);
    }
}
