import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
        @Id
        @Column(name = "vehicle_id")
        private String vehicleId;
        private String brand;
        private String type;
        private String color;

        @OneToOne
        @JoinColumn(
                name = "customer_id",
                nullable = false,
                unique = true
        )
        private Customer customer;

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Vehicle(String vehicleId, String brand, String type, String color) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
}
