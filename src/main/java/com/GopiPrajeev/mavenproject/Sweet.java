package com.GopiPrajeev.mavenproject;

public abstract class Sweet
{
    private String name;
    private int price, weight;

    public Sweet(String name, int price, int weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getSweetName()
    {
        return name;
    }

    public int getSweetPrice()
    {
        return price;
    }

    public int getSweetWeight()
    {
        return weight;
    }

    public String toString()
    {
        return "Sweet name: "+this.name+" Price: "+this.price+" Weight: "+this.weight;
    }

    abstract void getDescription();
}