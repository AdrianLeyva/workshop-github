package view;

import controller.SaleManager;
import java.util.ArrayList;
import model.Auto;

public class Main{

    public static void main(String[] args) {
        ArrayList<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Model 1", null, 10234, 10));
        autoList.add(new Auto("Model 2", null, 12345, 20));
        autoList.add(new Auto("Model 3", null, 13459, 30));
        autoList.add(new Auto("Model 4", null, 111111, 40));

        SaleManager.orderByMinCost(autoList);
    }
}