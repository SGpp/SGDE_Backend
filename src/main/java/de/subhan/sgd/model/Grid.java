package de.subhan.sgd.model;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Double> surpluses;
    private List<List<GridPoint>> gridPoints;

    public Grid(){
        this.surpluses  = new ArrayList<Double>();
        this.gridPoints = new ArrayList<List<GridPoint>>();
    }

    public List<Double> getSurpluses() {
        return surpluses;
    }

    public void setSurpluses(List<Double> surpluses) {
        this.surpluses = surpluses;
    }

    public List<List<GridPoint>> getGridPoints() {
        return gridPoints;
    }

    public void setGridPoints(List<List<GridPoint>> gridPoints) {
        this.gridPoints = gridPoints;
    }
}
