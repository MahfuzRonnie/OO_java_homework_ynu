package com.company.edu.ynu.lab7;

public class UseCourse {

    public static void main(String[] args) throws Exception
    {
   
        CollegeCourse nolab = new CollegeCourse(12345);
        nolab.computePrice();
        nolab.print();
        Lab labcourse = new Lab(54321);
        labcourse.computePrice();
        labcourse.print();
    }
}
