package de.subhan.sgd.model;

public class Evaluator {
    private double value;
    private int label;
    private double classDensity;

    public double getClassDensity() {
        return classDensity;
    }

    public void setClassDensity(double classDensity) {
        this.classDensity = classDensity;
    }

    public Evaluator(){

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
}
