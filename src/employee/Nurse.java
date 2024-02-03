package employee;

public class Nurse extends Personal {
    private String name;
    private final int id;

    public Nurse(String name) {
        super();
        this.name = name;
        id = Personal.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.print("ID: " + getId() + " ");
        System.out.println("Name: " + getName());
    }
}
