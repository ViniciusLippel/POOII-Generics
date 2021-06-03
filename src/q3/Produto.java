package q3;

public class Produto<T> {
	
	private T produto;
	private int quantidade;
	
	public Produto(T produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public T getProduto() {
		return produto;
	}

	public void setProduto(T produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [produto=");
		builder.append(produto.toString());
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
}
