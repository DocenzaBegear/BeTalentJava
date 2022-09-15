package it.begear.corso.interfacceEastratte;

public interface DisegnaFigura {

//Posso accedervi come un attributo statico con DisegnaFigura.spessoreLinea
//Le variabili nelle interfacce sono SEMPRE pubbliche, anche se non è esplicitato
	double spessoreLinea = 0.4;

//Dovrà essere implementato dalla classe che implementa l'interfaccia
	void disegnafigura();
	
//Accesso statico 
	public static void alert(String text){
        System.out.println(text);
    }

//I metodi default hanno il il corpo
	default void coloraFigura() {
		System.out.println("La figura è stata colorata di nero");
	}
}

/*
Nella classe di implementazione posso sfruttare il polimorfismo e 
dichiarare per esempio DisegnaFigura quarato1 = new Quadrato()
...o rettangolo, triangolo, cerchio.
Così potrò accedere alle variabili della interfaccia.
*/ 