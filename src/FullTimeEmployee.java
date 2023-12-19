public class FullTimeEmployee extends Employee{
    private int bonus = 0;
    private int penalty = 0;
    private int salary = 0;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name, int age, String phoneNumbers, String email) {
        super(id, name, age, phoneNumbers, email);
    }

    public FullTimeEmployee(String id, String name, int age, String phoneNumbers, String email, int bonus, int penalty, int salary) {
        super(id, name, age, phoneNumbers, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double getPayment() {
        return salary + (bonus - penalty);
    }
}
