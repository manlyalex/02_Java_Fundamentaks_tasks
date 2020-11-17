package by.htp.les0503.main;

import java.util.ArrayList;

public class ListOfAirline {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Moscow", "15223", "Ty-134", Utils.createTime("02:00"), "Saturday");
        Airline airline2 = new Airline("Minsk", "13451", "Ty-154", Utils.createTime("03:00"), "Wednesday");
        Airline airline3 = new Airline("Moscow", "11456", "Ty-134", Utils.createTime("05:00"), "Friday");


        ArrayList<Airline> airlines = new ArrayList<Airline>();
        airlines.add(airline1);
        airlines.add(airline2);
        airlines.add(airline3);

        AirlineStorage airlineStorage = new AirlineStorage(airlines);
        System.out.println(AirlineStorage.toString(airlineStorage.getAirlines()));

        airlineStorage.sortAirline();
        System.out.println(AirlineStorage.toString(airlineStorage.getAirlines()));

        ArrayList<Airline> filteredByDestination = AirlineStorage.filterByDestination("Moscow", airlines);
        ArrayList<Airline> filteredByDaysOfTheWeek = AirlineStorage.filterByDaysOfTheWeek("Wednesday", airlines);
        ArrayList<Airline> filteredDepartureTime = AirlineStorage.filterDepartureTime(Utils.createTime("02:00"), filteredByDaysOfTheWeek);

        System.out.println(AirlineStorage.toString(filteredDepartureTime));
        System.out.println(AirlineStorage.toString(filteredByDestination));
        System.out.println(AirlineStorage.toString(filteredByDaysOfTheWeek));
    }

}