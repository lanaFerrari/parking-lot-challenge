package com.nology;


import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public int vans;
    public int motorcycle;
    public int car;
    List<String> vansSpots = new ArrayList<>();
    List<String> carsSpots = new ArrayList<>();
    List<String> motorcyclesSpots = new ArrayList<>();
    Integer sumOfVans;
    Integer sumOfCars;
    Integer sumOfMotorcycles;
    Integer sumOfPark;

    public ParkingLot(int vans, int motorcycle, int car) {
        this.vans = vans;
        this.motorcycle = motorcycle;
        this.car = car;
        totalVansSpots();
        totalCarsSpots();
        totalMotorcyclesSpots();
    }

   public void totalVansSpots(){
        for (int i = 0; i < vans; i++) {
            vansSpots.add("Van"+i);
        }
        System.out.println(vansSpots);
        getVansSpots();
    }

    public String getVansSpots() {
        sumOfVans = vansSpots.size();
        if(sumOfVans > 0){
            return sumOfVans.toString();
        }else {
            return "0 Vans Spots Available";
        }
    }

    public void enterVan(){
        // Van occupies 3 car spots

        if (vansSpots.size() >= 1){
            vansSpots.remove(vansSpots.size()-1);
        }else if( carsSpots.size() >= 3){
            carsSpots.remove(carsSpots.size()-1);
            carsSpots.remove(carsSpots.size()-1);
            carsSpots.remove(carsSpots.size()-1);
        }else{
            System.out.println("No parking available at the moment.");
        }

        getTotalSpots();
    }

    public void totalCarsSpots(){
        for (int i = 0; i < car; i++) {
            carsSpots.add("Car"+i);
        }
        System.out.println(carsSpots);
        getCarsSpots();
    }

    public String getCarsSpots() {
        sumOfCars = carsSpots.size();
        if(sumOfCars > 0){
            return sumOfCars.toString();
        }else {
            return "0 Cars Spots Available";
        }

    }

    public void enterCar(){
        if (carsSpots.size() >= 1){
            carsSpots.remove(carsSpots.size()-1);
        }else{
            System.out.println("No parking available at the moment.");
        }
        getTotalSpots();
    }

    public void totalMotorcyclesSpots(){
        for (int i = 0; i < motorcycle; i++) {
            motorcyclesSpots.add("Van"+i);
        }
        System.out.println(motorcyclesSpots);
        getMotorcyclesSpots();
    }

    public String getMotorcyclesSpots() {
        sumOfMotorcycles = motorcyclesSpots.size();
        if(sumOfMotorcycles > 0){
            return sumOfMotorcycles.toString();
        }else {
            return "0 Motorcycles Spots Available";
        }
    }

    public void enterMotorcycle(){
        if (motorcyclesSpots.size() >= 1){
            motorcyclesSpots.remove(motorcyclesSpots.size()-1);
        }else if(carsSpots.size() >= 1){
            carsSpots.remove(carsSpots.size()-1);
        } else if (vansSpots.size() >= 1) {
            vansSpots.remove(vansSpots.size()-1);
        }else{
            System.out.println("No parking available at the moment.");
        }
        getTotalSpots();
    }

    public String getTotalSpots(){
        sumOfPark = sumOfCars+sumOfMotorcycles+sumOfVans;
        return "You have " + sumOfPark + " mixed parking lots available. " + sumOfCars + " Cars, " + sumOfMotorcycles + " Motorcycles " + "and " + sumOfVans + " Vans.";
    }

}
