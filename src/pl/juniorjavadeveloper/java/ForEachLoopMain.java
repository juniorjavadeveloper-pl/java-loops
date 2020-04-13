package pl.juniorjavadeveloper.java;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopMain {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");

        // pętla "for-each"
        // for(TypElementu element : elementy)
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // for - początek deklaracji pętli
        // String - typ elementu, który jest przechowywany przez listę
        // color - bieżący element pętli
        // : - rozdzielenie elementu od elementów
        // colors - elementy, po których pętla iteruje
        for (String color : colors) {
            System.out.println("Bieżący kolor: " + color);
        }
    }
}
