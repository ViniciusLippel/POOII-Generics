package q1;

public class Caneta {
	
	private String cor;
	private double ponta;
	
	public Caneta(String cor, double ponta) {
		this.cor = cor;
		this.ponta = ponta;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caneta [cor=");
		builder.append(cor);
		builder.append(", ponta=");
		builder.append(ponta);
		builder.append("]");
		return builder.toString();
	}
	
	
}
