package q3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoX p1 = new ProdutoX(1, 300, "Nokia", LocalDate.of(2021, 6, 1));
		ProdutoX p2 = new ProdutoX(2, 7000, "Apple", LocalDate.of(2021, 2, 23));
		ProdutoX p3 = new ProdutoX(3, 2000, "Samsung", LocalDate.of(2020, 12, 31));
		
		Pedido pedido = new Pedido();
		pedido.addProduto(p1);
		pedido.addProduto(p2);
		pedido.addProduto(p3);
		
		System.out.println(pedido.mostrarListaProdutos());
	}

}
