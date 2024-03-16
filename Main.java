public class Main {
    public static void main(String[] args) {

        // insertionSort
        int[] array = {7,2,4,9,0,1,3,5,6,8};

        int comparacoesInsertionSort = 0;
        int trocasInsertionSort = 0;

        // inicio do cronometro
        long tempoInicialInsertionSort = System.currentTimeMillis();

        for(int i=1; i < array.length; i++){
            int temporario = array[i];
            int j = i - 1;

            while(j >=0 && array[j] > temporario){
                comparacoesInsertionSort++;
                array[j+1] = array[j];
                j--;
                trocasInsertionSort++;
            }
            array[j+1] = temporario;
        }
        // fom do cronometro
        long tempoFinalInsertionSort = System.currentTimeMillis();

        System.out.print("\ninsertionSort: ");

        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Número de trocas de posição: " + trocasInsertionSort);
        System.out.println("Número de comparações realizadas: " + comparacoesInsertionSort);
        System.out.println("Tempo de execução: " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " milissegundos\n");

        //selectionSort ================================================================================================================
        int[] array2 = {7,2,4,9,0,1,3,5,6,8};

        int comparacoesSelectionSort = 0;
        int trocasSelectionSort = 0;

        // inicio do cronometro
        long tempoInicialSelectionSort = System.currentTimeMillis();

        System.out.print("selectionSort: ");

        for (int i: array){
            System.out.print(i + " ");
        }
        System.out.println();

        // fim do cronometro
        long tempoFinalSelectionSort = System.currentTimeMillis();

        // boubbleSort ================================================================================================================
        int[] array3 = {7,2,4,9,0,1,3,5,6,8};
        int comparacoesBoubble = boubbleSort(array3);
        System.out.print("boubbleSort:   ");
        for (int i: array){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("\nComparacoes da Boubble Sort: " + comparacoesBoubble);




    }

//    public static int insertionSort(int[] itens) {
//        return comparacoes;
//    }

    public static int selectionSort(int[] itens){

        int comparacoes = 0;

        for (int i=0; i < itens.length - 1; i++){
            int menor = i;
            for (int j=i+1; j < itens.length; j++){
                comparacoes++;
                if (itens[menor] > itens[j]){
                    menor = j;
                }
            }
            int temporario = itens[i];
            itens[i] = itens[menor];
            itens[menor] = temporario;
        }
        return comparacoes;
    }

    public static int boubbleSort(int[] itens) {

        int comparacoes = 0;

        for (int i=0; i < itens.length - 1; i++){
            for (int j=0; j < itens.length - i - 1; j++){
                if(itens[j] >  itens[j+1]){
                    comparacoes++;
                    int temporario = itens[j];
                    itens[j] = itens[j+1];
                    itens[j+1]= temporario;
                }
            }
        }
        return comparacoes;
    }
}
