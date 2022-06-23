package src.runner;

import src.task1.Task1;
import src.task2.Task2;
import src.task3.MyClass;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO Task1:
        Task1 task1 = new Task1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day:");
        task1.setDay(sc.nextLine());
        System.out.println("Enter month:");
        task1.setMonth(sc.nextLine());
        System.out.println("Enter year:");
        task1.setYear(sc.nextLine());

        task1.getDayOfWeek(task1.getDay(), task1.getMonth(), task1.getYear());
        sc.close();

        // TODO Task2:
        Task2.getTuesdayDate();

        // TODO Task3:
        System.out.println("ENTER VALUE 1 OR 2:");
        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass();
        myClass.answer(scanner.nextInt());
    }
}

