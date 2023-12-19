public class Employee {
    private String id = "0000";
    private String name = "Empty";
    private int age = 0;
    private String phoneNumbers = "Empty";
    private String email = "Empty";

    public Employee() {
    }

    public Employee(String id, String name, int age, String phoneNumbers, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPayment() {
        return 0;
    }
}
