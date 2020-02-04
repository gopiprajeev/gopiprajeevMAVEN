package com.GopiPrajeev.mavenproject;
import java.util.*;

public class ChocolateSorter implements Comparator<Chocolate>
{

    @Override
    public int compare(Chocolate c1, Chocolate c2) {
        return c2.getChocolatePrice()-c1.getChocolatePrice();
    }
}