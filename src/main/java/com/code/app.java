package com.code;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation solve = new QuadraticEquation();
        System.out.println(solve.fomat);
        System.out.println("Enter a: ");
        while (solve.a == 0) {
            solve.a = scanner.nextDouble();
            if (solve.a == 0) {
                System.out.println("Please Enter a!=0 . ");
            }
        }
        System.out.println("Enter b:  ");
        solve.b = scanner.nextDouble();
        System.out.println("Enter c:  ");
        solve.c = scanner.nextDouble();
        if (solve.delta() > 0) {
            System.out.println("The Equation have two roots: x1= " + x1(solve.a, solve.b, solve.delta()) + " x2= " + x2(solve.a, solve.b, solve.delta()));
        } else if (solve.delta() == 0) {
            System.out.println("The Equation has one root: x= " + x1(solve.a, solve.b, solve.delta()));
        } else System.out.println(" The Equation have no root");


    }

    @Contract(pure = true)
    private static double x1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    @Contract(pure = true)
    private static double x2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }


}
