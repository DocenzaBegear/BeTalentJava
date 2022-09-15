package it.beTalent.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import it.beTalent.entity.Cliente;
import it.beTalent.entity.Coupon;
import it.beTalent.utility.GestioneCoupon;

public class Main {

	public static void main(String[] args) {

		LinkedList<Cliente> listaClienti = new LinkedList<Cliente>();
		LinkedList<Coupon> listaCoupon = new LinkedList<Coupon>();
		Scanner scan = new Scanner(System.in);
		int contatore = 0;

		System.out.println("Inserire il numero di clienti: ");
		int numeroClienti = scan.nextInt();
		//Creazione lista clienti
		while (contatore < numeroClienti) {
			Cliente cli = new Cliente(contatore+1);
			listaClienti.addLast(cli);
			contatore++;
		}

		contatore = 0;
		System.out.println("Inserire il numero di coupon: ");
		int numeroCoupon = scan.nextInt();
		//Creazione coupon
		while (contatore < numeroCoupon) {
			Coupon coup = new Coupon(contatore+1);
			listaCoupon.addLast(coup);
			contatore++;
		}

		GestioneCoupon gestioneC = new GestioneCoupon();

		ArrayList<Cliente> clientiElaborati = gestioneC.assegnazione(listaClienti, listaCoupon);
		clientiElaborati.toArray();

		for (Cliente item : clientiElaborati) {
			System.out.println("Qui: " + item);
		}

	}

}
