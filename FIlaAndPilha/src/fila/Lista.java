package fila;

import java.util.Collections;
import java.util.LinkedList;

public class Lista {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		
		System.out.println("Lista normal: "+ lista);
		
		Collections.reverse(lista);
		
		System.out.println("Lista invertida: " + lista);
		
		
	}

}
