package boletim;

public class Student {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double soma(){
        return (n1+n2+n3);
    }

    public double missingPoints(){
        if(soma()<60){
            return 60 - soma();
        }
        else{
            return 0.0;
        }
    }
}
