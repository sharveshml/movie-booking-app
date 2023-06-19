public class Booking {
    private Show show;
    private String customerName;
    private int row;
    private int col;
    private int quantity;

    public Booking(Show show, String customerName, int row, int col,int quantity) {
        this.show = show;
        this.customerName = customerName;
        this.row=row;
        this.col=col;
        this.quantity = quantity;
    }
    public Show getShow() {
        return show;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
