package view;

import controller.SaleManager;
import java.util.ArrayList;
import model.Auto;

public class Main{

    public static void main(String[] args) {
        ArrayList<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Model 1", null, "red", 10));
        autoList.add(new Auto("Model 2", null, "blue", 20));
        autoList.add(new Auto("Model 3", null, "yellow", 30));
        autoList.add(new Auto("Model 4", null, "white", 40));

        SaleManager.orderByCost(autoList);
    }
}