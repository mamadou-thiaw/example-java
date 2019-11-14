package genielogiciel;

import static org.junit.Assert.*;
import genielogiciel.HelloWord;
import org.junit.Test;
import org.junit.Before;
import java.lang.AssertionError;
public class HelloWordTest {
	HelloWord  subject;
	@Before
	public void setup() {subject=new HelloWord();}
	 

	@Test
	public void testGetMessage() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		//fail("Not yet implemented");
		//assertEquals(4, subject.sum(2, 2));
		assertEquals(4,subject.sum(2, 2));
	}

}
