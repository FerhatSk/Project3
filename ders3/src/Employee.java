abstract class Employee {

    protected int id;
    protected String name;
    protected int salary;
    protected String department;

    abstract double CalculateBonus();

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
