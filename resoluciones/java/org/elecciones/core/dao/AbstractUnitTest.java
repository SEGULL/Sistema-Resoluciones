package org.elecciones.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"org/elecciones/core/config/application-config.xml",
				"org/elecciones/core/config/applicationContext-dao.xml",
				"org/elecciones/core/service/config/applicationContext-service.xml"
//				"com/goolstar/core/config/applicationContext-dao.xml",
//				"com/goolstar/core/config/applicationContext-service.xml",
//				"com/goolstar/core/config/applicationContext-emailservice.xml", 
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}
