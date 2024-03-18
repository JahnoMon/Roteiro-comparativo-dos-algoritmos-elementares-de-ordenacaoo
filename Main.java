package fred;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayInsertion = generateRandomList(10000);
        
        int[] arraySelection = new int[arrayInsertion.size()]; 
        for (int i = 0; i < arrayInsertion.size(); i++) {
            arraySelection[i] = arrayInsertion.get(i);
        }
        int[] arrayBubble = new int[arrayInsertion.size()]; 
        for (int i = 0; i < arrayInsertion.size(); i++) {
            arrayBubble[i] = arrayInsertion.get(i); 
        }

        int comparacoesInsertionSort = 0;
        int trocasInsertionSort = 0;

        // Início do cronômetro
        long tempoInicialInsertionSort = System.currentTimeMillis();

        // Executando o algoritmo de ordenação Insertion Sort
        for (int i = 1; i < arrayInsertion.size(); i++) {
            int temporario = arrayInsertion.get(i);
            int j = i - 1;

            while (j >= 0 && arrayInsertion.get(j) > temporario) {
                comparacoesInsertionSort++;
                arrayInsertion.set(j + 1, arrayInsertion.get(j));
                j--;
                trocasInsertionSort++;
            }
            arrayInsertion.set(j + 1, temporario);
        }
        // Fim do cronômetro
        long tempoFinalInsertionSort = System.currentTimeMillis();

        System.out.println("\nInsertion Sort: ");
//
//        for (int i : arrayInsertion) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
     
        System.out.println("Trocas de posicao       " + trocasInsertionSort);
        System.out.println("Comparacoes realizadas: " + comparacoesInsertionSort);
        System.out.println("Tempo de execucao:      " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " milissegundos\n");

        // Selection Sort ================================================================================================================

        int comparacoesSelectionSort = 0;
        int trocasSelectionSort = 0;
        
        // Início do cronômetro
        long tempoInicialSelectionSort = System.currentTimeMillis();

        for (int i = 0; i < arraySelection.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < arraySelection.length; j++) {
            	comparacoesSelectionSort++;
                if (arraySelection[menor] > arraySelection[j]) {
                	trocasSelectionSort++;
                    menor = j;

                }
            }
            int temporario = arraySelection[i];
            arraySelection[i] = arraySelection[menor];
            arraySelection[menor] = temporario;
        }
        
        // Início do cronômetro
        long tempoFinalSelectionSort = System.currentTimeMillis();
        
//        System.out.print("selectionSort: ");
//
//        for (int i : arraySelection) {
//            System.out.print(i + " ");
//        }
        
        System.out.printf("\nSelection Sort: ");
        
        System.out.println("\nTrocas de posicao       " + trocasSelectionSort);
        System.out.println("Comparacoes realizadas: " + comparacoesSelectionSort);
        System.out.println("Tempo de execucao:      " + (tempoFinalSelectionSort - tempoInicialSelectionSort) + " milissegundos\n");

        // Boubble Sort ================================================================================================================

        int comparacoesBoubble = boubbleSort(arrayBubble);
//        System.out.print("boubbleSort:   ");
//        for (int i : arrayBubble) {
//            System.out.print(i + " ");
//        }

        System.out.println();
//        System.out.print("\nComparacoes da Boubble Sort: " + comparacoesBoubble);
    }

    public static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10001));
        }
        return list;
    }


    public static int boubbleSort(int[] itens) {

        int comparacoesBoubbleSort = 0;

        for (int i = 0; i < itens.length - 1; i++) {
            for (int j = 0; j < itens.length - i - 1; j++) {
                if (itens[j] > itens[j + 1]) {
                	comparacoesBoubbleSort++;
                    int temporario = itens[j];
                    itens[j] = itens[j + 1];
                    itens[j + 1] = temporario;
                }
            }
        }
        return comparacoesBoubbleSort;
    }
}
