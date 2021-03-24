package com.company.Classes;

import com.company.Interfaces.Drink;
import com.company.Interfaces.Pee;

public class Viking extends Human{
    private Integer professionalDrinker;

    public Viking(String name, Integer age, Integer weight, Drink drink, Pee pee, Integer professionalDrinker) {
        super(name, age, weight, drink, pee);
        this.professionalDrinker = professionalDrinker;
    }

    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }
}
