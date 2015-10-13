package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.Competitor;
import org.elecciones.core.domain.SessionElection;
import org.elecciones.core.domain.StatusCompetitor;
import org.springframework.beans.factory.annotation.Autowired;

public class ElectionDAOTest extends AbstractUnitTest {

	@Autowired
	protected ElectionDAO electionDAO;

	public void testFindCompetitorByElectioinId() {
		List<Competitor> list = electionDAO.findCompetitorByElectioinId(1L);
		System.out.println(list);
	}

	public void testFindSessionElectionByUserId() {

		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		SessionElection sessionElection = electionDAO.findSessionElectionByUserId(2L);
		logger.info("::: " + sessionElection);

		System.out.println(sessionElection.getElection().getId());
		System.out.println(sessionElection.getElection().getCompetitorList());

		for (Competitor competitor : sessionElection.getElection().getCompetitorList()) {
			if(competitor==null)
				continue;
			if (competitor.getStatusCompetitor().getTypeCode()
					.equals(StatusCompetitor.Status.COMPET_ACT.getStatusCode())) {
				System.out.println("competitor>>> " + competitor);
			}
		}
		// assertEquals(0, listInst.size());
		// for (Institution institution : listInst) {
		// if(institution.getId().compareTo(2L)==0){
		//// System.out.println(institution.getName());
		// assertEquals("Colegio Adventista Tupac Amaru",
		// institution.getName());
		//
		// }
		// }

	}
}
