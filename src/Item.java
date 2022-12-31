import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @Id
    @Column(name = "item_code")
    private String code;
    private DescriptionData description;

    private Double unitPrice;
    private int qtyOnHand;

    @OneToMany(mappedBy = "item",cascade = {
            CascadeType.ALL
    })
    private List<OrderDetails> details=new ArrayList<>();

    public Item() {
    }

    public Item(String code, DescriptionData description, Double unitPrice, int qtyOnHand
    ) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand
                = qtyOnHand
        ;
    }

    public List<OrderDetails> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetails> details) {
        this.details = details;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DescriptionData getDescription() {
        return description;
    }

    public void setDescription(DescriptionData description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand
            () {
        return qtyOnHand
                ;
    }

    public void setQtyOnHand
            (int qtyOnHand
            ) {
        this.qtyOnHand
                = qtyOnHand
        ;
    }
}
