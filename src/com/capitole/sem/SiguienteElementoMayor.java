package com.capitole.sem;

public class SiguienteElementoMayor {

    public static void imprimirMayorPorElemento (int[] elements){
        System.out.println("Elemento          SEM");

        int pos = 0;
        for (int elem : elements){
            System.out.println(elem + "         --->     " + siguienteElementoMayor(pos++, elements));
        }
    }

    private static int siguienteElementoMayor(int pos, int[] elements){

        for (int i = pos+1; i<elements.length; i++){
            if(elements[i] > elements[pos]){
                return elements[i];
            }
        }

        return -1;
    }
}
