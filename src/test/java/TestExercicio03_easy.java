import org.junit.Assert;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio03_easy;

public class TestExercicio03_easy {

    @Test
    public void testeRetornoValorTrocado() {
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

        String mensagemEsperada = "Primeiro valor digitado: segundoValor\nSegundo valor digitado: primeiroValor";
        String mensagemAtual = exercicio03_easy.retornaValorTrocado("primeiroValor", "segundoValor");
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

}
