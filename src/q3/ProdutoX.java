package q3;

import java.time.LocalDate;

public class ProdutoX {
	private int id;
	private double preco;
	private String fabricante;
	private LocalDate dtFabricacao;
	
	public ProdutoX() {
		
	}
	
	public ProdutoX(int id, double preco, String fabricante, LocalDate dtFabricacao) {
		super();
		this.id = id;
		this.preco = preco;
		this.fabricante = fabricante;
		this.dtFabricacao = dtFabricacao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public LocalDate getDtFabricacao() {
		return dtFabricacao;
	}
	public void setDtFabricacao(LocalDate dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [id=");
		builder.append(id);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", fabricante=");
		builder.append(fabricante);
		builder.append(", dtFabricacao=");
		builder.append(dtFabricacao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
