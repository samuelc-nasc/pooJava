package folha_de_pagamento_simples;

import java.util.Locale;
import java.util.Scanner;

public class Main_employer {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        Employer funcionario = new Employer();
    
        System.out.print("Name: ");
        funcionario.name = ler.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.gross_salary = ler.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = ler.nextDouble();

        System.out.println(funcionario);

        System.out.println("Which percentage to increase salary?");
        double percent = ler.nextDouble();
        funcionario.increaseSalary(percent);
        
        System.out.println("Update data = " + funcionario);
        ler.close();
    }


}
