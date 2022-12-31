public class OrderTm {
    private String id;

    private String orderDate;
    private Double cost;
    private String customerId;
    private String customerName;

    public OrderTm() {
    }

    public OrderTm(String id, String orderDate, Double cost, String customerId, String customerName) {
        this.id = id;
        this.orderDate = orderDate;
        this.cost = cost;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
