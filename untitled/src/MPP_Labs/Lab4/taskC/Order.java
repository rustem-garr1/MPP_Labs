package MPP_Labs.Lab4.taskC;

public class Order {
    private final int orderNo;
    private final int month;
    private final int year;
    private final double orderAmount;

    public Order(int orderNo, int month, int year, double orderAmount) {
        this.orderNo = orderNo;
        this.month = month;
        this.year = year;
        this.orderAmount = orderAmount;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
