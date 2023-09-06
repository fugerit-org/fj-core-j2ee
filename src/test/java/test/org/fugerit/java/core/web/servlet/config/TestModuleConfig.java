package test.org.fugerit.java.core.web.servlet.config;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;

import org.fugerit.java.core.web.servlet.config.ModuleConfig;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import test.org.fugerit.java.BasicTest;
import test.org.fugerit.java.core.web.navmap.util.HttpServletResponseMock;

@Slf4j
public class TestModuleConfig extends BasicTest {

	@Test
	public void testLoadConfig() throws Exception {
		ModuleConfig config = new ModuleConfig();
		try  ( StringWriter writer = new StringWriter();
				PrintWriter pw = new PrintWriter( writer ) ) {
			HttpServletResponse response = new HttpServletResponseMock() {
				@Override
				public PrintWriter getWriter() {
					return pw;
				}
			};
			config.renderModule( null , response );
			log.info( "test \n{}", writer.toString() );
			Assert.assertNotNull( config );	
		}
	}
	
}