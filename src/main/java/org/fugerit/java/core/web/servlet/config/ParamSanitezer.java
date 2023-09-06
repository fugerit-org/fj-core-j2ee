package org.fugerit.java.core.web.servlet.config;

import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;

public class ParamSanitezer {

	private ParamSanitezer() {}
	
	private static final PolicyFactory POLICY = new HtmlPolicyBuilder().toFactory();	
	
	public static String sanitize( String value ) {
		return POLICY.sanitize( value );
	}
	
	public static String sanitizeAccept( String value, String... exceptions ) {
		HtmlPolicyBuilder builder = new HtmlPolicyBuilder().allowElements( exceptions );
		PolicyFactory policy = builder.toFactory();	
		return policy.sanitize( value );
	}
	
}
