import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio06_easy;

public class TestExercicio06_easy {
    static Exercicio06_easy exercicio06_easy;

    @BeforeClass
    public static void before() {
        exercicio06_easy = new Exercicio06_easy();
    }

    @Test
    public void testeAprovado() {

        String mensagemEsperada = "Você está Aprovado! Parabéns!!!";
        String mensagemAtual = exercicio06_easy.verificaAprovacao(9, 6);
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    @Test
    public void testeReprovado() {

        String mensagemEsperada = "Você está Reprovado!";
        String mensagemAtual = exercicio06_easy.verificaAprovacao(4, 4);
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    @Test
    public void testeExame() {

        String mensagemEsperada = "Você está de Exame";
        String mensagemAtual = exercicio06_easy.verificaAprovacao(5, 5);
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    @Test
    public void testeValorInvalido() {

        String mensagemEsperada = "Não foi possível calcular sua nota. Valor inválido";
        String mensagemAtual = exercicio06_easy.verificaAprovacao(-1, -1);
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

}
