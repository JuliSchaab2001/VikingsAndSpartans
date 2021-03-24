package com.company.Classes;

import com.company.Interfaces.Drink;
import com.company.Interfaces.Pee;

public class Spartan extends Human{
    private Integer extraTolerance;

    public Spartan(String name, Integer age, Integer weight, Drink drink, Pee pee, Integer extraTolerance) {
        super(name, age, weight, drink, pee);
        this.extraTolerance = extraTolerance;
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }
}
