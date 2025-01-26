package MPP_Labs.Lab8.task2.B;

public class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null || this.getClass()!=obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return this.name.equals(emp.name) && this.salary == emp.salary;
    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(this.name+":"+this.salary);
        return sb.toString();
    }
}
