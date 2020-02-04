package com.GopiPrajeev.mavenproject;

public class FiveStar extends Chocolate
{
    public FiveStar(String name, int price, int weight)
    {
        super(name, price, weight);
    }

    void chocolateDescription()
    {
        System.out.println("Chocolate name: 5 Star");
    }
}