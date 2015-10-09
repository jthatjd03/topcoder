import org.junit.Test;
import static org.junit.Assert.*;

public class TheTipsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] clues = new String[] {"Y"};
		int[] probability = new int[] {50};
		assertEquals(0.5, new TheTips().solve(clues, probability), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] clues = new String[] {"YN","NY"};
		int[] probability = new int[] {100,50};
		assertEquals(1.5, new TheTips().solve(clues, probability), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] clues = new String[] {"YYY","NYY","NNY"};
		int[] probability = new int[] {100,0,0};
		assertEquals(3.0, new TheTips().solve(clues, probability), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] clues = new String[] {"NNN","NNN","NNN"};
		int[] probability = new int[] {0,0,0};
		assertEquals(0.0, new TheTips().solve(clues, probability), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] clues = new String[] {"NYYNYYNNNN","NNNNYNNNYN","YNNYYYYYNN","YYNYNNNNYN","NYNNNNNNNY","YNYYNNYNNY","NYNNYYYYYY","NYYYYNNNNN","YYNYNNYYYN","NNYYNYNYYY"}
;
		int[] probability = new int[] {11,66,99,37,64,45,21,67,71,62}
;
		assertEquals(9.999891558057332, new TheTips().solve(clues, probability), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] clues = new String[] {"NNY","NNY","NNN"};
		int[] probability = new int[] {50, 50, 1};
		assertEquals(1.7525, new TheTips().solve(clues, probability), 1e-9);
	}
}
