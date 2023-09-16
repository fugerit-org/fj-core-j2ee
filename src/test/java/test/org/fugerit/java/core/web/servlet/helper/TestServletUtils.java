package test.org.fugerit.java.core.web.servlet.helper;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.fugerit.java.core.web.servlet.helper.ServletUtils;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import test.org.fugerit.java.core.web.navmap.util.HttpServletResponseMock;

@Slf4j
public class TestServletUtils {

	private static final HttpServletResponseMock MOCK = new HttpServletResponseMock() {
		@Override
		public void sendError(int sc) throws IOException {
			if ( sc == HttpServletResponse.SC_ACCEPTED ) {
				log.info( "ok" );
			} else {
				throw new IOException( "scenario exception" );
			}
		}	
	};
	
	@Test
	public void testOk() {
		boolean ok = ServletUtils.handleServletOperationSafe( () -> MOCK.sendError( HttpServletResponse.SC_ACCEPTED ) );
		Assert.assertTrue( ok );
	}
	
	@Test
	public void testKo() {
		boolean ok = ServletUtils.handleServletOperationSafe( () -> MOCK.sendError( HttpServletResponse.SC_BAD_REQUEST ) );
		Assert.assertFalse( ok );
	}
	
}
