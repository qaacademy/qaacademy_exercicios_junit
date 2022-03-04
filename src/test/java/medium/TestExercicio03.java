package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio03_medium;


public class TestExercicio03 {

    static Exercicio03_medium ex3;

    @BeforeClass
    public static void before() {
        ex3 = new Exercicio03_medium();
    }

    @Test
    public void testeTabuada() {
        ex3.somaNumerosAcumulados();
    }

    
}
