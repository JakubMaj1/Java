//package Zadanie5;

public class People implements Comparable {
    public int wiek;
    public String imie;

    public People(int wiek , String imie){
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}