package org.sistema.service.services.test;

import java.util.List;

//import org.elecciones.core.domain.Institution;
//import org.elecciones.core.domain.StatusInstitution;

//import pe.gob.edu.ugel.resoluciones.core.dao.scascasc;

import org.sistema.core.dao.test.AbstractUnitTest;
import org.sistema.core.domain.Docente;
import org.sistema.core.domain.Resolemitida;
import org.sistema.service.services.ResolucionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class ResolucionServiceImplTest extends AbstractUnitTest {

	@Autowired
	protected ResolucionServiceImpl resolucionService;

	/**
	 * testresoluciones busqueda por DNI
	 * @param dni
	 * @return
	 */
	public void testFindpordni() {
		String dni = "vhg";
		// System.out.println(resolucionService.finddniresolser(dni));
		// System.out.println("bien");
		List<Resolemitida>  list = resolucionService.finddniresolser(dni);
		for (Resolemitida resolemitida : list) {
			System.out.println(resolemitida);
		}
	}
	/**
	** TestReportar usuario con cantidad por resoluciones
	*/ 
	public void testFindUsuarioCanResol() {
		String dni = "segundo";
		// System.out.println(resolucionService.finddniresolser(dni));
		// System.out.println("bien");
		List<Resolemitida> list = resolucionService.FindUsuarioCanResol(dni);
		for (Resolemitida resolemitida : list) {
			System.out.println(resolemitida.getNombre());
			System.out.println(resolemitida.getCountReso());

		}
	/**
	 * Testreporta datos de docente haciendo busqueda pro DNI
	 * @param dni
	 * @return
	 */}
		public void testFinReporteDniDoc(){
			
			String dni="vhg";
			List<Docente> list = resolucionService.FinReporteDniDoc(dni);
			for(Docente doce : list){
				System.out.println(doce.getNombres());
				System.out.println(doce.getApellidomat());
				System.out.println(doce.getApellidopat());
				System.out.println(doce.getCargo());
				System.out.println(doce.getDni());
			}
		}
		
	

	//

	//
	//
	//
	// public void TestSaveResolemitida(){
	// Resolemitida resolemitida = new Resolemitida();
	// resolemitida.setFechaemitida(new Date());
	// resolemitida.setCodresolucion("asdasd");
	// resolemitida.set
	// }
	/*
	 * 
	 * 
	 * public void testSaveInstitution() {
	 * 
	 * Institution institution = new Institution(); institution.setName(
	 * "Colegio Particular Adventista Fernando Stall");
	 * institution.setDescription("Colegio Particular Adventista Fernando Stall"
	 * ); institution.setAddress("Cerro Colorado.");
	 * institution.setPhone("051321633");
	 * 
	 * StatusInstitution statusInstitution = new StatusInstitution();
	 * statusInstitution.setTypeCode(StatusInstitution.Status.INST_ACT.
	 * getStatusCode());
	 * 
	 * institution.setStatusInstitution(statusInstitution);
	 * 
	 * institutionService.saveInstitution(institution); }
	 */

}
