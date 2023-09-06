package test.org.fugerit.java.core.web.navmap.model;

import java.io.InputStream;

import org.fugerit.java.core.lang.helpers.ClassHelper;
import org.fugerit.java.core.web.navmap.model.NavConfig;
import org.fugerit.java.core.web.navmap.model.NavMap;
import org.junit.Assert;
import org.junit.Test;

import test.org.fugerit.java.BasicTest;

public class TestNavConfig extends BasicTest {
	
	@Test
	public void testLoadConfig() throws Exception {
		try ( InputStream is = ClassHelper.loadFromDefaultClassLoader( "core/web/navmap/nav-map-test.xml" ) ) {
			NavMap map = NavConfig.parseConfig( is , "src/test/resources/core/web/navmap" );
			Assert.assertNotNull( map );
		}
	}
	
	@Test
	public void testLoadConfig1() throws Exception {
		try ( InputStream is = ClassHelper.loadFromDefaultClassLoader( "core/web/navmap/nav-map-test-1.xml" ) ) {
			NavMap map = NavConfig.parseConfig( is , "src/test/resources/core/web/navmap" );
			Assert.assertNotNull( map );
		}
	}
	
}
