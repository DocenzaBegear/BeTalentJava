package it.begear.corso.manipolazione;

public class StringB {
	
	public static void main(String[] args) {	
		
		//charAt(), indexOf(), length(), and substring()
		
		StringBuilder sb = new StringBuilder("Tucano");
		
		//Concatenare StringBuilder
		//StringBuilder append(String str)
		sb.append(" strano");
		System.out.println("Append: " + sb);
		
		//Inserire stringhe negli StringBuilder
		//StringBuilder insert(int index, String str)
		sb.insert(7, "molto ");
		System.out.println("Inserzione: " + sb);
		
		//Cancellare in uno Stringbuilder
		//StringBuilder delete(int start, int end)
		sb.delete(7, 13);
		System.out.println("Cancellazione: " + sb);
		
		//Cancellazione di un carattere singolo
		//StringBuilder deleteCharAt(int index)
		sb.deleteCharAt(6);
		System.out.println(sb);
		
		//Capovolgimento
		//StringBuilder reverse()
		sb.reverse();
		System.out.println(sb);
		
		//ToString!!
		sb.toString();
		
		/*
		
		String toString()
		*/

	}

}
