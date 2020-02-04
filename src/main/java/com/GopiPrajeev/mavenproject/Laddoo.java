package com.GopiPrajeev.mavenproject;

public class Laddoo extends Sweet
{
    public Laddoo(String name, int price, int weight)
    {
        super(name, price, weight);
    }

    void getDescription()
    {
        System.out.println("Sweet: Laddoo");
    }
}