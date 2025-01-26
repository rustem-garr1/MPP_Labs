package MPP_Labs.Lab8.task2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod{BYNAME, BYSALARY};
    public void sort(List<Employee> emps, SortMethod method){
        Collections.sort(emps, (e1, e2)->{
            if(method==SortMethod.BYNAME){
                int result = e1.name.compareTo(e2.name);
                if(result==0){
                    if(e1.salary ==e2.salary) return 0;
                    result=(e1.salary<e2.salary)?1:-1;
                }
                return result;
            }
            else{
                if(e1.salary==e2.salary) return 0;
                int result = (e1.salary<e2.salary)?1:-1;
                return result;
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1=new Employee("Abc1", 10000);
        Employee emp2=new Employee("Abc", 10000);
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees);
        System.out.println("--------");
        EmployeeInfo empInf = new EmployeeInfo();
        empInf.sort(employees, SortMethod.BYNAME);
        System.out.println(employees);
    }
}
