package org.sistema.core.dao.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"org/sistema/core/config/application-config.xml",
				"org/sistema/core/config/applicationContext-dao.xml",
				"org/sistema/core/service/config/applicationContext-service.xml"
//				"com/goolstar/core/config/applicationContext-dao.xml",
//				"com/goolstar/core/config/applicationContext-service.xml",
//				"com/goolstar/core/config/applicationContext-emailservice.xml", 
			};
	}

	public void testApp() {
		assertTrue(true);
//		try {
//			System.out.print("segundo");
//		ResolucionDAOImplTest as= new ResolucionDAOImplTest();
//		as.teslisresolemitida();
//		System.out.print("segundo");
//		} catch (Exception e) {
//			System.out.print("mal="+e.getLocalizedMessage());
//			}
	}

}
