
import java.util.Locale;
import java.util.Scanner;

public class Programa {
/*
 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
 * */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Product produto = new Product();
		
		System.out.println("Dados do produto:");
		System.out.print("nome = ");
		produto.name = ler.nextLine();
		//System.out.println(" ");
		System.out.print("preço = ");
		produto.price = ler.nextDouble();
		//System.out.println(" ");
		System.out.print("quantidade = ");
		produto.quantity = ler.nextInt();
		//System.out.println(" ");
		
		//mostrar valores de entrada
		System.out.println(produto);

        //realizar entrada no estoque
        System.out.println("Enter the number of products to be added in stock: ");
        int atualizarStock = ler.nextInt();

        produto.addProducts(atualizarStock);

        //mostrar valores atualizados
		System.out.println("update data: "+ produto);
		
        //realizar entrada no estoque
        System.out.println("Enter the number of products to be removed from stock: ");
        atualizarStock = ler.nextInt();
        produto.removeProducts(atualizarStock);

        //mostrar valores atualizados
		System.out.println("Update data: " + produto);

		ler.close();
	}
}
