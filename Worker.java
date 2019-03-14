package Person;

public class Worker extends Person {

    private String managerName;
    private String job;

    public Worker(int id, String name, String surname, int age, String managerName, String job) {
        super(id, name, surname, age);
        this.job = job;
        this.managerName = managerName;
    }

    public String toString() {
        return (super.toString() + "\nManager Name: " + managerName + "\nDepartment: " + job + "\n");
    }
}
