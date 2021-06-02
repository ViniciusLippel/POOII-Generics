package q1;

public class MeuDadoGenerico<T> {
	private T dado;
	
	public MeuDadoGenerico(T dado){
		this.dado = dado;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
	
	
}
