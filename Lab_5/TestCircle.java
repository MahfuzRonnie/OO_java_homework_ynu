package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCircle{

    public static void main(String[] args) {
        Circle circleA = new Circle();
        Circle circleB = new Circle();
        System.out.println("please input circleA's radius：");
        Scanner scan = new Scanner(System.in);
        double radiusA = scan.nextDouble();
        circleA.setRadius(radiusA);
        System.out.println("please input circleB's radius：");
        double radiusB = scan.nextDouble();
        circleB.setRadius(radiusB);
        double diameterA = circleA.computerDiameter();
        double areaA = circleA.computerArea();
        double diameterB = circleB.computerDiameter();
        double areaB = circleB.computerArea();
        System.out.println("The area of a is "+ areaA);
        System.out.println("The diameter of a is "+ diameterA);
        System.out.println("The area of b is "+ areaB);
        System.out.println("The diameter of b is "+ diameterB);


    }

}
