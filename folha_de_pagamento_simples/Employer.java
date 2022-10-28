package folha_de_pagamento_simples;

public class Employer {
    public String name;
    public double gross_salary;
    public double tax;

    public double netSalary(double tax, double gross_salary){
        return (gross_salary - tax);
    }

    public void increaseSalary(double percent){
        this.gross_salary += (this.gross_salary/100 * percent);
    }

    public String toString(){
        return "Name = "
        + name
        + " "
        + ", $ "
        + String.format("%.2f", netSalary(tax, gross_salary));
    }


}
