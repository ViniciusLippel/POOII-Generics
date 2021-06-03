package q4;

import java.util.ArrayList;
import java.util.List;

public class ListaValor {
	
	private List<Valor<?>> lista;
	
	public ListaValor() {
		lista = new ArrayList<Valor<?>>();
	}
	
	public boolean add(Valor<?> cv) {
		if (lista.size() != 0) {
			for(int i=0; i<lista.size(); i++) {
				if(cv.getChave() == lista.get(i).getChave())
					return false;
			}
		}
		lista.add(cv);
		return true;
	}
	
	public Valor<?> buscaPorChave(String chave){
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getChave() == chave) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	public void mostrar() {
		System.out.println(this.lista.toString());
	}
}
