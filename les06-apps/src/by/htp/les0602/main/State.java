package by.htp.les0602.main;

import java.util.List;

public class State {
    private City stateCenter;
    private List<District> districts;

    public State(City stateCenter, List<District> districts) {
        this.stateCenter = stateCenter;
        this.districts = districts;

    }

    public City getStateCenter() {
        return stateCenter;
    }

    public void setStateCenter(City stateCenter) {
        this.stateCenter = stateCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getStateCenter(), getDistricts());
    }
}
