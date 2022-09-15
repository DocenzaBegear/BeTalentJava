package it.begear.corso.polimorfismo.overload;

public class Overload extends SuperClasse {
    
    public float somma(int a, float b){
        return a + b;
    }
    
    public float somma(float a, int b){
        return a + b;
    }
    
    public int somma(int a, int b, int c){
        return a + b + c;
    }
    
    public double somma(int a, double b, int c){
        return a + b + c;
    }

}