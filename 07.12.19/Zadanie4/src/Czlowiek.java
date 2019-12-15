public class Czlowiek {
    public int wiek;
    public String imie;
    public String nazwisko;

    public Czlowiek(int wiek , String imie , String nazwisko){
        this.wiek = wiek;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public String PrintInfo(){
        return "Imie: " + imie  + " nazwisko: " + nazwisko + " wiek: " + wiek;
    }
}
