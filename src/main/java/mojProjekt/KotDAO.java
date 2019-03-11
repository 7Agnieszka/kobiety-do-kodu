package mojProjekt;

import java.util.ArrayList;
import java.util.List;

/*Zmodyfikuj program który ju¿ napisa³aœ. Utwórz now¹ klasê o 
 * nazwie KotDAO, posiadaj¹c¹ metodê dodajKoa(Kot kot) oraz pole 
 * koty bêd¹ce kolekcj¹ (list¹).

Na pocz¹tku programu utwórz nowy obiekt KotDAO. Po tym, jak wype³nisz 
obiekt Kot wywo³aj jego metodê dodajKota przekazuj¹c jako argument 
utworzony i wype³niony wczeœniej obiekt. Metoda dodajKota powinna
 dodaæ kotka przekazanego w argumencie do kolekcji (listy).*/



public class KotDAO {
	
	List<Koty> listaKoty = new ArrayList<Koty>();
	
	public void dodajKota(Koty kot) {
	
	listaKoty.add(kot);
	}
	
	
	public void wypiszListe() {
		
		for(Koty k : listaKoty)
		{
			System.out.println(listaKoty.indexOf(k) + ". " + k.getImie() );
		}
		
	}
	
	public void przedstaw(int i) {
		
		listaKoty.get(i).przedstawSie();
		
	}
	
	
}
