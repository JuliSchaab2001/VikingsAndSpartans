package com.company.Implementations;

import com.company.Interfaces.Drink;

public class VikingDrinkImpl implements Drink {
    @Override
    public void drink() {
        System.out.println("Soy VIKINGO y me tomo una birra");
    }
}
