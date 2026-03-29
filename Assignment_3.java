class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    public void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        GetRent();
    }

    public void GetRent() {
        switch(CarType.toLowerCase()) {
            case "small car":
                Rent = 3000;
                break;
            case "van":
                Rent = 500;
                break;
            case "suv":
                Rent = 5000;
                break;
            default:
                Rent = 0;
                System.out.println("Unknown car type. Rent set to 0.");
        }
    }

    public void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
       
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        CARRENTAL car1 = new CARRENTAL();
        CARRENTAL car2 = new CARRENTAL();
        CARRENTAL car3 = new CARRENTAL();

        car1.GetCar(1001, "Small Car");
        car2.GetCar(1002, "Van");
        car3.GetCar(1003, "SUV");

        car1.ShowCar();
        car2.ShowCar();
        car3.ShowCar();
    }
}
