package Companies;

import Person.Person;
import java.util.ArrayList;

public class Technology extends Company {

    private double marketShare;
    private String country;

    public Technology(int id, String companyName, int numberOfEmployee, String foundationType, ArrayList<Person> employees, double marketShare, String country) {
        super(id, companyName, numberOfEmployee, foundationType, employees);
        this.marketShare = marketShare;
        this.country = country;
    }

    public String toString() {
        return (super.toString() + "\nMarket Share:  " + marketShare + "\nEstablished in:  " + country + "\nReveues:  " + calculateRevenue() + "\nExpenditures:  " + calculateExpenditure() + "\n");
    }

    public double calculateRevenue() {
        double cost = marketShare * 12000, revenue = 0;

        if (cost > 60000) {
            revenue = cost * 3;
        } else if (cost > 90000) {
            revenue = cost * 6;
        } else if (cost > 120000) {
            revenue = cost * 9;
        }
        else
            revenue=1000;

        return revenue;
    }

    public double calculateExpenditure() {
        if (marketShare < 10) {
            return 50000;
        } else if (marketShare < 20) {
            return 150000;
        } else {
            return marketShare * 8000;
        }
    }

}
