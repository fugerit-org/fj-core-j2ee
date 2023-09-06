package test.org.fugerit.java.core.web.navmap.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterChainMock implements FilterChain {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
		// do nothing implementation
	}

}
