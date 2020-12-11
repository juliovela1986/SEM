package test.nextgreaterelement;

import java.util.Arrays;
import java.util.List;

// Programa que muestra el siguiente elemento mayor
class Main {

    public static void printSEMConDosBucles(List<Integer> orderedNumberList) {

        int next, i, j;
        boolean siguiente;

        for (i=0; i<orderedNumberList.size(); i++) {
            next = -1;
            j = i + 1;
            siguiente = true;

            while (j<orderedNumberList.size() && siguiente) {
                if (orderedNumberList.get(i) < orderedNumberList.get(j)) {
                    next = orderedNumberList.get(j);
                    siguiente = false;
                }
                j++;
            }

            System.out.println(orderedNumberList.get(i) + " --> " + next);
        }
    }


    public static void main(String[] args) {

        Integer[] arr = {4, 5, 2, 25};

        Integer[] arr1 = {13, 7, 6, 12};

        //Aquí la Complejidad del tiempo: . El peor de los casos ocurre cuando todos
        // los elementos se ordenan en orden decreciente.
        printSEMConDosBucles(Arrays.asList(arr));
        System.out.println();
        printSEMConDosBucles(Arrays.asList(arr1));
    }








}

