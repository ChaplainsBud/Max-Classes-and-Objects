package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal tiger = new Animal();
        String lion = "howdy im  lion";

        System.out.println(tiger.getName());
        tiger.setName("Timmy the tiger");

        System.out.println(tiger.getName());



        Animal bird = new Animal();

        //using overloaded constructor
        Animal chicken = new Animal("chicken","fowl","lots of feathers good meat",20,true);

        System.out.println(chicken.getName());
        System.out.println(chicken.getDescription());
//



        ArrayList<String> arraylist1 = new ArrayList<String>();
    }
}
