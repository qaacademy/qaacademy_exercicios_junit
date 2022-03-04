package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio10_medium;


public class TestExercicio10 {

    static Exercicio10_medium ex10;
    static long[] vetorFibonacciEsperado;

    @BeforeClass
    public static void before() {
        ex10 = new Exercicio10_medium();
        vetorFibonacciEsperado = new long[10];
        vetorFibonacciEsperado[0] = 0;
        vetorFibonacciEsperado[1] = 1;
        vetorFibonacciEsperado[2] = 1;
        vetorFibonacciEsperado[3] = 2; 
        vetorFibonacciEsperado[4] = 3;
        vetorFibonacciEsperado[5] = 5;
        vetorFibonacciEsperado[6] = 8;
        vetorFibonacciEsperado[7] = 13;
        vetorFibonacciEsperado[8] = 21;
        vetorFibonacciEsperado[9] = 34;
        
    }

    @Test
    public void testeVetorMeses() {
       Assert.assertArrayEquals(vetorFibonacciEsperado, ex10.calculaTermoFibonacci(10));
    }

    @Test
    public void testeImprimeVetorMeses() {
      ex10.imprimeVetor(vetorFibonacciEsperado);
    }

}
