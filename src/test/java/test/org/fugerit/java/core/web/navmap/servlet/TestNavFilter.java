package test.org.fugerit.java.core.web.navmap.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fugerit.java.core.web.navmap.servlet.NavFilter;
import org.fugerit.java.core.web.servlet.context.RequestContext;
import org.junit.Assert;
import org.junit.Test;

import test.org.fugerit.java.core.web.navmap.util.FilterChainMock;
import test.org.fugerit.java.core.web.navmap.util.HttpServletRequestMock;
import test.org.fugerit.java.core.web.navmap.util.HttpServletResponseMock;
import test.org.fugerit.java.core.web.navmap.util.HttpSessionMock;

public class TestNavFilter {

	@Test
	public void testError001() throws IOException, ServletException {
		boolean ok = false;
		NavFilter filter = new NavFilter();
		HttpServletRequest request = new HttpServletRequestMock() {
			@Override
			public HttpSession getSession(boolean create) {
				return new HttpSessionMock() {
					@Override
					public String getId() {
						return String.valueOf( System.currentTimeMillis() );
					}
				};
			}
		};
		HttpServletResponse response = new HttpServletResponseMock();
		RequestContext context = new RequestContext(null, request, response);
		FilterChain chain = new FilterChainMock();
		filter.nav( context ,chain );
		ok = true;
		Assert.assertTrue(ok);
	}
	
}
