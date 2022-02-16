package qaacademy_exercicios_junit.medium;

public class Exercicio10_medium {

    public long[] calculaTermoFibonacci(int elemento) {

        long[] fibonacci;// forma
        fibonacci = new long[elemento]; // é um objeto
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } // fim while
        return fibonacci;
    }

    public void imprimeVetor(long[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.println("Termo: " + (i + 1) + " - Valor: " + vetor[i]);
            i++;
        }
    }
}// fim classe
