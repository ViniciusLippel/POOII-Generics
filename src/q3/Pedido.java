package q3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<Produto<?>> listaProdutos;
	
	public Pedido() {
		listaProdutos = new ArrayList<Produto<?>>();
	}
	
	//add produto
	public void addProduto(Produto<?> produto) {
		//Verifica se Produto é do tipo ProdutoX
		if(produto.getProduto().getClass() == ProdutoX.class) {
			listaProdutos.add(produto);
		}
	}
	
	//mostrar lista
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
