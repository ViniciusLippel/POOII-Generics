package q4;

public class Main {

	public static void main(String[] args) {
		//Criando objetos Valor de tipo genérico
		Valor<Double> a = new Valor<Double>("abc123", 37.5);
		Valor<String> b = new Valor<String>("cba321", "Hello world!");
		Valor<Boolean> c = new Valor<Boolean>("abc123", false);
		
		//Criando lista
		ListaValor lista = new ListaValor();
		
		//Adicionando na lista
		if(lista.add(a))
			System.out.println("Adicionado");
		else
			System.out.println("Chave Repetida");
		
		if(lista.add(b))
			System.out.println("Adicionado");
		else
			System.out.println("Chave Repetida");
		
		if(lista.add(c))
			System.out.println("Adicionado");
		else
			System.out.println("Chave Repetida");
		
		//mostrando lista
		System.out.print("\nLista: ");
		lista.mostrar();
		
		//Buscando valor na lista pela chave
		System.out.println("\nBuscando pela chave abc123...");
		Valor<?> v = lista.buscaPorChave("abc123");
		if(v != null)
			System.out.println(v.toString());
		else
			System.out.println("Valor não encontrado");
		
		System.out.println("\nBuscando pela chave xyz032...");
		v = lista.buscaPorChave("xyz032");
		if(v != null)
			System.out.println(v.toString());
		else
			System.out.println("Valor não encontrado");
	}

}
