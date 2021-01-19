package Inheritance;

/**
 * POJO SoftwareEnginner is a child class
 */

public class SoftwareEnginner  extends User{

    private String Role;
    private  String Department;
    private String CompanyName;
    private String CompanyWebsite;
    private String CompanyAddress;

    public SoftwareEnginner(String fullName, String gender, String emailAddress, Integer phoneNumber, String address, String role, String department, String companyName, String companyWebsite, String companyAddress) {
        super(fullName, gender, emailAddress, phoneNumber, address);
        Role = role;
        Department = department;
        CompanyName = companyName;
        CompanyWebsite = companyWebsite;
        CompanyAddress = companyAddress;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyWebsite() {
        return CompanyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        CompanyWebsite = companyWebsite;
    }

    public String getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }
}
