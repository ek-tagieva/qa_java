package com.example;
import java.util.List;
public class Lion {
    boolean hasMane;
    private final Feline feline;
    public Lion(String sex, Feline feline, boolean hasMane) throws Exception {
        this.feline = feline;
        this.hasMane = hasMane;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();
    public int getKittens() {

        return feline.getKittens();
    }
    public boolean doesHaveMane(){
        return hasMane;
    }
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
