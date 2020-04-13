package pl.juniorjavadeveloper.java;

public class ClassicForLoopMain {
    public static void main(String[] args) {
        String[] colors = new String[2];
        colors[0] = "black";
        colors[1] = "white";

        // "klasyczna" pętla for
        // for(inicjalizacja; warunek końcowy; inkrementacja)
        // kolejne sekcje pętli for rozdzielane są średnikami ;
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // for - początek deklaracji pętli
        // int i = 0 - inicjalizacja - nadanie wartości początkowej zmiennej w pętli
        // i < colors.length - warunek końcowy - wartość dla której pętla się zatrzyma
        // i++ - inkrementacja - zwiększenie zmiennej/licznika w pętli
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];

            System.out.println("Bieżący kolor: " + color);
            System.out.println("i - indeks tablicy: " + i);
            System.out.println("colors[i] - wartość tablicy: " + colors[i]);
        }
    }
}
