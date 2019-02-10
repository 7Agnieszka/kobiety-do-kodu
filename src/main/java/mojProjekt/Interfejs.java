package mojProjekt;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Interfejs
{
	
	public void komunikuj(String napis)
	{
		System.out.println(napis);
	}
	
	public void przedstawSie(String imie, String opiekun, float waga, LocalDate data)
	{
		Koty kot = new Koty();
		kot.setImie(imie);
		kot.setImieOpiekuna(opiekun);
		kot.setWaga(waga);
		kot.setData(data);
		kot.przedstawSie();
	}
	
	public static void main(String[] args)
	{
		
		Interfejs obiekt = new Interfejs();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String imie, opiekun, datka;
		float waga;
		LocalDate d = null;
		
		obiekt.komunikuj("Podaj imie kota");
		imie = sc.next();
		obiekt.komunikuj("Podaj imie opiekuna kota");
		opiekun = sc.next();
		obiekt.komunikuj("Podaj wage kota");
		waga = sc.nextFloat();
		obiekt.komunikuj("Podaj date urodzenia");
		datka = sc.next();
		try
		{
			d = LocalDate.parse(datka, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		}
		catch (DateTimeParseException ex)
		{
			System.out.println("Cos jest nie tak z formatem daty! " + ex.getMessage());
		}
		sc.close();
		obiekt.przedstawSie(imie, opiekun, waga, d);
	}
	
}
