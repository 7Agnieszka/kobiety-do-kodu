package mojProjekt;

import java.util.ArrayList;
import java.util.List;

/*Zmodyfikuj program kt�ry ju� napisa�a�. Utw�rz now� klas� o 
 * nazwie KotDAO, posiadaj�c� metod� dodajKoa(Kot kot) oraz pole 
 * koty b�d�ce kolekcj� (list�).

Na pocz�tku programu utw�rz nowy obiekt KotDAO. Po tym, jak wype�nisz 
obiekt Kot wywo�aj jego metod� dodajKota przekazuj�c jako argument 
utworzony i wype�niony wcze�niej obiekt. Metoda dodajKota powinna
 doda� kotka przekazanego w argumencie do kolekcji (listy).*/



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
