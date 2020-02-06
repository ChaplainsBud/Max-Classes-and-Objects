package com.company;

public class Animal {
    //variables
    private String name;
    private String type;
    private String description;
    private int price;
    private boolean isInStock;
    private Mouse mouse;

    //default constructor
    public Animal() {
    }


    //overloaded constructor
    public Animal(String name, String type, String description, int price, boolean isInStock){
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //methods -- getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    //prompts the user for a name

    //
}








/*
I. Composition: Class within a class
 ex: Book  Chapter
     private Chapter[] chapters;

II. Encapsulation: all variables/fields are private
because ... b/c we want to protect that data.

Ex:


   private String name;
   public void setName(String Name){
   this.name = name;
   }

  public String getName () {
         return this.name;
  }

GETTERS/SETTERS

III. Inheritance: child takes everything from the parent

public class Parent {

 variables:     protected String name;
                protected int age;

 constructor:   default              pverloaded
                public Parent() {
                   }
                public Parent(String name, int age) {
                 this.name = name;
                 this.age = age;
                }
 methods        getters/setters

}


public class Child extends Parent {
    private int crying_counter;

}

IV. Polymorphism: different methods with the name name


@Override
public void talk() {
system.out.println("Blah...Blah...Blah");
}

V. Abstract:

//extends

abstract methods
regular variables
regular methods

cannot instantiate abstract or interface



VI. Interfaces:
//implements


by default they are abstract methods

don't have code in body, nor a body.

template method

VII. Final: constant

naming is all caps, convention

private final int MAX_COUNTER = 10;






































 */