package valoresDeUmRetangulo;

public class Retangule {

        public double h;
        public double b;
        
        public double area(double base, double altura){
           return base * altura; 
        }
        
        public double perimetro(double base, double altura){
            return ((base*2)+(altura*2));
        }
        
        public double diagonal(double base, double altura){
            return Math.sqrt((base*base)+(altura*altura));
        }

        public String toString(){
            return "AREA = "
            + String.format("%.2f", area(h, b))
            + "\n"
            + "PERIMETRO = "
            + String.format("%.2f", perimetro(h, b))
            + "\n"
            + "DIAGONAL = "
            +String.format("%.2f", diagonal(h, b));
        }
        
}
