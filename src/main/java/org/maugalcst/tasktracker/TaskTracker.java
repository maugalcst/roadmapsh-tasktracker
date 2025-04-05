package org.maugalcst.tasktracker;

import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa argumento");
        args[0] = scan.next();

        System.out.println(args[0]);

    }
}
