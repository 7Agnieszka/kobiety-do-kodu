package mojProjekt;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import mojProjekt.Koty;


public class Interfejs {

    public void komunikuj(String napis) {
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

    public static void main(String[] args) {
        
        
        
        Interfejs obiekt = new Interfejs();
        Scanner sc = new Scanner(System.in, "UTF-8");
        String imie, opiekun, datka;
        float waga=0;
        LocalDate d = null;

        obiekt.komunikuj("Podaj imie kota");
        imie = sc.nextLine();
        obiekt.komunikuj("Podaj imie opiekuna kota");
        opiekun = sc.nextLine();
      
        do {
        	obiekt.komunikuj("Podaj wage kota");
            try {
                waga = Float.parseFloat(sc.nextLine());
            } 
            catch (NumberFormatException e) {
                System.out.println("Nie liczba");
            }
           }while(waga == 0);     
        obiekt.komunikuj("Podaj date urodzenia");
        datka = sc.nextLine();
        try {
            d = LocalDate.parse(datka, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        } catch (DateTimeParseException ex) {
            System.out.println("Cos jest nie tak z formatem daty! ");
        }
       
       // System.out.println(d);

        obiekt.przedstawSie(imie, opiekun, waga, d);
        
        //kot.setData(d);
//        kot.przedstawSie();
        sc.close();
    }
    
   // public static String getUserInput() {
  //      return sc.nextLine().trim();
    //}
    
}



/*
public class Interfejs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Koty kot = new Koty();

        System.out.print("Podaj imiê kota: ");
        kot.setImie(getUserInput());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        do {
            System.out.print("Podaj datê urodzenia kota w formacie RRRR.MM.DD: ");
            try {
                kot.setDataUrodzenia(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Coœ jest nie tak z formatem daty! Przyk³adowa data: 2014.01.05");
            }
        } while (kot.getDataUrodzenia() == null);

        do {
            System.out.print("Podaj wagê kota: ");
            try {
                kot.setWaga(Float.valueOf(getUserInput()));
            } catch (NumberFormatException nfe) {
                System.out.println("Coœ jest nie tak z formatem wagi! Przyk³adowa waga: 10.0");
            }
        } while (kot.getWaga() == null);

        System.out.print("Podaj kto jest opiekunem kota: ");
        kot.setImieOpiekuna(getUserInput());

        System.out.println("Dziêkujê, teraz wiem o kocie naprawdê wszystko!");
    }

    public static String getUserInput() {
        return sc.nextLine().trim();
    }

}
*/
