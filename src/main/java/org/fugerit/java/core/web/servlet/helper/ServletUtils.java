package org.fugerit.java.core.web.servlet.helper;

import javax.servlet.http.HttpServletResponse;

import org.fugerit.java.core.function.UnsafeVoid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServletUtils {
	
	private ServletUtils() {}

	public static boolean handleSendSafe( HttpServletResponse resp, int httpCode ) {
		return handleServletOperationSafe( () -> resp.sendError( httpCode ) );
	}
	
	public static boolean handleServletOperationSafe( UnsafeVoid<Exception> fun ) {
		boolean ok = false;
		try {
			fun.apply();
			ok = true;
		} catch (Exception e) {
			log.warn( "Error on servlet operation : "+e, e );
		}
		return ok;
	}
	
}
