package test.org.fugerit.java.core.web.navmap.servlet;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fugerit.java.core.lang.helpers.ClassHelper;
import org.fugerit.java.core.web.auth.handler.AuthHandler;
import org.fugerit.java.core.web.navmap.model.NavConfig;
import org.fugerit.java.core.web.navmap.model.NavMap;
import org.fugerit.java.core.web.navmap.servlet.NavFacade;
import org.fugerit.java.core.web.servlet.context.RequestContext;
import org.junit.Assert;
import org.junit.Test;

import test.org.fugerit.java.core.web.navmap.util.HttpServletRequestMock;
import test.org.fugerit.java.core.web.navmap.util.HttpServletResponseMock;
import test.org.fugerit.java.core.web.navmap.util.HttpSessionMock;

public class TestNavFacade {

	@Test
	public void testEOk001() throws Exception {
		try ( InputStream is = ClassHelper.loadFromDefaultClassLoader( "core/web/navmap/nav-map-test.xml" ) ) {
			NavMap map = NavConfig.parseConfig( is , "src/test/resources/core/web/navmap" );
			Assert.assertNotNull( map );
			HttpServletRequest request = new HttpServletRequestMock() {
				@Override
				public String getContextPath() {
					return "/test";
				}
				@Override
				public String getRequestURI() {
					return this.getContextPath()+"/home/index.do";
				}
				@Override
				public HttpSession getSession() {
					return new HttpSessionMock();
				}
			};
			HttpServletResponse response = new HttpServletResponseMock();
			RequestContext context = new RequestContext(null, request, response);
			int res = NavFacade.nav(context, map, "test1");
			Assert.assertEquals( AuthHandler.AUTH_AUTHORIZED, res );
		}
		

	}
	
}
