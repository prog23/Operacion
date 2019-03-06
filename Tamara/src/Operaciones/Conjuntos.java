package Operaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conjuntos {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	 System.out.println("Inserte el número de elementos de A: ");
	 int tA = sc.nextInt();
	 System.out.println("Inserte el número de elementos de B: ");
	 int tB = sc.nextInt();
	 
	 int[] a = new int[tA];
	 int[] b = new int[tB];
	 
	 System.out.println("Introduce números de A");
	 for(int i=0;i<a.length;i++) {
		 a[i]=sc.nextInt();
	 }
	 
	 System.out.println("Introduce números de B");
	 for(int i=0;i<b.length;i++) {
		 b[i]=sc.nextInt(); }	
		
		
		
		int[]u=Union(a, b);
		System.out.println("Union");
		for(int i = 0; i<u.length;i++) {
			System.out.println(u[i]);
		}
		
		int[]is=Interseccion(a, b);
		
		
		}
	
	public static Boolean existe(int[] conjunto, int elemento) {
		boolean existe=false;
		
		for(int i = 0; i < conjunto.length;i++) {
			if(conjunto[i]==elemento) {
				existe=true;
			}
		}
		
		return existe;
		
	}
	
	private static int[] Interseccion(int[] a, int[] b) {
		int ai = 0;
		for(int i = 0; i<a.length;i++) {
			if(existe(b, a[i])) {
				ai++;
			}
		}
		int[]inter = new int[ai];
		int ais=0;
		for(int i = 0; i<a.length;i++) {
			if(existe(b, a[i])) {
				inter[ais] = a[i];
				ais++;
			}
			
	}
		return inter;	
	}
	private static int[] Union(int[] a, int[] b) {
		int []u=new int[a.length+b.length];
		for(int i = 0; i<a.length;i++) {
			u[i]=a[i];
		}
		
		int k = 0;
		int r = 0;
		for(int i = 0; i<b.length;i++) {
			if(existe(u, b[i])==false) {
				u[a.length+k]=b[i];
				k++;
			}
			else {
				r++;
			}
		}
			int [] aux = u;
			u = new int[aux.length-r];
			
			for(int i = 0; i<u.length;i++) {
				u[i]=aux[i];
			}		
		
		return u;
	}
	
	

		
	}
	
	
	
