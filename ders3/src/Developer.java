class Developer extends Employee{

    private String about;


    public Developer(int id, String name, int salary, String department) {
        super(id, name, salary, department);
    }

    @Override
    public double CalculateBonus() {
        return salary * 0.10;
    }

}
