package boletim;

import java.util.Locale;
import java.util.Scanner;

public class Main_student {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Student student = new Student();

        System.out.print("ALUNO = ");
        student.nome = ler.nextLine();
        System.out.print("Nota do 1o sem = ");
        student.n1 = ler.nextDouble();
        System.out.print("Nota do 2o sem = ");
        student.n2 = ler.nextDouble();
        System.out.print("Nota do 3o sem = ");
        student.n3 = ler.nextDouble();
        
        System.out.printf("FINAL GRADE = %.2f \n", (student.soma()));
        
        if(student.missingPoints() > 0.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS \n", (student.missingPoints()));
        }else{
           System.out.println("PASS"); 
        }

        ler.close();
    }
}
