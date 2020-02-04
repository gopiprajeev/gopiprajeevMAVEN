package com.GopiPrajeev.mavenproject;

public class Kitkat extends Chocolate
{
    public Kitkat(String name, int price, int weight)
    {
        super(name, price, weight);
    }

    void chocolateDescription()
    {
        System.out.println("Chocolate name: Kitkat");
    }
}