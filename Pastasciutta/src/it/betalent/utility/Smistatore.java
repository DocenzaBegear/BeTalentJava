package it.betalent.utility;

import it.betalent.entity.Pasta;

public class Smistatore {

	public Pasta[] cotturaBreve(Pasta[] magazzino) {
		Pasta[] selezione = new Pasta[4];
		int index = 0;
		for (Pasta item : magazzino) {
			if (item.tempoCottura <= 10) {
				selezione[index] = item;
				index++;
			}
		}
		return selezione;
	}
	
	public Pasta[] cotturaLunga(Pasta[] magazzino) {
		Pasta[] selezione = new Pasta[3];
		int index = 0;
		for (Pasta item : magazzino) {
			if (item.tempoCottura > 10) {
				selezione[index] = item;
				index++;
			}
		}
		return selezione;
	}

}
