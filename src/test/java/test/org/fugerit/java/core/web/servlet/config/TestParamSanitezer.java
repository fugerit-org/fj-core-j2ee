package test.org.fugerit.java.core.web.servlet.config;

import org.fugerit.java.core.web.servlet.config.ParamSanitezer;
import org.junit.Assert;
import org.junit.Test;

public class TestParamSanitezer {

	@Test
	public void testSanitize001() {
		String test = "aaa";
		String san = ParamSanitezer.sanitize(test);
		Assert.assertEquals( test , san );
	}
	
	@Test
	public void testSanitize002() {
		String test = "<h1>bbb</h1>";
		String san = ParamSanitezer.sanitize(test);
		Assert.assertEquals( "bbb" , san );
	}
	
	@Test
	public void testSanitize003() {
		String test = "<h1>bbb</h1><h3></h3>";
		String san = ParamSanitezer.sanitizeAccept(test, "h1", "h2");
		Assert.assertEquals( "<h1>bbb</h1>" , san );
	}
	
}
