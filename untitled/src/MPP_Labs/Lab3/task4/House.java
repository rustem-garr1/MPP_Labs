package MPP_Labs.Lab3.task4;

class House extends Property {
    private double lotSize;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
