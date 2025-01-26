package MPP_Labs.Lab8.task2.C;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("<"+this.name+":"+this.salary+">");
        return sb.toString();
    }
}
