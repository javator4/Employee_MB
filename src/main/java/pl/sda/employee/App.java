package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.*;
import pl.sda.employee.model.*;
import pl.sda.employee.service.*;
import pl.sda.employee.view.*;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println(EmployeeDatabase.employeeList);
        EmployeeDatabase.employeeList.add(new Employee("sad","as",'K',2));
        System.out.println(EmployeeDatabase.employeeList);


        while (true) {
            System.out.println("1. dodoaj pracownika");
            System.out.println("2. pokaż pracownika");
            System.out.println("0. zakończ pracę programu");


            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            if(value == 0) { break ;}

            EmployeeController controller = new EmployeeController(new EmployeeView(), new EmployeeService());


            switch (value) {
                case 1:
                    controller.prepareEmployee();
                    break;
                case 2:
                    controller.showEmployee();
                    break;
                case 0:
                    break;
            }
            System.out.println(EmployeeDatabase.employeeList);
        }}
}