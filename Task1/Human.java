package Day9.Task1;

public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name + ".");
    }
}
