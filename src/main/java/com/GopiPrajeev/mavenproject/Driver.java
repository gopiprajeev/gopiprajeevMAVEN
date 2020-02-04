package com.GopiPrajeev.mavenproject;

import java.util.*;

class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int weight = 0;
        int price = 0;
        String name = "";

        System.out.println("Enter chocolate details: ");
        System.out.println("Enter details of Kitkat: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter weight: "); 
        weight = sc.nextInt();
        System.out.println("Enter price: ");
        price = sc.nextInt();

        Kitkat kitkat = new Kitkat(name, weight, price);

        System.out.println("Enter chocolate details: ");
        System.out.println("Enter details of Diary Milk: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter weight: "); 
        weight = sc.nextInt();
        System.out.println("Enter price: ");
        price = sc.nextInt();

        DiaryMilk diaryMilk = new DiaryMilk(name, weight, price);

        System.out.println("Enter chocolate details: ");
        System.out.println("Enter details of 5 Star: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter weight: "); 
        weight = sc.nextInt();
        System.out.println("Enter price: ");
        price = sc.nextInt();

        FiveStar fiveStar = new FiveStar(name, weight, price);

        ArrayList<Chocolate> chocolateList = new ArrayList<Chocolate>();
        chocolateList.add(kitkat);
        chocolateList.add(fiveStar);
        chocolateList.add(diaryMilk);

        for(Chocolate c:chocolateList)
            System.out.println(c);

        int totalWeight = 0;
        for(Chocolate c:chocolateList)
            totalWeight+=c.getChocolateWeight();

        System.out.println("Total chocolates weight is: "+totalWeight);

        Collections.sort(chocolateList, new ChocolateSorter());
        System.out.println("After sorting chocolates based on weight: ");
        for(Chocolate c:chocolateList)
            System.out.println(c);

        System.out.println("\n\nEnter sweet details: ");
        System.out.println("Enter Rasmalai details: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextInt();
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        Rasmalai rasmalai = new Rasmalai(name, price, weight);

        System.out.println("Enter Laddoo details: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextInt();
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        Laddoo laddoo = new Laddoo(name, price, weight);

        System.out.println("Enter Kaju Barfi details: ");
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextInt();
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        KajuBarfi kajuBarfi = new KajuBarfi(name, price, weight);

        ArrayList<Sweet> sweetsList = new ArrayList<Sweet>();
        sweetsList.add(laddoo);
        sweetsList.add(kajuBarfi);
        sweetsList.add(rasmalai);

        for(Sweet s:sweetsList)
            System.out.println(s);

        totalWeight = 0;

        for(Sweet s:sweetsList)
            totalWeight+=s.getSweetWeight();

        System.out.println("Total sweets weight: "+totalWeight);
    }
}