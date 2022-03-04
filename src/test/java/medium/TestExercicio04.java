package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio04_medium;


public class TestExercicio04 {

    static Exercicio04_medium ex4;

    @BeforeClass
    public static void before() {
        ex4 = new Exercicio04_medium();
    }

    @Test
    public void testeTabuada() {
        ex4.multiplicacaoNumerosAteMil();
    }

    
}
