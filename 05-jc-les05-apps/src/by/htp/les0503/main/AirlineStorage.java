package by.htp.les0503.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.function.Function;

public class AirlineStorage {
    private ArrayList<Airline> airlines;

    public AirlineStorage(ArrayList<Airline> airlines) {
        this.airlines = airlines;
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }
    public void sortAirline() {
        Collections.sort(this.airlines);
    }

    public static String toString(ArrayList<Airline> airlines) {
        String result = "";
        for (int i = 0; i < airlines.size(); i++) {
            result += airlines.get(i).toString() + "\n";
        }
        return result;
    }

    private static ArrayList<Airline> filterByField(Function<Airline, String> func, String value, ArrayList<Airline> airlines) {
        ArrayList<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (func.apply(airline).equals(value)) {
                result.add(airline);
            }
        }
        return result;
    }

    public static ArrayList<Airline> filterByDestination(String value, ArrayList<Airline> airlines) {
        Function<Airline, String> getAirlinesDestination = e -> e.getDestination();
        return AirlineStorage.filterByField(getAirlinesDestination, value, airlines);
    }

    public static ArrayList<Airline> filterByDaysOfTheWeek(String value, ArrayList<Airline> airlines) {
        Function<Airline, String> getAirlinesDaysOfTheWeek = e -> e.getDaysOfTheWeek();
        return AirlineStorage.filterByField(getAirlinesDaysOfTheWeek, value, airlines);
    }
    public static ArrayList<Airline> filterDepartureTime(Date departureTime, ArrayList<Airline> airlines) {
        ArrayList<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (airline.getDepartureTime().after(departureTime)) {
                result.add(airline);
            }
        }
        return result;
    }

}
