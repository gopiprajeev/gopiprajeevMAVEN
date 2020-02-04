package com.GopiPrajeev.mavenproject;

public abstract class Chocolate
{
    private int weight;
    private int price;
    private String name;

    public Chocolate(String name, int price, int weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getChocolateWeight()
    {
        return weight;
    }

    public int getChocolatePrice()
    {
        return price;
    }

    public String getChocolateName()
    {
        return name;
    }

    abstract void chocolateDescription();

    public String toString()
    {
        return "Chocolate name: "+this.name+" Price: "+this.price+" Weight: "+this.weight;
    }
}