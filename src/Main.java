import java.util.Scanner;

public class Main {
    public static double avrSalary(Employee[] arr) {
        int companySize = arr.length;
        double totalPayment = getTotalPayment(arr);
        return totalPayment / companySize;
    }

    private static double getTotalPayment(Employee[] arr) {
        double totalPayment = 0;
        for (Employee employee : arr){
            totalPayment += employee.getPayment();
        }
        return totalPayment;
    }

    public static double fullTimeAvrSalary(Employee[] arr) {
        int fullTimeNum = 0;
        double totalPayment = 0;
        for (Employee employee : arr) {
            if (employee instanceof FullTimeEmployee) {
                fullTimeNum ++;
                totalPayment += employee.getPayment();
            }
        }
        return totalPayment / fullTimeNum;
    }
    public static double partTimeAvrSalary(Employee[] arr) {
        int partTimeNum = 0;
        double totalPayment = 0;
        for (Employee employee : arr) {
            if (employee instanceof PartTimeEmployee) {
                partTimeNum ++;
                totalPayment += employee.getPayment();
            }
        }
        return totalPayment / partTimeNum;
    }

    public static double partTimeTotalSalary(Employee[] arr) {
        double totalPayment = 0;
        for (Employee employee : arr) {
            if (employee instanceof PartTimeEmployee) {
                totalPayment += employee.getPayment();
            }
        }
        return totalPayment;
    }

    public static int moreThanAvr(Employee[] arr) {
        double avrSalary = avrSalary(arr);
        int count = 0;
        for (Employee employee : arr) {
            if (employee.getPayment() > avrSalary) count++;
        }
        return count;
    }

    public static int findPartTime(Employee[] arr, String name) {
        int count = 0;
        for (Employee employee : arr) {
            if (employee instanceof PartTimeEmployee) {
                if (employee.getName().equalsIgnoreCase(name)) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Employee[] company = new Employee[5];
        Employee thong = company[0] = new FullTimeEmployee("0001"
                , "Thong", 30
                , "0353107446"
                , "thong0128@gmail.com"
                , 5000000, 100000, 10000000);
        Employee loc = company[1] = new FullTimeEmployee("0002"
                , "Loc", 30
                , "0945469797"
                , "tranminhloc.anhk@gmail.com"
                , 6000000, 500000, 10000000);
        Employee phong = company[2] = new FullTimeEmployee("0003"
                , "Phong", 20
                , "0984780617"
                , "phongdinh250703@gmail.com"
                , 2000000, 100000, 8000000);
        Employee hai = company[3] = new PartTimeEmployee("0004"
                , "Hai", 27
                , "0967548599"
                , "thanhhaitran1203@gmail.com"
                , 130.5);
        Employee hung = company[4] = new PartTimeEmployee("0005"
                , "Hung", 30
                , "0981264706"
                , "hunglv0801@gmail.com"
                , 125);

        employeeManagement(company);
    }

    private static void employeeManagement(Employee[] company) {
        int choice = getChoice();
        resultOut(choice, company);
        employeeManagement(company);
    }

    private static int getChoice() {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        do {
            if (choice <= 0 || choice > 7)
                System.out.println("Selection not available");
            System.out.println("Employee Management");
            System.out.println("1. Calculate the average salary of the entire company's employees.");
            System.out.println("2. Calculate the average salary of full-time employees.");
            System.out.println("3. Calculate the average salary of part-time employees.");
            System.out.println("4. Calculate the total salary payable to part-time employees.");
            System.out.println("5. Count the number of people whose salary is higher than the average salary of the entire company.");
            System.out.println("6. Counts the number of part-time employees whose names are entered from the keyboard.");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }while (choice <= 0 || choice > 7);
        return choice;
    }

    private static void resultOut(int choice, Employee[] company) {
        switch (choice) {
            case 1:
                System.out.println("Company average salary: " + avrSalary(company) + "VND");
                break;
            case 2:
                System.out.println("Full time employee average salary: " + fullTimeAvrSalary(company) + "VND");
                break;
            case 3:
                System.out.println("Part time employee average salary: " + partTimeAvrSalary(company) + "VND");
                break;
            case 4:
                System.out.println("Total part time salary: " + partTimeTotalSalary(company) + "VND");
                break;
            case 5:
                System.out.println("There are " + moreThanAvr(company) + " people with salary higher than average" );
                break;
            case 6:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("There are " + findPartTime(company, name) + " part time employee name: " + name );
                break;
            case 7:
                System.exit(0);
        }
    }
}
