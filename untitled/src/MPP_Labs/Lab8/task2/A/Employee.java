package MPP_Labs.Lab8.task2.A;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        Employee emp=(Employee) obj;
        return this.name.equals(emp.name) && this.salary==emp.salary;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(this.name+":"+this.salary);
        return sb.toString();
    }
}
