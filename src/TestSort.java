import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
class TestSort {
	String[][] a;
	String[][] b;
	String[][] c;
	String[][] d;
	
	@BeforeEach
	void setUp() throws Exception {
		a= new String[][] {{""},{"A"},{"B"},{"C"},{"D"}};
		b= new String[][] {{"A","A"},{"A","B"},{"B","C"},{"C","D"},{"D","A"},{"C","A"}};
		c= new String[][] {{"A","B","C"},{"B","A","C"},{"D","C","B"},{"C","D","B"}};
		d= new String[][] {{"A","B","C","D"},{"B","B","A","C"},{"D","C","B","A"},{"A","C","B","D"}};
	}
		
	@Test
	void test() {
		isWellSorted_Null_ReturnsFalse();
		isWellSorted_0ElementArray_ReturnsTrue();
		isWellSorted_1ElementArray_ReturnsTrue();
		isWellSorted_1ElementArray_ReturnsFalse();
		isWellSorted_2ElementArray_ReturnsTrue();
		isWellSorted_2ElementArray_ReturnsFalse();
		isWellSorted_3ElementArray_ReturnsTrue();
		isWellSorted_3ElementArray_ReturnsFalse();
		isWellSorted_4ElementArray_ReturnsTrue();
		isWellSorted_4ElementArray_ReturnsFalse();
	}
	
	void isWellSorted_Null_ReturnsFalse() {
		assertFalse(Sort.isWellSorted(null));
	}
	
	void isWellSorted_0ElementArray_ReturnsTrue() {
		assertTrue(Sort.isWellSorted(a[0]));
	}
	
	void isWellSorted_1ElementArray_ReturnsTrue() {
		assertTrue(Sort.isWellSorted(a[1]));
		assertTrue(Sort.isWellSorted(a[2]));
	}
	
	void isWellSorted_1ElementArray_ReturnsFalse() {
		assertFalse(Sort.isWellSorted(a[3]));
		assertFalse(Sort.isWellSorted(a[4]));		
	}
	
	void isWellSorted_2ElementArray_ReturnsTrue() {
		assertTrue(Sort.isWellSorted(b[0]));
		assertTrue(Sort.isWellSorted(b[1]));
		assertTrue(Sort.isWellSorted(b[2]));
		assertTrue(Sort.isWellSorted(b[3]));
	}
	
	void isWellSorted_2ElementArray_ReturnsFalse() {
		assertFalse(Sort.isWellSorted(b[4]));
		assertFalse(Sort.isWellSorted(b[5]));		
	}
	
	void isWellSorted_3ElementArray_ReturnsTrue() {
		assertTrue(Sort.isWellSorted(c[0]));
		assertTrue(Sort.isWellSorted(c[1]));
	}
	
	void isWellSorted_3ElementArray_ReturnsFalse() {
		assertFalse(Sort.isWellSorted(c[2]));
		assertFalse(Sort.isWellSorted(c[3]));	
		
	}
	
	void isWellSorted_4ElementArray_ReturnsTrue() {
		assertTrue(Sort.isWellSorted(d[0]));
		assertTrue(Sort.isWellSorted(d[1]));
	}
	
	void isWellSorted_4ElementArray_ReturnsFalse() {
		assertFalse(Sort.isWellSorted(d[2]));
		assertFalse(Sort.isWellSorted(d[3]));	
		
	}
 
}
