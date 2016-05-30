import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumTest1 {
	@Test
	public void evaluatesExpression(){
		Sum sbor = new Sum();
		int sum = sbor.sum(1,2);
		assertEquals(3, sum);
	}
}
