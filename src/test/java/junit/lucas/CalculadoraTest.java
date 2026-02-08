package junit.lucas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void testSomar() {
	Calculadora calc =  new Calculadora();
	System.out.println(calc.soma(2, 3) == 5);
	System.out.println(calc.soma(2, 3) == 5);
	Assertions.assertTrue(calc.soma(2, 7) == 5);
	}
	

}
