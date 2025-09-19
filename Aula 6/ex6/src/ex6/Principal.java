package ex6;
import java.util.ArrayList;
public class Principal {
	
	public static void main(String[]args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
			
		removerPares(numeros);
		System.out.println(removerPares(numeros));
		
	}
	
	private static ArrayList<Integer> removerPares(ArrayList<Integer>numeros){
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		for (int lista : numeros) {
				if(lista % 2 !=0) {
						resultado.add(lista);
				}
		}
		return resultado;
	}
}
