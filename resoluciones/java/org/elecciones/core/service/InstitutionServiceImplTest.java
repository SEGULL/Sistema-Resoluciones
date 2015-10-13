package org.elecciones.core.service;

import org.elecciones.core.dao.AbstractUnitTest;
import org.elecciones.core.domain.Institution;
import org.elecciones.core.domain.StatusInstitution;
import org.springframework.beans.factory.annotation.Autowired;

public class InstitutionServiceImplTest extends AbstractUnitTest {

	@Autowired
	protected InstitutionServiceImpl institutionService;

	public void testSaveInstitution() {

		Institution institution = new Institution();
		institution.setName("Colegio Particular Adventista Fernando Stall");
		institution.setDescription("Colegio Particular Adventista Fernando Stall");
		institution.setAddress("Cerro Colorado.");
		institution.setPhone("051321633");

		StatusInstitution statusInstitution = new StatusInstitution();
		statusInstitution.setTypeCode(StatusInstitution.Status.INST_ACT.getStatusCode());

		institution.setStatusInstitution(statusInstitution);

		institutionService.saveInstitution(institution);
	}

}
