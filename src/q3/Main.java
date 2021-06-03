package q3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Criando produtos do tipo ProdutoX
		ProdutoX nokia = new ProdutoX(1, 300, "Nokia", LocalDate.of(2021, 6, 1));
		ProdutoX apple = new ProdutoX(2, 7000, "Apple", LocalDate.of(2021, 2, 23));
		ProdutoX samsung = new ProdutoX(3, 2000, "Samsung", LocalDate.of(2020, 12, 31));
		
		//Criando pedido
		Pedido pedido = new Pedido();
		
		//Criando objeto Produto que pode receber produtos de tipo genérico (ProdutoX, ProdutoY, etc.)
		Produto<ProdutoX> p = new Produto<ProdutoX>(nokia, 2);
		//Adicionando em pedido
		pedido.addProduto(p);
		
		p = new Produto<ProdutoX>(apple, 7);
		pedido.addProduto(p);
		
		p = new Produto<ProdutoX>(samsung, 1);
		pedido.addProduto(p);
		
		System.out.println(pedido.mostrarListaProdutos());
	}

}
