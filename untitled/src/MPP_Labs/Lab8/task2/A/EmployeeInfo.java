package MPP_Labs.Lab8.task2.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};
    private SortMethod method;

    public EmployeeInfo(SortMethod method){
        this.method=method;
    }

    public void sort(List<Employee> emps){
        if(method==SortMethod.BYNAME){
            Collections.sort(emps, new ComparatorByName());
        }
        else if(method==SortMethod.BYSALARY){
            Collections.sort(emps, new ComparatorBySalary());
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1=new Employee("Abc1", 10000);
        Employee emp2=new Employee("Abc2", 12000);
        employees.add(emp1);
        employees.add(emp2);

        ComparatorByName cmpName = new ComparatorByName();
        System.out.println(cmpName.compare(emp1, emp2));
    }
}
