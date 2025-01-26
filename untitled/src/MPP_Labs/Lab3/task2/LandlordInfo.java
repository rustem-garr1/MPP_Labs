package MPP_Labs.Lab3.task2;
import java.util.*;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo(){
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building bldg){
        buildings.add(bldg);
    }

    public double calcProfits(){
        double totalProfit = 0;
        for(Building bldg: buildings){
            totalProfit+=bldg.calculateProfit();
        }
        return totalProfit;
    }
}
