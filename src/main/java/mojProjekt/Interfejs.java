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
        
        do {
        obiekt.komunikuj("Podaj date urodzenia");
        datka = sc.nextLine();
        try {
            d = LocalDate.parse(datka, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        } catch (DateTimeParseException ex) {
            System.out.println("Cos jest nie tak z formatem daty! ");
        }}while(d == null);
       


        obiekt.przedstawSie(imie, opiekun, waga, d);

        sc.close();
    }

    
}



