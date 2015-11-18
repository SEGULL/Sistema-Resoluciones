package org.sistema.core.dao;

import java.util.List;


import org.sistema.core.domain.Datos;
import org.sistema.core.domain.Docente;
import org.sistema.core.domain.Resolemitida;
import org.sistema.core.domain.Resolucion;
import org.sistema.core.domain.Usuario;

//import org.sistema.core.dao.BaseDAOHibernate;
//import org.sistema.core.dao.ResolucionDAO;

public interface ResolucionDAO {
	
	
	/**
	 * resoluciones busqueda por DNI
	 * @param dni
	 * @return
	 */
	List<Resolemitida> finddnicodresoemida(String dni);
	
	/**
	** Reportar usuario con cantidad por resoluciones
	*
	*/ 
	List<Resolemitida> FindUsuarioCanResol(String nombre);
	/**
	 * reporta datos de docente haciendo busqueda pro DNI
	 * @param dni
	 * @return
	 */
	List<Docente> FinReporteDniDoc(String dni);
	/**
	 * guardar resolucion emitida
	 * @param resolemitida
	 */
	void saveresolucionemitida(Resolemitida resolemitida);
		Usuario findIdUsuario(int Id);
		Docente findIdDocente(int Id);
		Resolucion findIdResolucion(int Id);
	/*
	* guardar datos con la resolucion emitida
	*/
	void savedatosresolemitida(Datos datosemitidos);
		Resolemitida findIdResolemitidarepor(int Id);
	/*
	* Reporta toda las las resoluciones emitidas
	*/	
	List<Resolemitida> findResolucionemitidaByAllName();
	

	
		
	
		////////////
		
	List<Resolucion> findresol();
	
//	List<Resolemitida> findResolucionemitidaByAllName();
	
//	List<Resolemitida> finddnicodresol(String dni);
	
//	public <T> T findById(Class<T> entityClass, Long id);

	
}
