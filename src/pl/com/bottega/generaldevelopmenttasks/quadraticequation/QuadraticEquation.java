package pl.com.bottega.generaldevelopmenttasks.quadraticequation;

import java.util.Scanner;

/**
 * Created by anna on 09.11.2016.
 */
public class QuadraticEquation {

    private double calculateDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private double calculateNegativeDelta(double a, double b, double c) {
        return Math.sqrt(4 * a * c - Math.pow(b, 2)) * Math.sqrt(-1);
    }

    private void deltaGreaterThenZero(double a, double b, double c){
        double x1 = (-b - Math.sqrt(calculateDelta(a, b, c))) / (2 * a);
        double x2 = (-b + Math.sqrt(calculateDelta(a, b, c))) / (2 * a);
        System.out.println("When delta is greater then zero, then the roots of the quadratic equation: x1 = " + x1 + " and x2 = " + x2);
    }

    private void deltaEqualsZero(double a, double b) {
        double x0 = - b / (2 * a);
        System.out.println("When delta is equal to zero, then the root of the quadratic equation: x0 = " + x0);
    }

    private void deltaLessThenZero(double a, double b, double c) {
        double x1 = (-b - calculateNegativeDelta(a, b, c)) / (2 * a);
        double x2 = (-b - calculateNegativeDelta(a, b, c)) / (2 * a);
        System.out.println("When delta is less then zero, then equation has no real roots, but have imaginary: x1 = " + x1 + " and x2 = " + x2);
    }

    private void viewEquation(double a, double b, double c) {
        if (b > 0 && c > 0)
            System.out.println("Equation: y = " + a + " x^2 + " + b + " x + " + c);

        if (b == 0 && c > 0)
            System.out.println("Equation: y = " + a + " x^2 + " + c);

        if (b == 0 && c < 0)
            System.out.println("Equation: y = " + a + " x^2 " + c);

        if (c == 0 && b > 0)
            System.out.println("Equation: y = " + a + " x^2 + " + b + " x");

        if (c == 0 && b < 0)
            System.out.println("Equation: y = " + a + " x^2 " + b + " x");

        if (b < 0 && c > 0)
            System.out.println("Equation: y = " + a + " x^2 " + b + " x + " + c);

        if (c < 0 && b > 0)
            System.out.println("Equation: y = " + a + " x^2 + " + b + " x " + c);

        if (b < 0 && c < 0)
            System.out.println("Equation: y = " + a + " x^2  " + b + " x  " + c);

        if (b == 0 && c == 0)
            System.out.println("Equation: y = " + a + " x^2");
    }

    private void extremum(double a, double b, double c) {
        double p = - b / 2 * a;
        double q = - calculateDelta(a, b, c) / 4 * a;
        System.out.println("A vertex of parabola:");
        if (a > 0)
            System.out.println("Minimum, parabola arms are directed to the top: p = " + p + ", q = " + q);

        if (a < 0)
            System.out.println("Maximum, parabola arms are directed to the bottom: p = " + p + ", q = " + q);
    }

    public void execute() {
        System.out.println("Enter a: ");
        double a = Double.valueOf(new Scanner(System.in).nextLine());
        while (a == 0) {
            System.out.println("a must be grater then zero, enter a correct: ");
            a = Double.valueOf(new Scanner(System.in).nextLine());
        }

        System.out.println("Enter b: ");
        double b = Double.valueOf(new Scanner(System.in).nextLine());

        System.out.println("Enter c: ");
        double c = Double.valueOf(new Scanner(System.in).nextLine());

        viewEquation(a, b, c);

        double delta = calculateDelta(a, b, c);
        System.out.println("Delta is equal to: " + delta);
        if (delta > 0)
            deltaGreaterThenZero(a, b, c);
        if (delta < 0)
            deltaLessThenZero(a, b, c);
        if (delta == 0)
            deltaEqualsZero(a, b);

        extremum(a, b, c);
    }
}
