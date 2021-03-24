public class DieselCar extends Car{
    private float kmPrL;
    private boolean hasParticleFilter;



    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public DieselCar(int regNr, String brand, String model, String year, int numberOfDoors, float kmPrL, boolean hasParticleFilter) {
        super(regNr, brand, model, year, numberOfDoors);
        this.kmPrL = kmPrL;
        this.hasParticleFilter = hasParticleFilter;
    }


    @Override
    public String toString() {
        return "DieselCar{" +
                "kmPrL=" + kmPrL +
                ", hasParticleFilter=" + hasParticleFilter +
                '}';
    }

    @Override
    public double calculateGreenTax() {
        double tax = 0;
        double udligningsafgift = 0;
        double ekstra;
        if (!hasParticleFilter) {
            ekstra=0;
        } else {
            ekstra=1000;
        }
        if (this.kmPrL>=20 && this.kmPrL<=50) {
            tax = 330;
            udligningsafgift =130;
        } else if (this.kmPrL>=15 && this.kmPrL<20) {
            tax = 1050;
            udligningsafgift=1390;
        } else if (this.kmPrL>=10 && this.kmPrL<15) {
            tax = 2340;
            udligningsafgift=1850;
        } else if (this.kmPrL>=5 && this.kmPrL<10) {
            tax = 5500;
            udligningsafgift=2770;
        } else if (this.kmPrL<5) {
            tax= 10470;
            udligningsafgift=15260;
        }
        return tax+udligningsafgift+ekstra;
    }
}
