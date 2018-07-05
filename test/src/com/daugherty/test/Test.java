package com.daugherty.test;

public class Test {

    public static void main(String[] args) {
      class Flight{
          int passengers;
          int seats;

          Flight() {
              seats = 150;
              passengers = 0;
          }
          void add1Passenger() {
              if (passengers < seats) {
                  passengers += 1;
              }
          }
       }

       Flight nycToSf = new Flight();
       Flight slcToDallas = new Flight();
       System.out.println(slcToDallas.passengers);
       slcToDallas.add1Passenger();
       System.out.println(slcToDallas.passengers);

       Flight flight1 = new Flight();
       Flight flight2 = new Flight();

       flight2.add1Passenger();
       System.out.println(flight2.passengers);

       flight2 = flight1;
       System.out.println(flight2.passengers);

       flight1.add1Passenger();
       flight1.add1Passenger();
       System.out.println(flight2.passengers);
    }
}
