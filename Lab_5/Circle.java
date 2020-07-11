package com.company;

public class Circle {
    private static double π =  3.14;

    public double radius;

    public double area;

    public double diameter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double computerDiameter() {
        return this.radius * 2;
    }

    public double computerArea() {
        return π *  Math.pow(this.radius,2);
    }

}
