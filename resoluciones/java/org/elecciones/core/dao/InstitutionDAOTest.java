package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.Institution;
import org.springframework.beans.factory.annotation.Autowired;

public class InstitutionDAOTest extends AbstractUnitTest {

	@Autowired
	protected InstitutionDAO institutionDAO;


	public void testFindAllInstitution() {
		
		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Institution> listInst = institutionDAO.findAllInstitution();
		logger.info("::: " + listInst);
		
		System.out.println(listInst);
		
		assertEquals(0, listInst.size());
		for (Institution institution : listInst) {
			if(institution.getId().compareTo(2L)==0){
//				System.out.println(institution.getName());
				assertEquals("Colegio Adventista Tupac Amaru", institution.getName());
				
			}
		}
		
	}

//	public void testSaveInstitution() {
//		
//		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//		Institution institution = new Institution();
//		institution.setName("Colegio Adventista Americana");
//		
//		institutionDAO.saveInstitution(institution);
//	}
	
	
	//
//	public void test02() {
//		String string = "004-034556-NULL";
//		String[] parts = string.split("-");
//
//		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//		List<Institution> list = unionDao.findInstitutionByCityId(2L, null,
//				null);
//		logger.info("::: " + list);
//	}
//
//	public void test01() {
//		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//		System.out.println("unionService: " + unionDao.findInstitutions());
//		Institution institution = new Institution();
//		institution.setNameInstitution("Villa Hermosa");
//		institution.setUrl("www.villaunion.com.pe");
//		institution.setAddress("jr. Moquegua 1213");
//		// unionDao.saveChurchs(church);
//
//		System.out.println("unionService: " + unionDao.findInstitutions());
//		// institution = unionDao.findInstitution(7L);
//		institution.setSummary("MMMMMMM");
//		unionDao.saveInstitution(institution);
//		// setComplete();
//	}
//
//	public void testFindTypeInstitution() {
//		List<TypeInstitution> list = unionDao.findTypeInstitution();
//		logger.info("list : " + list);
//
//	}
//
//	public void testFindInstitutionByLatLon() {
//		List<Institution> list = unionDao.findInstitutionByLatLon("-12", "-77");
//		logger.info("list : " + list);
//
//	}

}
