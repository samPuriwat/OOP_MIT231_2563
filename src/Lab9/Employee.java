package Lab9;

public class Employee {
    //attributes
    private int emp_id;
    private String name;
    private String position;
    private double salary;

    //constructor

    public Employee(int emp_id, String name, String position, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    //getter and setter

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    //to String

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
