package MPP_Labs.Lab8.task2.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};

    public void sort(List<Employee> emps, final SortMethod method){
        class EmployeeComparator implements Comparator<Employee>{
            @Override
            public int compare(Employee e1, Employee e2){
                if(method==SortMethod.BYNAME){
                    int result = e1.name.compareTo(e2.name);
                    if(result == 0){
                        if(e1.salary==e2.salary) return 0;
                        result=e1.salary<e2.salary?1:-1;
                    }
                    return result;
                }
                else{
                    if(e1.salary==e2.salary) return 0;
                    int result = e1.salary< e2.salary? 1:-1;
                    return result;
                }
            }
        }
        Collections.sort(emps, new EmployeeComparator());
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1=new Employee("Abc1", 10000);
        Employee emp2=new Employee("Abc2", 12000);
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees);
        System.out.println("---------");
        EmployeeInfo empInfo = new EmployeeInfo();
        empInfo.sort(employees, SortMethod.BYSALARY);
        System.out.println(employees);

    }
}
