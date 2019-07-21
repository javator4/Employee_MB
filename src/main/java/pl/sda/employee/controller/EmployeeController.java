package pl.sda.employee.controller;

import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public  EmployeeController(EmployeeView employeeView, EmployeeService employeeService){
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }

    public void prepareEmployee(){
        // pobieranie danych
        // tworzenie obiektu employee
        // przeslanie obiektu do metody w serwisie addEmployee


        Scanner scanner = new Scanner(System.in);
        System.out.println("NAME");
        String name = scanner.nextLine();
        System.out.println("LASTNAME");
        String lastName = scanner.nextLine();
        System.out.println("SEX");
        char sex = scanner.next().charAt(0);
        System.out.println("DEPARTMENT NUMBER");
        int departmentNumber = scanner.nextInt();







    }

    public void showEmployee(){

    }


}
