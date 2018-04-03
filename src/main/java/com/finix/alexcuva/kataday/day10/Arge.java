package com.finix.alexcuva.kataday.day10;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int nb_year = 0;
        int totalPopulation = p0;
        double percentage = percent/100;
        while (totalPopulation < p) {
            nb_year++;
            totalPopulation = totalPopulation + ((int) (totalPopulation * percentage) + aug);
        }
        return nb_year;
    }
}