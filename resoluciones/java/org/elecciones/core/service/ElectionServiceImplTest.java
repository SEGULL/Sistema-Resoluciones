package org.elecciones.core.service;

import org.elecciones.core.dao.AbstractUnitTest;
import org.elecciones.core.domain.Election;
import org.elecciones.core.domain.Vote;
import org.springframework.beans.factory.annotation.Autowired;

public class ElectionServiceImplTest extends AbstractUnitTest {

	@Autowired
	protected ElectionServiceImpl electionService;

	public void testSaveElection() {

		Election election = new Election();
		election.setComment("HOLA");
		election.setYear("2015");
		election.setId(1L);;	
		
		
		electionService.saveElection(election);
		
	}
	public void testSaveVote() {
		
		Vote voto = new Vote();
		voto.setCompetitorId(2L);
		voto.setStudentId(2L);
		voto.setElectionId(1L);
		
		electionService.saveVote(voto,2L);
		setComplete();
	}
//	saveVoto
}
