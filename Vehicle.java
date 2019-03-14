package Companies;

import Person.Person;
import java.util.ArrayList;

public class Vehicle extends Company {

    private String type;
    private String nameOfVehicle;

    public Vehicle(int id, String companyName, int numberOfEmployee, String foundationType, ArrayList<Person> employees, String type, String nameOfVehicle) {
        super(id, companyName, numberOfEmployee, foundationType, employees);
        this.type = type;
        this.nameOfVehicle = nameOfVehicle;
    }

    public double calculateRevenue() {
        double revenue = 0;

        if (type.equalsIgnoreCase("Car")) {
            revenue = 200000;
        } else if (type.equalsIgnoreCase("Truck")) {
            revenue = 250000;
        } else if (type.equalsIgnoreCase("Ship")) {
            revenue = 175000;
        } else if (type.equalsIgnoreCase("Plane")) {
            revenue = 300000;
        }

        return revenue;
    }

    public double calculateExpenditure() {
        if (type.equalsIgnoreCase("Car")) {
            return 50000;
        } else if (type.equalsIgnoreCase("Truck")) {
            return 100000;
        } else if (type.equalsIgnoreCase("Ship")) {
            return 150000;
        } else if (type.equalsIgnoreCase("Plane")) {
            return 200000;
        } else {
            return 10000;
        }
    }

    public String toString() {
        return (super.toString() + "\nType:  " + type + "\nName of Vehicle:  " + nameOfVehicle + "\nRevenue:  " + calculateRevenue() + "\nExpenditure:  " + calculateExpenditure() + "\n");
    }
}
