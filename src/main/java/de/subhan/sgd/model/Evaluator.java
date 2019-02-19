package de.subhan.sgd.model;

public class Evaluator {
    private double value;
    private int label;

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
