package test.org.fugerit.java.core.web.servlet.config;

import org.fugerit.java.core.web.servlet.config.EncoderHelper;
import org.junit.Assert;
import org.junit.Test;

public class TestEncoderHelper {

	@Test
	public void test001() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test002() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT_FOR_HTML.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test003() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT_FOR_HTML_ATTRIBUTE.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test004() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT_FOR_HTML_CONTENT.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test005() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT_FOR_CSS_URL.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test006() {
		String input = "input";
		Object output = EncoderHelper.DEFAULT_FOR_CSS_STRING.encode( input );
		Assert.assertEquals( input , output );
	}
	
	@Test
	public void test007() {
		String input = null;
		Object output = EncoderHelper.DEFAULT.encode( input );
		Assert.assertNull( output );
	}

}
