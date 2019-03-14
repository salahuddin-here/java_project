package Companies;

import Person.Person;
import Interfaces.CompanyInterface;
import Interfaces.PersonInterface;
import java.util.ArrayList;

public abstract class Company implements CompanyInterface, PersonInterface {

    protected int id;
    protected String companyName;
    protected int numberOfEmployee;
    protected String foundationType;
    protected ArrayList<Person> employees = new ArrayList<>();

    public Company(int id, String companyName, int numberOfEmployee, String foundationType, ArrayList<Person> employees) {
        this.id = id;
        this.companyName = companyName;
        this.numberOfEmployee = numberOfEmployee;
        this.foundationType = foundationType;
        this.employees = employees;
    }

    public abstract double calculateRevenue();

    public String toString() {
        return ("\nName:  " + companyName + "\n# Employees:  " + numberOfEmployee + "\nFoundation Type:  " + foundationType);
    }

    public boolean addPerson(Person p) {
        for (Person i : employees) {
            if (i.getId() == p.getId()) {
                return false;
            }
        }
        employees.add(p);
        return true;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public boolean removePerson(int id) {
        for (Person i : employees) {
            if (i.getId() == id) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    public Person searchPerson(int id) {
        for (Person i : employees) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Person> displayEmployees() {
        return employees;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberofEmployee() {
        return numberOfEmployee;
    }

}
