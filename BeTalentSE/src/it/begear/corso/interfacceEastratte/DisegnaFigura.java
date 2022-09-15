package it.begear.corso.interfacceEastratte;

public interface DisegnaFigura {

//Posso accedervi come un attributo statico con DisegnaFigura.spessoreLinea
//Le variabili nelle interfacce sono SEMPRE pubbliche, anche se non � esplicitato
	double spessoreLinea = 0.4;

//Dovr� essere implementato dalla classe che implementa l'interfaccia
	void disegnafigura();
	
//Accesso statico 
	public static void alert(String text){
        System.out.println(text);
    }

//I metodi default hanno il il corpo
	default void coloraFigura() {
		System.out.println("La figura � stata colorata di nero");
	}
}

/*
Nella classe di implementazione posso sfruttare il polimorfismo e 
dichiarare per esempio DisegnaFigura quarato1 = new Quadrato()
...o rettangolo, triangolo, cerchio.
Cos� potr� accedere alle variabili della interfaccia.
*/ 