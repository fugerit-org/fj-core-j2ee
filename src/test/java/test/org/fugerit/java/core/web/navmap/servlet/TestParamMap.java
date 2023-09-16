package test.org.fugerit.java.core.web.navmap.servlet;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.fugerit.java.core.cfg.ConfigRuntimeException;
import org.fugerit.java.core.web.servlet.request.ParamMap;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import test.org.fugerit.java.core.web.navmap.util.HttpServletRequestMock;

@Slf4j
public class TestParamMap {

	public class ParamsRequest extends HttpServletRequestMock {

		private Map<String, String[]> testMap;
		
		public ParamsRequest() {
			this.testMap = new HashMap<>();
			String[] testValue1 = { "value1" };
			this.testMap.put( "test1" , testValue1 );
			String[] testValue2 = { "value2", "value2a" };
			this.testMap.put( "test2" , testValue2 );
		}
		
		@Override
		public String getParameter(String name) {
			String[] values = this.getParameterValues(name);
			return values == null || values.length == 0 ? null : values[0];
		}

		@Override
		public Enumeration<String> getParameterNames() {
			return Collections.enumeration( this.testMap.keySet() );
		}

		@Override
		public String[] getParameterValues(String name) {
			return this.testMap.get( name );
		}

		@Override
		public Map<String, String[]> getParameterMap() {
			return this.testMap;
		}
	}
	
	@Test
	public void testParamMapOk() {
		ParamMap map = ParamMap.getParamMap( new ParamsRequest() );
		Assert.assertNotNull( map );
		log.info( "query string -> {}", map.getQueryString() );
		String[] excludes = { "test2" };
		log.info( "query string excludes -> {}", map.getQueryString( excludes ) );
		log.info( "query string sorted -> {}", map.getSortedQueryString() );
		log.info( "toString() -> {}", map );
		Assert.assertEquals( "value1" , map.getParam( "test1" ) );
		ParamMap mapAlt = ParamMap.getParamMap( new ParamsRequest() );
		Assert.assertEquals( map , mapAlt );
		Assert.assertEquals( map.hashCode() , mapAlt.hashCode() );
		mapAlt.addParam( "test3" , "value3" );
		mapAlt.addParam( "test3" , "value3a" );
		Assert.assertNotEquals( map , mapAlt );
		Assert.assertNotEquals( map.hashCode() , mapAlt.hashCode() );
		Assert.assertNotNull( ParamMap.newEmptyMap() );
		Assert.assertEquals( "value1" , map.getParam( "test1", "def1" ) );
		Assert.assertEquals( "def1" , map.getParam( "not-exists", "def1" ) );
		Assert.assertTrue( map.containsParam( "test1" ) );
		Assert.assertFalse( map.containsParam( "not-exists" ) );
		Assert.assertThrows( ConfigRuntimeException.class , () -> map.getParam( "test2" ) );
	}
	
}
