package org.fugerit.java.core.web.servlet.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fugerit.java.core.cfg.ConfigException;
import org.w3c.dom.Element;

public class ModuleConfig extends BasicConfig {

	public static final String OPERATION_RELOAD = "module";
	
	public ModuleConfig() {
		this.moduleMap = new HashMap<>();
		this.moduleList = new ArrayList<>();
	}
	
	private Map<String, ConfigWrapper> moduleMap;
	
	private List<ConfigWrapper> moduleList;
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 8795230475686969554L;

	@Override
	public void configure(Properties props) throws ConfigException {
		
	}

	public void addModule( String name, BasicConfig module, Element config ) {
		ConfigWrapper cw = new ConfigWrapper( name, module, config );
		this.moduleMap.put( name , cw );
		this.moduleList.add( cw );
	}
	
	public void reloadModule( String name ) throws ConfigException {
		ConfigWrapper config = (ConfigWrapper) this.moduleMap.get( name );
		config.getModule().configure( config.getConfig() );
		config.setLoadTime( new Timestamp( System.currentTimeMillis() ) );
	}
	
	public void renderModule( HttpServletRequest request, HttpServletResponse response ) throws IOException {
		response.setContentType( "text/html" );
		this.renderModule(response.getWriter());
	}
	
	private void renderModule( PrintWriter pw ) throws IOException {
		pw.println( "<html>" );
		pw.println( "<head>" );
		pw.println( "<title>Module reload page (v 1.0.3)</title>" );
		pw.println( "</head>" );
		pw.println( "<body>" );
		pw.println( "<h3>Module reload page</h3>" );
		pw.println( "<p>This feature has been deprecated</p>" );
		pw.println( "</body>" );
		pw.println( "</html>" );
	}
	
}

class ConfigWrapper {
	
	private BasicConfig module;
	
	private Element config;

	private Timestamp loadTime;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConfigWrapper( String name, BasicConfig module, Element config ) {
		super();
		this.name = name;
		this.module = module;
		this.config = config;
		this.loadTime = new Timestamp( System.currentTimeMillis() );
	}

	public Timestamp getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(Timestamp loadTime) {
		this.loadTime = loadTime;
	}

	public BasicConfig getModule() {
		return module;
	}

	public void setModule(BasicConfig module) {
		this.module = module;
	}

	public Element getConfig() {
		return config;
	}

	public void setConfig(Element config) {
		this.config = config;
	}
	
}
