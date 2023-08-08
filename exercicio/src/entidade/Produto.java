package entidade;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEstoque() {
		return preco*quantidade;
		
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removeProduto(int quantiade) {
		this.quantidade -= quantiade;
		
	}
	
	public String toString() {
		return nome
				+", $"
				+String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ "\n Total no Estoque: $"
				+ String.format("%.2f", totalEstoque());
	}
	
}
