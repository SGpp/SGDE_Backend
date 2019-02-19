package de.subhan.sgd.model;

public class GridPoint {
    Integer level;
    Integer index;

    public GridPoint(Integer level, Integer index){
        this.level = level;
        this.index = index;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
