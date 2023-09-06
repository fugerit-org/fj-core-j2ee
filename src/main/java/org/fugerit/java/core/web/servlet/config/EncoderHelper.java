package org.fugerit.java.core.web.servlet.config;

import java.io.IOException;
import java.io.Serializable;
import java.util.function.Function;

import org.owasp.encoder.Encode;

public class EncoderHelper implements Serializable {

	// code added to setup a basic conditional serialization - START
	
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// this class is conditionally serializable, depending on contained object
		// special situation can be handleded using this method in future
		out.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		// this class is conditionally serializable, depending on contained object
		// special situation can be handleded using this method in future
		in.defaultReadObject();
	}
	
	// code added to setup a basic conditional serialization - END
	
	private static final long serialVersionUID = 3690710184159874074L;

	public static final EncoderHelper DEFAULT = new EncoderHelper( ( i ) -> String.valueOf( i )  );
	
	public static final EncoderHelper DEFAULT_FOR_HTML = new EncoderHelper( ( i ) -> Encode.forHtml( String.valueOf( i ) ) );
	
	public static final EncoderHelper DEFAULT_FOR_HTML_ATTRIBUTE = new EncoderHelper( ( i ) -> Encode.forHtmlAttribute( String.valueOf( i ) ) );
	
	public static final EncoderHelper DEFAULT_FOR_HTML_CONTENT = new EncoderHelper( ( i ) -> Encode.forHtmlContent( String.valueOf( i ) ) );
	
	public static final EncoderHelper DEFAULT_FOR_CSS_STRING = new EncoderHelper( ( i ) -> Encode.forCssString( String.valueOf( i ) ) );
	
	public static final EncoderHelper DEFAULT_FOR_CSS_URL = new EncoderHelper( ( i ) -> Encode.forCssUrl( String.valueOf( i ) ) );
	
	private Function<Object, Object> fun;
	
	public EncoderHelper( Function<Object, Object> fun ) {
		this.fun = fun;
	}
	
	protected Object worker( Object value ) {
		return fun.apply(value);
	}
			
	public Object encode( Object value ) {
		return value != null ? this.worker(value) : null;
	}
	
}
