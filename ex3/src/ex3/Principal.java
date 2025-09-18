package ex3;

import java.util.ArrayList;
public class Principal {
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(10);
		lista1.add(20);
		lista1.add(30);
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(11);
		lista2.add(20);
		lista2.add(31);
		
		System.out.println(juntarListas(lista1, lista2));
	}
	
	public static ArrayList<Integer> juntarListas(
			ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		for (Integer numero1 : lista1) {
			if(!lista2.contains(numero1)) {
				resultado.add(numero1);
			}
		}
		for (Integer numero2 : lista2) {
			if(!lista1.contains(numero2)) {
				resultado.add(numero2);
			}
		}
		return resultado;
	}
}


	

