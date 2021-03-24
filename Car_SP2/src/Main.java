public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        DieselCar dieselCar = new DieselCar(10,"a","b","b",4,3,true);
        System.out.println(dieselCar.calculateGreenTax());
        DieselCar dieselCar2 = new DieselCar(10,"a","b","b",4,3,false);
        System.out.println(dieselCar2.calculateGreenTax());

        ElectricCar electricCar = new ElectricCar(10,"a","b","c",3,1000,4,5);
        System.out.println(electricCar.calculateGreenTax());

        PetrolCar petrolCar = new PetrolCar(10,"a","b","c",10,1,1);
        System.out.println(petrolCar.calculateGreenTax());


        garage.addCar(dieselCar);
        garage.addCar(dieselCar2);
        garage.addCar(petrolCar);
        garage.addCar(electricCar);
        System.out.println(garage.toString());
        System.out.println(garage.calculateGreenTaxInGarage());

    }
}
