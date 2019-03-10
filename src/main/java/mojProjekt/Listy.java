package mojProjekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class Listy
{
	
	public Listy()
	{
		// TODO Auto-generated constructor stub
	}
	
	public void metoda()
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("tekst");
		lista.add("tekst2");
		lista.add(0, "pierwszy");
		
		Koty k1 = new Koty();
		
		List<Koty> listaKoty = new ArrayList<Koty>();
		listaKoty.add(new Koty());
		listaKoty.add(k1);
		
		Map<String, Koty> mapa = new HashMap<String, Koty>();
		mapa.put("klucz", k1);
		mapa.put("klucz", k1);
		
		for(Koty fff:listaKoty)
		{
			fff.imie = "a";
		}
		
		
	}
	
}
