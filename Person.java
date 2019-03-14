package Person;

public abstract class Person {

    protected int id, age;
    protected String name, surname;

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return ("\nId: " + id + "\nName and Surname: " + name + " " + surname + "\nAge:" + age);
    }
}
