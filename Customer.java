public class Customer {
    private String name;
    private String contactNumber;
    private String email;
    private String address;
    private String customerId;
    private String license;

    public Customer(String name, String contactNumber, String email, String address,String license) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.customerId = generateCustomerId();
        this.license = license;
    }

    private String generateCustomerId() {
        return "CUST" + (int)(Math.random() * 10000);
    }

    // Getters
    public String getName() { return name; }
    public String getContactNumber() { return contactNumber; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getCustomerId() { return customerId; }
    public String getLicense(){return license;}

    // Display customer info
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
