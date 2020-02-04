package com.GopiPrajeev.mavenproject;

public class KajuBarfi extends Sweet
{
    public KajuBarfi(String name, int price, int weight)
    {
        super(name, price, weight);
    }

    void getDescription()
    {
        System.out.println("Sweet: Kaju Barfi");
    }
}