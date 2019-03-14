package Interfaces;

import Person.Person;
import java.util.ArrayList;

public interface PersonInterface {

    public boolean addPerson(Person x);

    public Person searchPerson(int id);

    public boolean removePerson(int id);

    public ArrayList<Person> displayEmployees();
}
