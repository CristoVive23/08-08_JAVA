package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Informe os Dados do Produto");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		
		
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do Produto" + produto);
		System.out.println("");
		
		System.out.println("Digite  o número de produtos a serem adicionados no Estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println("Dados do Produto Atualizados: " + produto);
		System.out.println("");
		
		System.out.println("Digite  o número de produtos a removidos de Estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println("Dados de Produtos Remanescentes: " + produto);
		System.out.println("");
		
		sc.close();
	}

}
