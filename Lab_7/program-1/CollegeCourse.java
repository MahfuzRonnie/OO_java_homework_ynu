package com.company.edu.ynu.lab7;

public class CollegeCourse {
    private double cost;
    protected double price;
    private int id;

    public CollegeCourse(int number)
    {
        id = number;
        cost = 180.00;
    }

    public void computePrice()
    {
        price = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public int getid()
    {
        return id;
    }

    public void print()
    {
        System.out.println("The cost of your course is $" + price);
    }
