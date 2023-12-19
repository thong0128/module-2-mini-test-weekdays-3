public class PartTimeEmployee extends Employee{
    private double workHour = 0;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name, int age, String phoneNumbers, String email) {
        super(id, name, age, phoneNumbers, email);
    }

    public PartTimeEmployee(String id, String name, int age, String phoneNumbers, String email, double workHour) {
        super(id, name, age, phoneNumbers, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getPayment() {
        return workHour * 100000;
    }
}
