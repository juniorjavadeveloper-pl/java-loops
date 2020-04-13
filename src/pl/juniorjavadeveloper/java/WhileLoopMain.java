package pl.juniorjavadeveloper.java;

public class WhileLoopMain {
    public static void main(String[] args) {
        int count = 1;

        // pętla while
        // while(warunek zakończenia pętli)
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // while - początek deklaracji pętli
        // count < 3 - warunek zakończenia pętli
        while (count < 3) {
            System.out.println("Licznik: " + count);
            count++;
        }
    }
}
