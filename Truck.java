public class Truck extends Vehicle {
    private int loadCapacity;
    private boolean isFourWheelDrive;
    private String cargoType;

    public Truck(String make, String model, int year, double rentalRate, int loadCapacity, boolean isFourWheelDrive, String cargoType) {
        super(make, model, year, rentalRate);
        this.loadCapacity = loadCapacity;
        this.isFourWheelDrive = isFourWheelDrive;
        this.cargoType = cargoType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Four Wheel Drive: " + isFourWheelDrive);
        System.out.println("Cargo Type: " + cargoType);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isIsFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setIsFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}
