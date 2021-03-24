package com.company.Classes;

import com.company.Interfaces.Drink;
import com.company.Interfaces.Pee;

public class Human {
    private String name;
    private Integer age;
    private Integer weight;
    private Drink drink;
    private Pee pee;

    //Methods...


    public Human(String name, Integer age, Integer weight, Drink drink, Pee pee) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.drink = drink;
        this.pee = pee;
    }

    public void Drink(){
        drink.drink();
    }
    public void Pee(){
        pee.pee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Pee getPee() {
        return pee;
    }

    public void setPee(Pee pee) {
        this.pee = pee;
    }
}
