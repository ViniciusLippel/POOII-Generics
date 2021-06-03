package q2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//Id Integer
		Produto p1 = new Produto(new Id<Integer>(1), 25.00, LocalDate.of(2021, 03, 11), LocalDate.of(2022, 07, 11));
		System.out.println(p1.toString());
		
		//Id String
		Produto p2 = new Produto(new Id<String>("2"), 29.00, LocalDate.of(2020, 05, 05), LocalDate.of(2021, 05, 05));
		System.out.println(p2.toString());
	}

}
