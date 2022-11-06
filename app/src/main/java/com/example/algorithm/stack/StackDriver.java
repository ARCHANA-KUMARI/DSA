package com.example.algorithm.stack;

import java.util.Scanner;

/**
 * @Author: Archana Kumari
 * @Date: 06-11-2022
 */
public class StackDriver {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1. to push:");
            System.out.println("Press 2. to pop:");
            System.out.println("Press 3. to peek:");
            System.out.println("Press 4. to display:");
            System.out.println("Press 5. to exit:");
            System.out.println("Enter your choice to perform stack operation");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer to insert in stack");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    int data = stack.pop();
                    if(data != -1)
                      System.out.println("Popped item = " + stack.pop());
                    break;
                case 3:
                    System.out.println("Peeked data from stack " + stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
