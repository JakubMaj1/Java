package com.company;

public abstract class mercedes extends Car {

    private String marka;

public mercedes(String kolor, double silnik, int drzwi){

    super(kolor,silnik,drzwi);
    this.marka = "Mercedes";
    public void stop()
    {
        System.out.println("Samochod sie zatrzyma");
    }
    public void skrec w prawo()
    {
        System.out.println("SAmoch�d skreca w prawo");
    }

    public void pokazModel() {
        System.out.println("Model: "+this.marka);
    }
}

