package MPP_Labs.Lab3.task2;

public class Building {
    private double[] apartments;
    private double maintenanceCost;

    public Building(int aptNumbers, double maintenanceCost){
        this.apartments = new double[aptNumbers];
        this.maintenanceCost=maintenanceCost;
    }

    public void addApartment(Apartment apt){
        for(int i=0; i<apartments.length; i++){
            apartments[i] = apt.getRent();
        }
    }

    public double calculateProfit(){
        double totalRent = 0;
        for(double rentPrice: apartments){
            totalRent+=rentPrice;
        }
        return totalRent-maintenanceCost;
    }

}
