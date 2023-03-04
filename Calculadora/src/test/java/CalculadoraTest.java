import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma(){
        int resultado = calculadora.suma(2, 3);
        assertThat(resultado, is(equalTo(5)));
    }

    @Test
    public void testResta(){
        int resultado = calculadora.resta(3, 2);
        assertThat(resultado, is(equalTo(1)));
    }

    @Test
    public void testMulti(){
        double resultado = calculadora.multi(3, 2);
        assertThat(resultado, is(equalTo(6.0)));
    }

    @Test
    public void testDivi(){
        double resultado = calculadora.division(5, 2);
        assertThat(resultado, is(equalTo(2.5)));
    }
}
