package org.fugerit.java.core.web.servlet.helper;

import org.fugerit.java.core.function.UnsafeVoid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServletUtils {
	
	private ServletUtils() {}

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
