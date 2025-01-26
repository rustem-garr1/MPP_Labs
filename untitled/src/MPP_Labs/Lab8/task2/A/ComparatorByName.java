package MPP_Labs.Lab8.task2.A;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b){
        int result = a.getName().compareTo(b.getName());
        if(result==0){
            if(a.getSalary() == b.getSalary()){
                return 0;
            }
            result = a.getSalary()<b.getSalary()?1:-1;
        }
        return result;
    }
}
