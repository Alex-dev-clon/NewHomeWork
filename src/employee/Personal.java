package employee;

public abstract class Personal {
    static int id = 0;

    public Personal() {
        id++;
    }

    public abstract void showInfo();
}
