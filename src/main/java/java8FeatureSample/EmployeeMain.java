package java8FeatureSample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeMain.getAllEmployees();

        System.out.println("List of all employees: ");
        employeeList
                .stream()
                .forEach(employee -> System.out.println(employee.getName() + " -- " + employee.getSalary()));


        System.out.println("\nList of all employees whose salary is greater than or equal to 10,000: ");
        employeeList
                .stream()
                .filter(employee -> employee.getSalary() >= 10000)
                .forEach(employee -> System.out.println(employee.getName() + " -- " + employee.getSalary()));

    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        AddEmployee addEmployee = (String n, int s) -> new Employee(n, s);

        employeeList.add(addEmployee.createEmployee("Maria", 12000));
        employeeList.add(addEmployee.createEmployee("Alex", 10000));
        employeeList.add(addEmployee.createEmployee("James", 8000));
        employeeList.add(addEmployee.createEmployee("Edward", 7000));
        employeeList.add(addEmployee.createEmployee("Henry", 18000));
        employeeList.add(addEmployee.createEmployee("Rose", 22000));
        employeeList.add(addEmployee.createEmployee("Catalina", 9000));

        return employeeList;
        /*
        employeeList.add(new Employee("Maria", 12000));
        employeeList.add(new Employee("Alex", 10000));
        employeeList.add(new Employee("James", 8000));
        employeeList.add(new Employee("Edward", 7000));
        employeeList.add(new Employee("Henry", 18000));
        employeeList.add(new Employee("Rose", 22000));
        employeeList.add(new Employee("Catalina", 9000));
        */


    }
}
