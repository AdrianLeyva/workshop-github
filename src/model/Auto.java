package model;

import java.util.ArrayList;

public class Auto{

    private String model;
    private ArrayList<Wheel> wheels;
    private String color;
    private double cost;

    public Auto(String model, double cost){
        this.model = model;
        this.cost = cost;
    }

    public Auto(String model, ArrayList<Wheel> wheels, String color, double cost) {
        this.model = model;
        this.wheels = wheels;
        this.color = color;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalCost(){
        double totalCost = this.getCost();

        if(this.wheels != null){
            for(Wheel i : this.wheels){
                totalCost += totalCost + i.getCost();
            }
        }

        return totalCost;
    }
}