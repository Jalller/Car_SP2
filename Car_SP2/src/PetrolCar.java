public class PetrolCar extends Car{
    private int oktantal;
    private float kmPrL;

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    public PetrolCar(int regNr, String brand, String model, String year, int numberOfDoors, int oktantal, float kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }


    @Override
    public String toString() {
        return "PetrolCar{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double calculateGreenTax() {
        double tax = 0;
        if (this.kmPrL>=20 && this.kmPrL<=50) {
            tax = 330;
        } else if (this.kmPrL>=15 && this.kmPrL<20) {
            tax = 1050;
        } else if (this.kmPrL>=10 && this.kmPrL<15) {
            tax = 2340;
        } else if (this.kmPrL>=5 && this.kmPrL<10) {
            tax = 5500;
        } else if (this.kmPrL<5) {
            tax= 10470;
        }
        return tax;
    }
}
