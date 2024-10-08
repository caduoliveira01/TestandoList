package application;

import java.util.Scanner;

import entities.Employee;

import java.util.List;
import java.util.ArrayList;

public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        List<Employee> list  = new ArrayList<>();

        for(int i = 0 ;i<n;i++){
            System.out.println();
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id:");
            Integer id= sc.nextInt();
            System.out.print("Name:");
            sc.nextLine();
            String name= sc.nextLine();
            System.out.print("Salary:");
            Double salary= sc.nextDouble();

            Employee emp = new Employee(id,name,salary);

            list.add(emp);
        }
        
        System.out.println("Enter the employee id that will be salary increase:");
        int idincrease= sc.nextInt();
        Employee emp = list.stream().filter(x ->  x.getid() == idincrease).findFirst().orElse(null);

        if (emp==null) {
            System.out.println("There isn't a employee with this id");
        }
        else{
            System.out.println("How much percentage do you want increase?:");
            double percente = sc.nextDouble();
            emp.IncreaseSalary(percente);
        }

        for(Employee e : list){
            System.out.println(e);
        }

        sc.close();
    }
}