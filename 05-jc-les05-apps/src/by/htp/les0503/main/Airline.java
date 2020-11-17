package by.htp.les0503.main;


import java.util.Date;

public class Airline implements Comparable<Airline> {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private Date departureTime;
    private String daysOfTheWeek;

    public Airline(String destination, String flightNumber, String aircraftType, Date departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }
    @Override
    public String toString() {
        return String.format("%s %s %tT %s %s", this.getDestination(), this.getDaysOfTheWeek(), this.getDepartureTime(), this.getAircraftType(), this.getFlightNumber());
    }
    public int compareTo(Airline airline) {
        return this.departureTime.compareTo(airline.getDepartureTime());

    }
}
