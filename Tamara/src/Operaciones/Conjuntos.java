package Operaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conjuntos {
	public static void main(String[] args) {
	
	int elemento;	
	
	List<Integer> lista = new ArrayList<Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Numero de elementos del vector A");
	elemento = sc.nextInt();
	
	for (int i=0; i<elemento; i++) {
		elemento = sc.nextInt();
		if(!lista.contains(elemento)) {
			lista.add(elemento);
		}
		
	}
	
	System.out.println("Numero de elementos del vector B");
	elemento = sc.nextInt();
	
	for (int i=0; i<elemento; i++) {
		elemento = sc.nextInt();
		if(!lista.contains(elemento)) {
			lista.add(elemento);
		}
		
	}
	
	System.out.println("Union");
	
	for(Integer k : lista) {
		System.out.print(k);
	}
	
	
	
}
}