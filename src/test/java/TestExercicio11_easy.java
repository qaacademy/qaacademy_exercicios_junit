import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio11_easy;

public class TestExercicio11_easy {

    static Exercicio11_easy ex11; 

    @BeforeClass
    public static void preCondicao(){
        ex11 = new Exercicio11_easy();
    }

    @Test
    public void testeSomaMaisDois(){

        Assert.assertEquals(210,ex11.somaDois(10));
       

    }
    
}
