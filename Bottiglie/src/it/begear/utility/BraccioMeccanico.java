package it.begear.utility;

import java.util.Scanner;

import it.begear.entity.Bottiglia;
import it.begear.exception.ControlloStatoBottigliaEx;

public class BraccioMeccanico {
	
	Scanner scan = new Scanner(System.in);
	
	public Bottiglia svuota(Bottiglia bot) throws ControlloStatoBottigliaEx {
		if (bot.isPiena()) {
			bot.setPiena(false);
			return bot;
		} else {
			throw new ControlloStatoBottigliaEx();
		}
	}
	
	public Bottiglia riempi(Bottiglia bot) {
		if (bot.isPiena()) {
			System.out.println("La bottiglia è già piena");
			return bot;
		} else  {
			System.out.println("Voi metterci un alcolico(1) o un analcolico(2)? ");
			int scelta = scan.nextInt();
			switch (scelta) {
			case 1:
				bot.setPiena(true);
				bot.setAlcolico(true);
				break;
			
			case 2:
				bot.setPiena(true);
				bot.setAlcolico(false);
				break;
			}
			return bot;
		}
	}
	
	public void stampaMagazzino(Bottiglia[] magazzino) {
		for (Bottiglia item : magazzino) {
			System.out.println(item);
		}
	}

}
