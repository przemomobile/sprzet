package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    ArrayList<gry_zespolowe> gry = new ArrayList<>();

            gry.add(new siatkowka());
            gry.add(new pilka_nozna());

            uzyj(gry);

            }

public static void uzyj(ArrayList<gry_zespolowe> gry){
        gry.forEach(gryZespolowe -> gry_zespolowe.uzyj());

}
        }