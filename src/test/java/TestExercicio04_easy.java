import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio04_easy;

public class TestExercicio04_easy {

    @Test
    public void testeCalcularDobro(){
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy(); 
        int valorEsperado = 20; 
        int valorAtual = exercicio04_easy.calcularDobro(10);
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
}
