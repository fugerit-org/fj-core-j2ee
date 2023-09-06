package test.org.fugerit.java.core.web.navmap.util;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

@SuppressWarnings("deprecation")
public class HttpSessionMock implements HttpSession {

	@Override
	public long getCreationTime() {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getId() {
		// do nothing implementation
		return null;
	}

	@Override
	public long getLastAccessedTime() {
		// do nothing implementation
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		// do nothing implementation
		return null;
	}

	@Override
	public void setMaxInactiveInterval(int interval) {
		// do nothing implementation
		
	}

	@Override
	public int getMaxInactiveInterval() {
		// do nothing implementation
		return 0;
	}

	@Override
	public HttpSessionContext getSessionContext() {
		// do nothing implementation
		return null;
	}

	@Override
	public Object getAttribute(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Object getValue(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		// do nothing implementation
		return null;
	}

	@Override
	public String[] getValueNames() {
		// do nothing implementation
		return null;
	}

	@Override
	public void setAttribute(String name, Object value) {
		// do nothing implementation
		
	}

	@Override
	public void putValue(String name, Object value) {
		// do nothing implementation
		
	}

	@Override
	public void removeAttribute(String name) {
		// do nothing implementation
		
	}

	@Override
	public void removeValue(String name) {
		// do nothing implementation
		
	}

	@Override
	public void invalidate() {
		// do nothing implementation
		
	}

	@Override
	public boolean isNew() {
		// do nothing implementation
		return false;
	}

}
