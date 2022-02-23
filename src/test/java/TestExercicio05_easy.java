import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio05_easy;

public class TestExercicio05_easy {

    @Test
    public void testeSoma() {
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        Assert.assertEquals(6, exercicio05_easy.soma(2, 2, 2));
    }

    @Test
    public void testeSubtracao() {
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        Assert.assertEquals(-2, exercicio05_easy.subtracao(2, 2, 2));
    }

    @Test
    public void testeMultiplicacao() {
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        Assert.assertEquals(8, exercicio05_easy.multiplicacao(2, 2, 2));
    }

    @Test
    public void testeMedia() {
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        int soma = exercicio05_easy.soma(2, 2, 2); 
        Assert.assertEquals(2, exercicio05_easy.media(soma));
    }

}
