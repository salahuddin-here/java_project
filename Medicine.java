package Companies;

import Person.Person;
import java.util.ArrayList;

public class Medicine extends Company {

    private int numberOfProduct;
    private boolean testedOnPeople;

    public Medicine(int id, String companyName, int numberOfEmployee, String foundationType, ArrayList<Person> employees, int numberOfProduct, boolean testOnPeople) {
        super(id, companyName, numberOfEmployee, foundationType, employees);
        this.numberOfProduct = numberOfProduct;
        this.testedOnPeople = testOnPeople;
    }

    public String toString() {
        return (super.toString() + "\n# Product:  " + numberOfProduct + "\nTest on People:  " + testedOnPeople + "\nRevenue:  " + calculateRevenue() + "\nExpenditures:  " + calculateExpenditure() + "\n");
    }

    public double calculateRevenue() {
        double cost = numberOfProduct * 40, revenue = 0;

        if (cost >= 40000) {
            revenue += cost * 2;
        } else if (cost >= 80000) {
            revenue += cost * 4;
        } else if (cost >= 160000) {
            revenue += cost * 8;
        } else {
            revenue += cost * 1;
        }

        return revenue;
    }

    public double calculateExpenditure() {
        double result = 0;
        if (numberOfProduct < 5) {
            result = 50000;
        } else if (numberOfProduct < 10) {
            result = 90000;
        } else {
            result = numberOfProduct * 15000;
        }

        if (testedOnPeople) {
            return result * 2;
        } else {
            return result;
        }

    }
}
