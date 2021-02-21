package com.company;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Calculation calculation1 = new Calculation();
    Manager manager1 = new Manager();
    BackEndDeveloper backender1 = new BackEndDeveloper();
    FrontEndDeveloper frontender1 = new FrontEndDeveloper();
    Designer designer1 = new Designer();
    QA qa1 = new QA();
    public int employeenumber;
    int months = 0;
    int cost = 0;
    public void menu() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("1: Create project");
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("You need employees (Manager,Back-end and Front-end developer,Designer,QA-Engineer)");
            System.out.println("Enter number of Managers: ");
            employeenumber = sc.nextInt();

            manager1.setNumberOfManager(employeenumber);
            System.out.println(manager1.getNumberOfManager());
            System.out.println("Enter number of Back-end developers: ");
            employeenumber = sc.nextInt();

            backender1.setNumberOfBackDev(employeenumber);
            System.out.println("Enter number of Front-end developers: ");
            employeenumber = sc.nextInt();

            frontender1.setNumberOfFrontDev(employeenumber);
            System.out.println("Enter number number of Designers: ");
            employeenumber = sc.nextInt();

            designer1.setNumberOfDesigner(employeenumber);
            System.out.println("Enter number number of QA: ");
            employeenumber = sc.nextInt();

            qa1.setNumberOfQA(employeenumber);
            System.out.println("How much time will your project take? (enter in months): ");
            months = sc.nextInt();
            cost = calculation1.calculations(manager1.getNumberOfManager(), backender1.getNumberOfBackDev(),
                    frontender1.getNumberOfFrontDev(),designer1.getNumberOfDesigner(),qa1.getNumberOfQA(),months);
            System.out.println("Your project will cost: " + "$" + cost);
        }
    }
}
