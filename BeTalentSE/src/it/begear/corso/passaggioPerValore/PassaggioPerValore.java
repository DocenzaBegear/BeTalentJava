package it.begear.corso.passaggioPerValore;

public class PassaggioPerValore { 

    public static void main(String[] args) {
        int n = 30;
        System.out.println("n vale " + n); // Stampa 30
        nonModifica(n);
        System.out.println("n vale ancora " + n); // Stampa 30
    }
 
    // qui dichiariamo che il valore di n va dentro i
    public static void nonModifica(int i) {   
        System.out.println("i vale " + i); // Stampa 30 
        i = 0;
        System.out.println("adesso i vale " + i); // Stampa 0
    }
    
}