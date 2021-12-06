package zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna3 {

	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Real Madrid", "Fudbal", 16));
		list.add(new SportskiKlub("Barcelona", "Fudbal", 16));
		list.add(new SportskiKlub("Chelsea", "Fudbal", 16));

		Collections.sort(list);
		for (SportskiKlub a : list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrojClenovi());
			System.out.println();
		}
	}
}