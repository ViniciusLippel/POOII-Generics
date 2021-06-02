package q1;

public class Main {

	public static void main(String[] args) {
		
		//Integer
		MeuDadoGenerico<Integer> i = new MeuDadoGenerico<Integer>(5);
		System.out.println(i.getDado());
		
		//String
		MeuDadoGenerico<String> s = new MeuDadoGenerico<String>("Oi");
		System.out.println(s.getDado());
		
		//Caneta
		MeuDadoGenerico<Caneta> c = new MeuDadoGenerico<Caneta>(new Caneta("Azul", 0.5));
		System.out.println(c.getDado().toString());
		
	}

}
