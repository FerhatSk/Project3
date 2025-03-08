class Manager extends Employee {

    int teamSize;

    public Manager(int id, String name, int salary, String department) {
        super(id, name, salary, department);
    }

    @Override
    public double CalculateBonus() {

        return salary * 0.20;

    }
}
