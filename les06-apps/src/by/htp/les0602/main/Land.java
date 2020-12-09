package by.htp.les0602.main;

import java.util.List;

public class Land {
    private String name;
    private double area;
    private City capital;
    private List<State> states;

    public Land(String name, double area, City capital, List<State> states) {
        this.name = name;
        this.area = area;
        this.capital = capital;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public City getCapital() {
        return capital;
    }

    public List<State> getStates() {
        return states;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public int summaryRegions() {

        return this.states.size();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land land = (Land) o;
        return Double.compare(land.area, area) == 0 &&
                Objects.equals(name, land.name) &&
                Objects.equals(capital, land.capital) &&
                Objects.equals(states, land.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area, capital, states);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.getName(), this.getArea(), this.getCapital(), this.getStates());
    }
}
