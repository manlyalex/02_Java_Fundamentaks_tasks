package by.htp.les0602.main;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        City cityCapital = new City("Minsk City");
        City minskCity = new City("Minsky District ");
        City cityMinskAsState = new City("Minsky Region");
        City city1 = new City("Nesvij");
        City city2 = new City("Borivov");
        City city3 = new City("Molodechno");
        City city4 = new City("Kleck");
        City city5 = new City("Logoysk");
        List<City> cityInMinsk = new ArrayList<City>();

        cityInMinsk.add(city1);
        cityInMinsk.add(city2);
        cityInMinsk.add(city3);
        cityInMinsk.add(city4);
        cityInMinsk.add(city5);


        City cityBorisov = new City("Borisovsky District");
        City city9 = new City("Kamenka");
        City city10 = new City("Zorichi");
        List<City> cityInBorisovkyRegion = new ArrayList<City>();

        cityInBorisovkyRegion.add(city9);
        cityInBorisovkyRegion.add(city10);

        City cityBrestAsState = new City("Brestky Region");
        City cityBrest = new City("Brestky District");
        City city7 = new City("Pinsk");
        City city8 = new City("Kobrin");
        List<City> cityInBrest = new ArrayList<City>();

        cityInBrest.add(city7);
        cityInBrest.add(city8);

        City cityPinsk = new City("Pinsky District");
        City city11 = new City("Rudka");
        City city12 = new City("Logishin");
        List<City> cityInPinsk = new ArrayList<City>();

        cityInPinsk.add(city11);
        cityInPinsk.add(city12);


        District district1 = new District(minskCity, cityInMinsk);
        District district2 = new District(cityBorisov, cityInBorisovkyRegion);

        District district3 = new District(cityBrest, cityInBrest);
        District district4 = new District(cityPinsk, cityInPinsk);


        List<District> minskDistricts = new ArrayList<District>();
        List<District> brestDistricts = new ArrayList<District>();


        minskDistricts.add(district1);
        minskDistricts.add(district2);
        brestDistricts.add(district3);
        brestDistricts.add(district4);

        State state1 = new State(cityMinskAsState, minskDistricts);
        State state2 = new State(cityBrestAsState, brestDistricts);

        List<State> stateInLand = new ArrayList<State>();

        stateInLand.add(state1);
        stateInLand.add(state2);

        Land land1 = new Land("Belarus", 207595, cityCapital, stateInLand);
        int summaryRegionsInLand = land1.summaryRegions();

        System.out.println(land1);
        System.out.println(summaryRegionsInLand);

    }
}
