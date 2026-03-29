import java.util.Scanner;

class Employee {
    int id;
    String name;
    float salary, houseRent, allowance, total;

    float calculate() {
        total = salary + houseRent + allowance;
        return total;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        id = sc.nextInt();

        System.out.println("Enter Name:");
        name = sc.next();

        System.out.println("Enter Salary:");
        salary = sc.nextFloat();

        System.out.println("Enter House Rent:");
        houseRent = sc.nextFloat();

        System.out.println("Enter Allowance:");
        allowance = sc.nextFloat();

        calculate();
    }

    void dispdata() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("House Rent: " + houseRent);
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Pay: " + total);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.havedata();
        obj.dispdata();
    }
}
