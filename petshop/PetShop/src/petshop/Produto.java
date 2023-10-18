package petshop;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Produto fora de estoque.");
        }
    }

    // Getters e setters
    // ...

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }

	public int getQuantidadeEmEstoque() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
