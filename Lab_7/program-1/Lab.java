package com.company.edu.ynu.lab7;

public class Lab extends CollegeCourse{
    public Lab(int number)
    {
        super(number);
    }

    public void computePrice()
    {
        super.computePrice();
        price += 25;
        System.out.println("there is a $25.00 lab fee.");
    }
}
