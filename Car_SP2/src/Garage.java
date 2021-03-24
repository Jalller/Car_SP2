import java.util.ArrayList;

public class Garage {
    ArrayList<Car> garage = new ArrayList<>();

    public ArrayList<Car> addCar (Car car) {
        garage.add(car);
        return garage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}';
    }

    public double calculateGreenTaxInGarage(){
        double tax = 0;
        for(Car car : garage) {
            tax = tax + car.calculateGreenTax();
        }
        return tax;
    }
}
