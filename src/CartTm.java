public class CartTm {
    private String id;
    private int qty;

    public CartTm() {
    }

    public CartTm(String id, int qty) {
        this.id = id;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
