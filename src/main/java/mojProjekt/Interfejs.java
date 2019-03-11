package mojProjekt;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import mojProjekt.Koty;

public class Interfejs {

	public void komunikuj(String napis) {
		System.out.println(napis);
	}

	public void przedstawSie(String imie, String opiekun, float waga, LocalDate data) {
		Koty kot = new Koty();
		
		kot.setImie(imie);
		kot.setImieOpiekuna(opiekun);
		kot.setWaga(waga);
		kot.setData(data);
		kot.przedstawSie();
		
	}

	public static void main(String[] args) {
		
		Koty kot = new Koty();
		KotDAO lista = new KotDAO();
		Interfejs obiekt = new Interfejs();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String imie, opiekun, datka;
		float waga = 0;
		LocalDate d = null;

		String w = "0";

		while (true) {

			System.out.println("Witaj w naszej bazie kotów!");
			System.out.println("Wybierz opcjê:");
			System.out.println("1 Dodaj kota");
			System.out.println("2 Wybierz kota z listy");
			System.out.println("x zakoñcz program");

			w = sc.nextLine();

			if (w.equals("1")) {
				obiekt.komunikuj("Podaj imie kota");
				imie = sc.nextLine();
				obiekt.komunikuj("Podaj imie opiekuna kota");
				opiekun = sc.nextLine();

				do {
					obiekt.komunikuj("Podaj wage kota");
					try {
						waga = Float.parseFloat(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("Nie liczba");
					}
				} while (waga == 0);

				do {
					obiekt.komunikuj("Podaj date urodzenia");
					datka = sc.nextLine();
					try {
						d = LocalDate.parse(datka, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
					} catch (DateTimeParseException ex) {
						System.out.println("Cos jest nie tak z formatem daty! ");
					}
				} while (d == null);

				//obiekt.przedstawSie(imie, opiekun, waga, d);
				
				kot.setImie(imie);
				kot.setImieOpiekuna(opiekun);
				kot.setWaga(waga);
				kot.setData(d);
				kot.przedstawSie();
				
				lista.dodajKota(kot);

			}

			else if (w.equals("2")) {
				lista.wypiszListe();
				lista.przedstaw(sc.nextInt());
			}

			else if (w.equals("x"))
				break;

			else
				System.out.println("Nie ma takiej opcji");

		}

		System.out.println("Dziêki za skorzystanie z programu!");

		sc.close();

	}

	public static LocalDate zamienDate(String datka) throws DateTimeParseException {
		if (datka == null || datka.equals(""))
			return LocalDate.MIN;
		return LocalDate.parse(datka, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
