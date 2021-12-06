package zad2;

import java.util.ArrayList;
import java.util.List;

public class Glavna2 {

	public static void main(String[] args) {
		MetodiZaListaNiza m = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("V");
		m.listToArray(lista);

		String [] niza = {"a","b","v"};
		m.arrayToList(niza);
	}
}

