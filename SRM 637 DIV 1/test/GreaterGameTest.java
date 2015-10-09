import org.junit.Test;
import static org.junit.Assert.*;

public class GreaterGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] hand = new int[] {4,2};
		int[] sothe = new int[] {-1,-1};
		assertEquals(1.5, new GreaterGame().calc(hand, sothe), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] hand = new int[] {4,2};
		int[] sothe = new int[] {1,3};
		assertEquals(2.0, new GreaterGame().calc(hand, sothe), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] hand = new int[] {2};
		int[] sothe = new int[] {-1};
		assertEquals(1.0, new GreaterGame().calc(hand, sothe), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] hand = new int[] {1,3,5,7};
		int[] sothe = new int[] {8,-1,4,-1};
		assertEquals(2.5, new GreaterGame().calc(hand, sothe), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] hand = new int[] {6,12,17,14,20,8,16,7,2,15};
		int[] sothe = new int[] {-1,-1,4,-1,11,3,13,-1,-1,18};
		assertEquals(8.0, new GreaterGame().calc(hand, sothe), 1e-9);
	}
}
