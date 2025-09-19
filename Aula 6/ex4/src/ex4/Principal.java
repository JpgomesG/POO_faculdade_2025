package ex4;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        int indice = menorIndice();
        System.out.println(indice);
    }

    public static int menorIndice() {
        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(10);
        lista.add(20);
        lista.add(30);
        
        int indiceDoMenor = 0;
        int menorValor = lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < menorValor) {
                menorValor = lista.get(i);
                indiceDoMenor = i;
            }
        }
        
        return indiceDoMenor;
    }
}

