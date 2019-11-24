package com.company;

public class Animal {
    private String cat;
    private String bird;
    private int distancePerHr;
    private String type;
    private boolean fly;
    private int distancePerday;

    //Animal(String cat, String bird, int i, String flamingo, boolean b, int i1){}
    public Animal(String flamingo, boolean b, int distancePerHr) {
    }

    public Animal() {      //overloaded constructor with different data variable
        this.cat = cat;
        this.bird = bird;
        this.distancePerHr = distancePerHr;

    }

    public Animal(String flamingo, boolean b, int i, String cat, String bird, int i1) {

    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public int getDistancePerHr() {
        return distancePerHr;
    }

    public void setDistancePerHr(int i) {
        this.distancePerHr = distancePerHr;
    }


    public void add() {
    return  ;
    }

    public void setdistancePerday(int i) {
    }

    public void settype(String long_wing) {
    }


    @Override
    public String toString() {
        return "Animal{" +
                "cat='" + cat + '\'' +
                ", bird='" + bird + '\'' +
                ", distancePerHr=" + distancePerHr +
                ", type='" + type + '\'' +
                ", fly=" + fly +
                ", distancePerday=" + distancePerday +
                '}';
    }

    public void getdistancePerday() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void gettype() {
    }

    public void setfly(boolean b) {
    }

    public String nextLine() {
    return nextLine() ;
    }


    //
    //  public void setdistancePerday(int i) {
   // }

    //
    //  public void setDistancePerday() {
  //  }
}