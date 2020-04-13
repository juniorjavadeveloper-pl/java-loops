package pl.juniorjavadeveloper.java;

public class DoWhileLoopMain {
    public static void main(String[] args) {
        int count = 1;

        // pętla do-while
        // do - ciało pętli while
        // while(warunek zakończenia pętli)
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // do - początek deklaracji pętli
        // count < 3 - warunek zakończenia pętli
        do {
            System.out.println("Licznik: " + count);
            count++;
        } while (count < 3);
    }
}
