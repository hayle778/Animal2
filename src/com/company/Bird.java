package com.company;

// the super class
public class Bird extends Animal {
    private String type;
    private boolean fly;
    private int distancePerday;
    //default constructor
 public Bird ()  {
     super();
 }
// overloaded constructor: I have to add instance variable


    public Bird(String type, boolean fly, int distancePerday){
     super("flamingo", true, 400);

     this.type=type;
     this.fly=fly;
     this.distancePerday=distancePerday;
 }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public int getDistancePerday() {
        return distancePerday;
    }

    public void setDistancePerday(int distancePerday) {
        this.distancePerday = distancePerday;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", fly=" + fly +
                ", distancePerday=" + distancePerday +
                '}';
    }
}



