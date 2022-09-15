package it.begear.corso.collections.list;

import java.util.*;

public class ProvaLista {
	
	public static void main(String[] args) {
		
		ArrayList<Fumetto> fumetti = new ArrayList<Fumetto>();
	
		Fumetto batman = new Fumetto("Batman", 5.0);
		Fumetto spiderman = new Fumetto("Spiderman", 5.0);
		Fumetto dylanDog = new Fumetto("Dylan Dog", 4.4);
		fumetti.add(spiderman);
		fumetti.add(batman);
		fumetti.add(dylanDog);
		
		System.out.println("size: " + fumetti.size());
		
		//Stampa di un ArrayList
		System.out.println("Prova: " +  fumetti);
		
		//Iterazione di un ArrayList
		for (Fumetto item : fumetti) {
			System.out.println("Lista: " + item);
		}
		
		System.out.println();
		
		//Copia di un ArrayList
		List<Fumetto> copiaFumetti = new ArrayList<Fumetto>(fumetti);
		
		for (Fumetto item : copiaFumetti) {
			System.out.println("copia: " + item.toString());
		}
		
		System.out.println();
		
		//swap
		Collections.swap(copiaFumetti, 0, 1);
		
		for (Fumetto item : copiaFumetti) {
			System.out.println("swap: " + item.toString());
		}
		
		System.out.println();
		
		//Iteratore. Utile per rimuovere elementi secondo una condizione
		Iterator<Fumetto> iter  = copiaFumetti.iterator();
		while (iter.hasNext()) {
			if (iter.next().getTitolo().equals("Spiderman")) {
			iter.remove();
			}
		}
		
		for (Fumetto item : copiaFumetti) {
			System.out.println("post remove: " + item.toString());
		}
		
		//LinkedList
		LinkedList<Fumetto> prova = new LinkedList<Fumetto>();
		prova.addFirst(spiderman);
		prova.addLast(batman);
		prova.getFirst();
		prova.getLast();
		prova.removeFirst();
		prova.removeLast();
		
		//Set
		HashSet<Fumetto> fumetteriaSet = new HashSet<Fumetto>(); 
		fumetteriaSet.isEmpty();
		fumetteriaSet.add(batman);
		fumetteriaSet.clear();
		fumetteriaSet.removeAll(copiaFumetti);
		fumetteriaSet.size();
		
		TreeSet<Integer> provaTree = new TreeSet<Integer>();
		provaTree.add(4);
		provaTree.add(2);
		provaTree.add(3);
		provaTree.add(1);
		
		for (Integer item : provaTree) {
			System.out.println("ProvaTree: " + item);
		}
		
	}

}