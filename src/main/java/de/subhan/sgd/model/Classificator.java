package de.subhan.sgd.model;

public class Classificator {

    private int instances;
    private int label;
    private Grid grid;
    private String gridType;

    public Classificator(){

    }

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }

    public int getLabel() {
        return label;
    }

    public String getGridType() {
        return gridType;
    }

    public void setGridType(String gridType) {
        this.gridType = gridType;
    }

    public void setLabel(int label) {

        this.label = label;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }
}
