package test.org.fugerit.java.core.web.navmap.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class HttpServletResponseMock implements HttpServletResponse {

	@Override
	public String getCharacterEncoding() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getContentType() {
		// do nothing implementation
		return null;
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		// do nothing implementation
		return null;
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		// do nothing implementation
		return null;
	}

	@Override
	public void setCharacterEncoding(String charset) {
		// do nothing implementation
		
	}

	@Override
	public void setContentLength(int len) {
		// do nothing implementation
		
	}

	@Override
	public void setContentType(String type) {
		// do nothing implementation
		
	}

	@Override
	public void setBufferSize(int size) {
		// do nothing implementation
		
	}

	@Override
	public int getBufferSize() {
		// do nothing implementation
		return 0;
	}

	@Override
	public void flushBuffer() throws IOException {
		// do nothing implementation
		
	}

	@Override
	public void resetBuffer() {
		// do nothing implementation
		
	}

	@Override
	public boolean isCommitted() {
		// do nothing implementation
		return false;
	}

	@Override
	public void reset() {
		// do nothing implementation
		
	}

	@Override
	public void setLocale(Locale loc) {
		// do nothing implementation
		
	}

	@Override
	public Locale getLocale() {
		// do nothing implementation
		return null;
	}

	@Override
	public void addCookie(Cookie cookie) {
		// do nothing implementation
		
	}

	@Override
	public boolean containsHeader(String name) {
		// do nothing implementation
		return false;
	}

	@Override
	public String encodeURL(String url) {
		// do nothing implementation
		return null;
	}

	@Override
	public String encodeRedirectURL(String url) {
		// do nothing implementation
		return null;
	}

	@Override
	public String encodeUrl(String url) {
		// do nothing implementation
		return null;
	}

	@Override
	public String encodeRedirectUrl(String url) {
		// do nothing implementation
		return null;
	}

	@Override
	public void sendError(int sc, String msg) throws IOException {
		// do nothing implementation
		
	}

	@Override
	public void sendError(int sc) throws IOException {
		// do nothing implementation
		
	}

	@Override
	public void sendRedirect(String location) throws IOException {
		// do nothing implementation
		
	}

	@Override
	public void setDateHeader(String name, long date) {
		// do nothing implementation
		
	}

	@Override
	public void addDateHeader(String name, long date) {
		// do nothing implementation
		
	}

	@Override
	public void setHeader(String name, String value) {
		// do nothing implementation
		
	}

	@Override
	public void addHeader(String name, String value) {
		// do nothing implementation
		
	}

	@Override
	public void setIntHeader(String name, int value) {
		// do nothing implementation
		
	}

	@Override
	public void addIntHeader(String name, int value) {
		// do nothing implementation
		
	}

	@Override
	public void setStatus(int sc) {
		// do nothing implementation
		
	}

	@Override
	public void setStatus(int sc, String sm) {
		// do nothing implementation
		
	}

	@Override
	public int getStatus() {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getHeader(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Collection<String> getHeaders(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Collection<String> getHeaderNames() {
		// do nothing implementation
		return null;
	}

}
