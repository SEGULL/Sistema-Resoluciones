package org.sistema.core.dao.test;

import java.util.Date;
import java.util.List;

import org.sistema.core.dao.ResolucionDAO;
import org.sistema.core.domain.Datos;
import org.sistema.core.domain.Docente;
import org.sistema.core.domain.Resolemitida;
import org.sistema.core.domain.Resolucion;
import org.sistema.core.domain.Usuario;

public class ResolucionDAOImplTest extends AbstractUnitTest {

	protected ResolucionDAO resolucionDAO;

	/**
	 * testdaoresoluciones busqueda por DNI
	 * @param dni
	 * @return
	 */
	public void tesdniresolucionemitida() {
		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + resolucionDAO);
		String dni = "vhg";
		List<Resolemitida> listInst = resolucionDAO.finddnicodresoemida(dni);
		logger.info("::: " + listInst);
		for (Resolemitida institution : listInst) {
			// assertEquals("vhg", institution.getDocente().getDni());
			System.out.println(institution.getResolucion().getNombre());
			System.out.println(institution.getUsuario().getNombre());
			//// System.out.println(institution.getDocente().getNombres());
			//// System.out.println(institution.getUsuario().getNombre());

		}
	}
	/**
	** testReportar usuario con cantidad por resoluciones
	*/
	public void testreporcountresol() {
			logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			String Nombre = "segundo";
			List<Resolemitida> listInst = resolucionDAO.FindUsuarioCanResol(Nombre);
			logger.info("::: " + listInst);
			for (Resolemitida resolucion : listInst) {
				// assertEquals("vhg", institution.getDocente().getDni());
				System.out.println(resolucion.getNombre());
				System.out.println(resolucion.getCountReso());
				System.out.println(resolucionDAO.FindUsuarioCanResol(Nombre));
				//// System.out.println(institution.getDocente().getNombres());
				//// System.out.println(institution.getUsuario().getNombre());

			}
		}
		
	/**
	 * testreporta datos de docente haciendo busqueda pro DNI
	 * @param dni
	 * @return
	 */
	public void tesdnireportedocente() {
		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String dni = "vhg";
		List<Docente> listInst = resolucionDAO.FinReporteDniDoc(dni);
		logger.info("::: " + listInst);
		for (Docente institution : listInst) {
			// assertEquals("vhg", institution.getDocente().getDni());
			System.out.println(institution.getNombres());
			System.out.println(institution.getApellidopat());
			System.out.println(institution.getApellidomat());
			System.out.println(institution.getCargo());
			System.out.println(institution.getCategoria());
			//// System.out.println(institution.getDocente().getNombres());
			//// System.out.println(institution.getUsuario().getNombre());

		}
	}

	/**
	 * testguardar resolucion emitida
	 * @param resolemitida
	 */
	public void testSaveresolemitida() {

		Resolemitida emi;
		Resolemitida resolemi = new Resolemitida();
		resolemi.setCodresolucion("dsadadadasadadasdasdssasa");
		resolemi.setFechaemitida(new Date());
		int id = 1;
		Usuario usuario = resolucionDAO.findIdUsuario(id);
		resolemi.setUsuario(usuario);
		int Idas = 5;
		Docente docente = resolucionDAO.findIdDocente(Idas);
		resolemi.setDocente(docente);
		int Idasre = 1;
		Resolucion resolucion = resolucionDAO.findIdResolucion(Idasre);
		resolemi.setResolucion(resolucion);

		resolucionDAO.saveresolucionemitida(resolemi);
		setComplete();

	}

	/*
	* testguardar datos con la resolucion emitida
	*/
	public void testSavedatosresolemitida() {

		Datos dat = new Datos();
		dat.setTiempoinicio(new Date());
		dat.setTiempofinal(new Date());
		dat.setMotivofeliz("ssafsdfsdfsdfsdasdasdasdasd");
		int iddd = 1;
		Resolemitida resolemitida = resolucionDAO.findIdResolemitidarepor(iddd);
		dat.setResolemitida(resolemitida);

		// int Idas = 5;
		// Docente docente = resolucionDAO.findIdDocente(Idas);
		// resolemi.setDocente(docente);
		// int Idasre = 1;
		// Resolucion resolucion = resolucionDAO.findIdResolucion(Idasre);
		// resolemi.setResolucion(resolucion);

		resolucionDAO.savedatosresolemitida(dat);
		setComplete();

	}

	

	/*
	* TESTReporta toda las las resoluciones emitidas
	*/	
	public void teslisresolemitida() {

		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Resolemitida> listInst = resolucionDAO.findResolucionemitidaByAllName();
		logger.info("::: " + listInst);
		for (Resolemitida institution : listInst) {
			System.out.println(institution.getCodresolucion());
			System.out.println(institution.getResolucion().getNombre());
			System.out.println(institution.getDocente().getNombres());
			System.out.println(institution.getUsuario().getNombre());
		}
		System.out.println(">>>>>>>" + resolucionDAO.findResolucionemitidaByAllName());
	}

	
	
	public void teslisre() {
		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Resolucion> listInst = resolucionDAO.findresol();
		logger.info("::: " + listInst);
		for (Resolucion institution : listInst) {
			System.out.println(institution.getNombre());
		}
		System.out.println(">>>>>>>" + resolucionDAO.findresol());
	}

	// public void tesdocentedni(){
	// logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	// List<Docente> listInst = resolucionDAO.finddnidocente();
	// logger.info("::: " + listInst);
	// for (Docente institution : listInst) {
	//// assertEquals("", institution.getCodresolucion());
	// assertEquals("vhg", institution.getDni());
	//// System.out.println(institution.getCodresolucion());
	// System.out.println(institution.getNombres());
	//// System.out.println(institution.getDocente().getNombres());
	//// System.out.println(institution.getUsuario().getNombre());
	// }
	//

}
