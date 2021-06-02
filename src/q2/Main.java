package q2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//Integer
		Produto<Integer> p1 = new Produto<Integer>(1, 25.00, LocalDate.of(2021, 03, 11), LocalDate.of(2022, 07, 11));
		System.out.println(p1.toString());
		
		//String
		Produto<String> p2 = new Produto<String>("2", 29.00, LocalDate.of(2020, 05, 05), LocalDate.of(2021, 05, 05));
		System.out.println(p2.toString());
	}

}
