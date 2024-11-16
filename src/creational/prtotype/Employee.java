package creational.prtotype;

import java.util.ArrayList;
import java.util.List;

/**
 * prototype means cloning of object
 */
public class Employee implements Cloneable{

    private List<String> empList = new ArrayList<>();

    public Employee (){
//        empList = new ArrayList<>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }



    public void loadData(){
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        List<String> cloneEmpList = new ArrayList<>();
        for (String s: getEmpList()){
            if (s.equals("David"))
            cloneEmpList.add(s);
        }
        return new Employee(cloneEmpList);
    }
}
