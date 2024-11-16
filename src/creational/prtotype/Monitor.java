package creational.prtotype;

import java.util.List;

public class Monitor {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();

        List<String> empListModified = employee1.getEmpList();
        empListModified.add("fghgjkl");

        System.out.println(employee.getEmpList());
        System.out.println(empListModified);

    }
}
