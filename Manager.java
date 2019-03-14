package Person;

public class Manager extends Person {

    private String departmentName;
    private int departmentId;

    public Manager(int id, String name, String surname, int age, int departmentId, String dependentName) {
        super(id, name, surname, age);
        this.departmentId = departmentId;
        this.departmentName = dependentName;
    }

    public String toString() {
        return (super.toString() + "\nDeparment Id: " + departmentId + "\nDependent Name: " + departmentName + "\n");
    }
}
