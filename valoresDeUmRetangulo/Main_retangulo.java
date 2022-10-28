package valoresDeUmRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main_retangulo
/*******************************************************************************
Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.
*******************************************************************************/
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Retangule retangulo = new Retangule();
		
		System.out.println("Altura: ");
		retangulo.h = ler.nextDouble();
		System.out.println("Largura: ");
		retangulo.b = ler.nextDouble();

        System.out.println(retangulo);

		ler.close();
	}
}
