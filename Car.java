public class Car extends Vehicle{
    private int numDoors;
    private boolean isConvertible;
    private String fuelType;

    public Car(String make, String model, int year, double dailyRentalRate, double hourlyRentalRate, 
               int numDoors, boolean isConvertible, String fuelType){
        super(make, model, year, dailyRentalRate, hourlyRentalRate);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Convertible: " + isConvertible);
        System.out.println("Fuel Type: " + fuelType);
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsConvertible() {
        return isConvertible;
    }

    public void setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
