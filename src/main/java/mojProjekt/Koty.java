package mojProjekt;

import java.time.LocalDate;


public class Koty {

    String imie;
    Float waga;
    LocalDate data;
    String imieOpiekuna;

    public void przedstawSie() {
        System.out.println("Mam na imi� " + imie + " miau!");
        System.out.println("M�j opiekun ma na imi� " + imieOpiekuna + " miau!");
        System.out.println("Wa�� " +  waga + "kg miau!");
        System.out.println("Urodzi�em si� " + data + " miau!");
        
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

    /*public static void main( String[] args)

{

}*/
}