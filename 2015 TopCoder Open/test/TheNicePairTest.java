import org.junit.Test;
import static org.junit.Assert.*;

public class TheNicePairTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {5,5,5,5,5};
		assertEquals(4, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {1,1,1,1};
		assertEquals(-1, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {2,3,5,7};
		assertEquals(1, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {8,8,5,5,5};
		assertEquals(4, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] A = new int[] {1,1000,1000,1,1000,1,999};
		assertEquals(5, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] A = new int[] {1000,1,1,1000};
		assertEquals(3, new TheNicePair().solve(A));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] A = new int[] {1,1,953,1,1,1,1,1,1,1,1,1,1,1,1,953,1,953,953,1,1,1,1,1,1,1,953,953,953,1,1,1,1,1,953,953,1,1,1,953,953,953,1};
		assertEquals(15, new TheNicePair().solve(A));
	}
}
