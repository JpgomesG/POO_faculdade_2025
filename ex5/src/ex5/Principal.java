package ex5;
import java.util.ArrayList;

public class Principal {
	 
	public static void main(String[] args) {
		System.out.println(encontrarRepetido());
	}
	
	public static ArrayList<String> encontrarRepetido() {
		ArrayList<String> repetida = new ArrayList<String>();
		repetida.add("garrafa");
		repetida.add("copo");
		repetida.add("xicara");
		repetida.add("garrafa");
		
		ArrayList<String> resultado = new ArrayList<String>();
		ArrayList<String> jaContada = new ArrayList<String>();
		
		for(String palavra : repetida) {
			if(!jaContada.contains(palavra)){
				int contador = 0;
				for (String item : repetida) {
					if (item.equals(palavra)) {
						contador++;
					}
				}
				resultado.add(palavra + " aparece " + contador + " vezes.");
				jaContada.add(palavra);
			}
		}
		
		return resultado;
		
	
	}
}
	
	