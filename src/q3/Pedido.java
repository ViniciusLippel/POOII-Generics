package q3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<ProdutoX> listaProdutos = new ArrayList<ProdutoX>();
	
	public Pedido() {
	}
	
	public void addProduto(ProdutoX produto) {
		listaProdutos.add(produto);
	}
	
	public String mostrarListaProdutos() {
		StringBuilder b = new StringBuilder();
		for (int i=0; i<listaProdutos.size(); i++) {
			b.append(listaProdutos.get(i)+"\n");
		}
		return b.toString();
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [listaProdutos=");
		builder.append(listaProdutos);
		builder.append("]");
		return builder.toString();
	}
	
}
