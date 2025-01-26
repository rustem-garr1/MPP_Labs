package MPP_Labs.Lab3.task4;

class Condo extends Property {
    private int numberOfFloors;

    public Condo(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numberOfFloors;
    }
}
