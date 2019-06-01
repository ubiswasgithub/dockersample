package hello;

import org.junit.Test;

import junit.framework.Assert;


public class GreetingsTest {

	private Greetings greeter = new Greetings();

	@Test
	public void greeterSaysHello() {
		Assert.assertTrue(greeter.sayHello("Manish").contains("Hello"));
	}
	
	@Test
	public void greeterSaysHello2() {
		Assert.assertTrue(greeter.sayHello("Alesia").contains("Hello1"));
	}

}
