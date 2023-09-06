package test.org.fugerit.java.core.web.navmap.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

public class HttpServletRequestMock implements HttpServletRequest {

	@Override
	public Object getAttribute(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getCharacterEncoding() {
		// do nothing implementation
		return null;
	}

	@Override
	public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
		// do nothing implementation
		
	}

	@Override
	public int getContentLength() {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getContentType() {
		// do nothing implementation
		return null;
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		// do nothing implementation
		return null;
	}

	@Override
	public String getParameter(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<String> getParameterNames() {
		// do nothing implementation
		return null;
	}

	@Override
	public String[] getParameterValues(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getProtocol() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getScheme() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getServerName() {
		// do nothing implementation
		return null;
	}

	@Override
	public int getServerPort() {
		// do nothing implementation
		return 0;
	}

	@Override
	public BufferedReader getReader() throws IOException {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRemoteAddr() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRemoteHost() {
		// do nothing implementation
		return null;
	}

	@Override
	public void setAttribute(String name, Object o) {
		// do nothing implementation
		
	}

	@Override
	public void removeAttribute(String name) {
		// do nothing implementation
		
	}

	@Override
	public Locale getLocale() {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<Locale> getLocales() {
		// do nothing implementation
		return null;
	}

	@Override
	public boolean isSecure() {
		// do nothing implementation
		return false;
	}

	@Override
	public RequestDispatcher getRequestDispatcher(String path) {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRealPath(String path) {
		// do nothing implementation
		return null;
	}

	@Override
	public int getRemotePort() {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getLocalName() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getLocalAddr() {
		// do nothing implementation
		return null;
	}

	@Override
	public int getLocalPort() {
		// do nothing implementation
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		// do nothing implementation
		return null;
	}

	@Override
	public AsyncContext startAsync() throws IllegalStateException {
		// do nothing implementation
		return null;
	}

	@Override
	public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
			throws IllegalStateException {
		// do nothing implementation
		return null;
	}

	@Override
	public boolean isAsyncStarted() {
		// do nothing implementation
		return false;
	}

	@Override
	public boolean isAsyncSupported() {
		// do nothing implementation
		return false;
	}

	@Override
	public AsyncContext getAsyncContext() {
		// do nothing implementation
		return null;
	}

	@Override
	public DispatcherType getDispatcherType() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getAuthType() {
		// do nothing implementation
		return null;
	}

	@Override
	public Cookie[] getCookies() {
		// do nothing implementation
		return null;
	}

	@Override
	public long getDateHeader(String name) {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getHeader(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<String> getHeaders(String name) {
		// do nothing implementation
		return null;
	}

	@Override
	public Enumeration<String> getHeaderNames() {
		// do nothing implementation
		return null;
	}

	@Override
	public int getIntHeader(String name) {
		// do nothing implementation
		return 0;
	}

	@Override
	public String getMethod() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getPathInfo() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getPathTranslated() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getContextPath() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getQueryString() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRemoteUser() {
		// do nothing implementation
		return null;
	}

	@Override
	public boolean isUserInRole(String role) {
		// do nothing implementation
		return false;
	}

	@Override
	public Principal getUserPrincipal() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRequestedSessionId() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getRequestURI() {
		// do nothing implementation
		return null;
	}

	@Override
	public StringBuffer getRequestURL() {
		// do nothing implementation
		return null;
	}

	@Override
	public String getServletPath() {
		// do nothing implementation
		return null;
	}

	@Override
	public HttpSession getSession(boolean create) {
		// do nothing implementation
		return null;
	}

	@Override
	public HttpSession getSession() {
		// do nothing implementation
		return null;
	}

	@Override
	public boolean isRequestedSessionIdValid() {
		// do nothing implementation
		return false;
	}

	@Override
	public boolean isRequestedSessionIdFromCookie() {
		// do nothing implementation
		return false;
	}

	@Override
	public boolean isRequestedSessionIdFromURL() {
		// do nothing implementation
		return false;
	}

	@Override
	public boolean isRequestedSessionIdFromUrl() {
		// do nothing implementation
		return false;
	}

	@Override
	public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
		// do nothing implementation
		return false;
	}

	@Override
	public void login(String username, String password) throws ServletException {
		// do nothing implementation
		
	}

	@Override
	public void logout() throws ServletException {
		// do nothing implementation
		
	}

	@Override
	public Collection<Part> getParts() throws IOException, ServletException {
		// do nothing implementation
		return null;
	}

	@Override
	public Part getPart(String name) throws IOException, ServletException {
		// do nothing implementation
		return null;
	}

}
