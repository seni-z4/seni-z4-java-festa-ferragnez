package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class javaFestaFerragnez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* creare un array di utenti che sono state invitati alla festa
		 * se ce il nome nella lista allora puo entrare se no nn puo entrare*/
		
		//creare un array di invitati
		
		String [] invitati = {"Dua Lipa","Paris Hilton","Manuel Agnelli" , "J-Ax","Francesco Totti" , "Ilary Blasi","Bebe Vio",
				"Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};

		System.out.println(Arrays.toString(invitati));
		
		
		//creare un scanner object
		Scanner input = new Scanner(System.in);
		
		//devi chiedere il utente di inserire il suo nome
		System.out.println("inserici il tuo nome e cognome");
		String nome = input.nextLine();
		System.out.println("# " + nome + " #");
		
		//for each loop 
		
		boolean found = false;
		for(String personi : invitati) {
			if(personi.equals(nome)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("sei stato invitato alla festa");
		}else {
			System.out.println("non sei stato invitato alla festa, mi dispiace!");
		}
		
	}

}
