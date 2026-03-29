import java.util.Scanner;

class Resort {
    String RNo;
    String Name;
    double Charges;
    int Days;
    double Amount;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextDouble();
        System.out.print("Enter Number of Days of Stay: ");
        Days = sc.nextInt();
    }

    double Compute() {
        Amount = Days * Charges;
        if (Amount > 11000) {
            Amount *= 1.02;
        }
        return Amount;
    }

    void DispInfo() {
        System.out.println("Customer Details");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + Compute());
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Resort resortGuest = new Resort();
        resortGuest.Getinfo();
        resortGuest.DispInfo();
    }
}
