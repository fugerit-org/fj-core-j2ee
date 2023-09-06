package test.org.fugerit.java.core.web.servlet.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.fugerit.java.core.web.servlet.config.ModuleConfig;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import test.org.fugerit.java.BasicTest;

@Slf4j
public class TestModuleConfig extends BasicTest {

	@Test
	public void testLoadConfig() throws Exception {
		ModuleConfig config = new ModuleConfig();
		try  ( StringWriter writer = new StringWriter();
				PrintWriter pw = new PrintWriter( writer ) ) {
			config.renderModule( null , new TestResponse( pw ) );
			log.info( "test \n{}", writer.toString() );
			Assert.assertNotNull( config );	
		}
	}
	
}

class TestResponse implements HttpServletResponse {

	private PrintWriter writer;
	
	public TestResponse( PrintWriter writer ) {
		this.writer = writer;
	}
	
	@Override
	public String getCharacterEncoding() {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public String getContentType() {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		return this.writer;
	}

	@Override
	public void setCharacterEncoding(String charset) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setContentLength(int len) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setContentType(String type) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setBufferSize(int size) {
		// DO NOTHING IMPL
		
	}

	@Override
	public int getBufferSize() {
		// DO NOTHING IMPL
		return 0;
	}

	@Override
	public void flushBuffer() throws IOException {
		// DO NOTHING IMPL
		
	}

	@Override
	public void resetBuffer() {
		// DO NOTHING IMPL
		
	}

	@Override
	public boolean isCommitted() {
		// DO NOTHING IMPL
		return false;
	}

	@Override
	public void reset() {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setLocale(Locale loc) {
		// DO NOTHING IMPL
		
	}

	@Override
	public Locale getLocale() {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public void addCookie(Cookie cookie) {
		// DO NOTHING IMPL
		
	}

	@Override
	public boolean containsHeader(String name) {
		// DO NOTHING IMPL
		return false;
	}

	@Override
	public String encodeURL(String url) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public String encodeRedirectURL(String url) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public String encodeUrl(String url) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public String encodeRedirectUrl(String url) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public void sendError(int sc, String msg) throws IOException {
		// DO NOTHING IMPL
		
	}

	@Override
	public void sendError(int sc) throws IOException {
		// DO NOTHING IMPL
		
	}

	@Override
	public void sendRedirect(String location) throws IOException {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setDateHeader(String name, long date) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void addDateHeader(String name, long date) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setHeader(String name, String value) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void addHeader(String name, String value) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setIntHeader(String name, int value) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void addIntHeader(String name, int value) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setStatus(int sc) {
		// DO NOTHING IMPL
		
	}

	@Override
	public void setStatus(int sc, String sm) {
		// DO NOTHING IMPL
		
	}

	@Override
	public int getStatus() {
		// DO NOTHING IMPL
		return 0;
	}

	@Override
	public String getHeader(String name) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public Collection<String> getHeaders(String name) {
		// DO NOTHING IMPL
		return null;
	}

	@Override
	public Collection<String> getHeaderNames() {
		// DO NOTHING IMPL
		return null;
	}
	
}