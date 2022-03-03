package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio1_medium;

public class TestExercicio01 {

    static Exercicio1_medium ex1;

    @BeforeClass
    public static void before() {
        ex1 = new Exercicio1_medium();
    }

    @Test
    public void testeTabuada() {
        ex1.exibeParOuImpar();
    }

    
}
