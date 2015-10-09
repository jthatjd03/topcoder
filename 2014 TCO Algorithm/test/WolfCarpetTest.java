import org.junit.Test;
import static org.junit.Assert.*;

public class WolfCarpetTest {
	
	@Test(timeout=2000)
	public void test0() {
		int r1 = 1;
		int c1 = 1;
		int r2 = 2;
		int c2 = 3;
		assertEquals(4L, new WolfCarpet().count(r1, c1, r2, c2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int r1 = 0;
		int c1 = 0;
		int r2 = 0;
		int c2 = 10;
		assertEquals(11L, new WolfCarpet().count(r1, c1, r2, c2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int r1 = 1;
		int c1 = 1;
		int r2 = 1;
		int c2 = 1;
		assertEquals(0L, new WolfCarpet().count(r1, c1, r2, c2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int r1 = 5;
		int c1 = 12;
		int r2 = 40;
		int c2 = 26;
		assertEquals(414L, new WolfCarpet().count(r1, c1, r2, c2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int r1 = 0;
		int c1 = 0;
		int r2 = 1000000000;
		int c2 = 1000000000;
		assertEquals(750000002000000001L, new WolfCarpet().count(r1, c1, r2, c2));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int r1 = 81695509;
		int c1 = 209408464;
		int r2 = 949118329;
		int c2 = 220137366;
		assertEquals(6979871694045002L, new WolfCarpet().count(r1, c1, r2, c2));
	}
}
