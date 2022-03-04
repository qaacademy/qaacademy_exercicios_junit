package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio06_medium;


public class TestExercicio06 {

    static Exercicio06_medium ex6;

    @BeforeClass
    public static void before() {
        ex6 = new Exercicio06_medium();
    }

    @Test
    public void testeFatorial() {
       Assert.assertEquals(120, ex6.calculaFatorial(5)); 
    }

    
}
