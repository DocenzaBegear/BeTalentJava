package it.beTalent.utility;

import java.util.ArrayList;
import java.util.LinkedList;

import it.beTalent.entity.Cliente;
import it.beTalent.entity.Coupon;

public class GestioneCoupon {

	public ArrayList<Cliente> assegnazione(LinkedList<Cliente> clienti, LinkedList<Coupon> coupon) {
		ArrayList<Cliente> clientiElaborati = new ArrayList<Cliente>();

		while (!clienti.isEmpty()) {
			if (!coupon.isEmpty()) {
				clienti.getFirst().numeroCoupon = coupon.getFirst().numero;
				clientiElaborati.add(clienti.getFirst());
				clienti.removeFirst();
				coupon.removeFirst();
			}
			else {
				clientiElaborati.add(clienti.getFirst());
				clienti.removeFirst();
			}
		}
		return clientiElaborati;
	}

}
