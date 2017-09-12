package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Auto;
import sun.misc.Sort;

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
    
    public static void orderByMaxCost(ArrayList<Auto> auto){
        bubbleSort(auto);
        
        for(Auto i : auto){
            System.out.println("Cost: $" + i.getTotalCost());
        }
    }
    
    private static void bubbleSort(ArrayList<Auto> arr) {
      boolean swapped = true;
      int j = 0;
      Auto tmp;
      
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.size() - j; i++) {  
                
                  if (arr.get(i).getTotalCost() < arr.get(i + 1).getTotalCost()) {                          
                        tmp = arr.get(i);
                        arr.set(i, arr.get(i + 1));
                        arr.set(i + 1, tmp);
                        swapped = true;
                  }
            }                
      }  
    }
}