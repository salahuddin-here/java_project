package Companies;

import java.util.ArrayList;

public class CompanySys {

    public static ArrayList<Company> companyList = new ArrayList<Company>();

    public static boolean addCompany(Company x) {
        if (searchCompany(x.getId()) != null) {
            return false;
        }
        companyList.add(x);
        return true;
    }

    public static Company searchCompany(int id) {
        for (int i = 0; i < companyList.size(); i++) {
            if (id == companyList.get(i).getId()) {
                return companyList.get(i);
            }
        }
        return null;
    }

    public static Company searchCompanyWithName(String name) {
        for (int i = 0; i < companyList.size(); i++) {
            if (name.equalsIgnoreCase(companyList.get(i).getCompanyName())) {
                return companyList.get(i);
            }
        }
        return null;
    }

    public static boolean removeCompany(int id) {
        if (searchCompany(id) != null) {
            companyList.remove(searchCompany(id));
            return true;
        }
        return false;
    }

    public static String getAllCompanies() {
        String out = "";
        for (Company c : companyList) {
            out += c.toString();
        }
        return out;
    }

    public static String getSelectedCompanies(String type) {
        String out = "";

        if (type.equals("Technology")) {
            for (int i = 0; i < companyList.size(); i++) {
                if (companyList.get(i) instanceof Technology) {
                    out += companyList.get(i).toString();
                }
            }
        } else if (type.equals("Medicine")) {
            for (int i = 0; i < companyList.size(); i++) {
                if (companyList.get(i) instanceof Medicine) {
                    out += companyList.get(i).toString();
                }
            }
        } else if (type.equals("Vehicle")) {
            for (int i = 0; i < companyList.size(); i++) {
                if (companyList.get(i) instanceof Vehicle) {
                    out += companyList.get(i).toString();
                }
            }
        }

        return out;
    }
}
