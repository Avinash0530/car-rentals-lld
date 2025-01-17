public class Motorbike extends Vehicle {
    private String bikeType;

    public Motorbike(String make, String model, int year, double rentalRate, String bikeType) {
        super(make, model, year, rentalRate, rentalRate);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type: " + bikeType);
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
}
