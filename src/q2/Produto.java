package q2;

import java.time.LocalDate;

public class Produto {
	
	private Id<?> id;
	private double valor;
	private LocalDate dtFab;
	private LocalDate dtVen;
	
	public Produto(Id<?> id, double valor, LocalDate dtFab, LocalDate dtVen) {
		this.id = id;
		this.valor = valor;
		this.dtFab = dtFab;
		this.dtVen = dtVen;
	}
	
	public Id<?> getId() {
		return id;
	}
	public void setId(Id<?> id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDtFab() {
		return dtFab;
	}
	public void setDtFab(LocalDate dtFab) {
		this.dtFab = dtFab;
	}
	public LocalDate getDtVeno() {
		return dtVen;
	}
	public void setDtVeno(LocalDate dtVen) {
		this.dtVen = dtVen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id.getId());
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dtFab=");
		builder.append(dtFab);
		builder.append(", dtVen=");
		builder.append(dtVen);
		builder.append("]");
		return builder.toString();
	}
	
	
}
