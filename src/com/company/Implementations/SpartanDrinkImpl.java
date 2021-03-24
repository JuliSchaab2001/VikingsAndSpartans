package com.company.Implementations;

import com.company.Interfaces.Drink;

public class SpartanDrinkImpl implements Drink {

    @Override
    public void drink() {
        System.out.println("Soy SPARTANO y me tomo una birra");
    }
}
