package com.GopiPrajeev.mavenproject;

public class DiaryMilk extends Chocolate
{
    public DiaryMilk(String name, int price, int weight)
    {
        super(name, price, weight);
    }

    void chocolateDescription()
    {
        System.out.println("Chocolate name: Diary Milk");
    }
}