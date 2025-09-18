package ex2;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		encontrarNaoRepetido();
		System.out.println(encontrarNaoRepetido());
	}
	public static ArrayList<Integer> encontrarNaoRepetido() {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
									
		num.add(2);
		num.add(4);
		num.add(4);
		num.add(4);
		num.add(4);
		num.add(4);
		num.add(4);
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		for (int i = 0; i < num.size(); i++) {
			
			int contagem = 0;
			
			for (int j = 0; j < num.size(); j++) {
				
				if (num.get(i) == num.get(j)) {
					contagem++;
				}					
					
						
			}
					if(contagem == 1) {
						resultado.add(num.get(i));
							
						}
		}
		return resultado;
	}
	
}
