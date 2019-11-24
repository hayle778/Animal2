package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner input = new Scanner(System.in);

        Animal animal = new Animal();
        animal.setBird("flamingo");
        animal.setCat("meow");
        animal.setDistancePerHr(100);
        animal.setdistancePerday(500);
        animal.settype("Long wing");
        animal.setfly(false);
       System.out.println(animal.toString());
//   System.out.println(""+ animal.getBird()+ ""+ animal.getCat()+""+animal.getdistancePerday() +""+animal.setDistancePerHr());
         //  animal.gettype()+);

        boolean x = false;

       if (x = false) {
        System.out.println("flamingo can fly");

        }

       else{
           System.out.println("flamingo can`t fly");
       }
    }
}
