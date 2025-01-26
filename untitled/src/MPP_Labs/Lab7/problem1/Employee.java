package MPP_Labs.Lab7.problem1;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "(" + name + ", " + salary + ")";
    }

//    public boolean equals(Employee e) {
//        return e.name.equals(name) && e.salary == salary;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee that = (Employee) obj;
        return this.salary == that.salary && this.name.equals(that.name);
    }



//	public boolean equals(Object ob) {
//		Employee e = (Employee)ob;
//		return e.name.equals(name) && e.salary == salary;
//	}
}
