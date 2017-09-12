package controller;

import java.util.ArrayList;
import model.Auto;

public class SaleManager{

    public SaleManager() {
    }

    public static void getTotalCost(ArrayList<Auto> auto){
        double cost = 0;

        for(Auto i : auto){
            cost += i.getTotalCost();
        }

        System.out.println("The total cost is: $" + cost);
    }
}