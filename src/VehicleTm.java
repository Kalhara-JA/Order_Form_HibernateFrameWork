public class VehicleTm {
    private String vehicleId;
    private String brand;
    private String type;
    private String color;
    private String customerId;
    private String CustomerName;

    public VehicleTm() {
    }

    public VehicleTm(String vehicleId, String brand, String type, String color, String customerId, String customerName) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.customerId = customerId;
        CustomerName = customerName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
