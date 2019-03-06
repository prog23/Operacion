package Operaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conjuntos {
	public static void main(String[] args) {
	
	int a;	
	int b;
	
	List<Integer> lista = new ArrayList<Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Numero de elementos del vector A");
	a = sc.nextInt();
	
	for (int i=0; i<a; i++) {
		a = sc.nextInt();
		if(!lista.contains(a)) {
			lista.add(a);
		}
		
		
	}
	
	System.out.println("Numero de elementos del vector B");
	b = sc.nextInt();
	
	for (int i=0; i<b; i++) {
		b = sc.nextInt();
		if(!lista.contains(b)) {
			lista.add(b);
		}
		
	}
	
	System.out.println("Union");
	
	for(Integer k : lista) {
		System.out.print(k+" ");
		
	}
	
	
	
}
}