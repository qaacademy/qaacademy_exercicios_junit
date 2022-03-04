package medium;

import java.text.DecimalFormat;
import java.util.Locale;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio02_medium;

public class TestExercicio02 {
    static DecimalFormat decimalFormat;

       
    static Exercicio02_medium ex2;

    @BeforeClass
    public static void before() {
        ex2 = new Exercicio02_medium();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeCalculaJurosCompostos(){
        String valorEsperado = "628,89";
        String valorAtual =  decimalFormat.format(ex2.calculaInvestimentoJurosCompostos(1000.00));

        Assert.assertEquals(valorEsperado, valorAtual);

    }
    @Test
    public void testeCalculaValorTotal(){
        String valorEsperado = "1.628,89";
        
        String valorAtual =  decimalFormat.format(ex2.calculaValorTotalInvestimento(1000.00, ex2.calculaInvestimentoJurosCompostos(1000.00)));

        Assert.assertEquals(valorEsperado, valorAtual);

    }
    
}

