package org.sistema.service.services;

import java.util.List;
import org.sistema.core.dao.ResolucionDAO;
import org.sistema.core.domain.Datos;
import org.sistema.core.domain.Docente;
import org.sistema.core.domain.Resolemitida;
import org.sistema.core.domain.Resolucion;
import org.sistema.core.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resolucionService")
public class ResolucionServiceImpl {

	@Autowired
	private ResolucionDAO resolucionDAO;

	/**
	 * resoluciones busqueda por DNI
	 * @param dni
	 * @return
	 */
	public List<Resolemitida> finddniresolser(String dni) {
		return resolucionDAO.finddnicodresoemida(dni);
	}
	
	/**
	** Reportar usuario con cantidad por resoluciones
	*/ 
	public List<Resolemitida> FindUsuarioCanResol(String nombre){
		return resolucionDAO.FindUsuarioCanResol(nombre);
	}

	/**
	 * reporta datos de docente haciendo busqueda pro DNI
	 * @param dni
	 * @return
	 */
	public List<Docente> FinReporteDniDoc(String dni) {
		return resolucionDAO.FinReporteDniDoc(dni);
	}
	
	
	/**
	 * guardar resolucion emitida
	 * @param resolemitida
	 */

	public void saveresolucionemitida(Resolemitida resolemitida) {
		this.resolucionDAO.saveresolucionemitida(resolemitida);//ojo
	}

			/*
			 *  foranikey docente
			*/
			public Usuario findIdUsuario(int Id) {
				return resolucionDAO.findIdUsuario(Id);
			}
			/*
			 *  foranikey docente
			 */
			
			public Docente findIdDocente(int Id) {
				return resolucionDAO.findIdDocente(Id);
			}
		
			/*
			 *  Foranikey resolucion
			 */
			public Resolucion findIdResolucion(int Id) {
				return resolucionDAO.findIdResolucion(Id);
			}

	/*
	* guardar datos con la resolucion emitida
	*/
	public void savedatosresolemitida(Datos datosemitidos) {
		this.resolucionDAO.savedatosresolemitida(datosemitidos);//ojo
	}

		/**
		* Foranikey resolemitida
		*/
		public Resolemitida findIdResolemitidarepor(int Id) {
			return resolucionDAO.findIdResolemitidarepor(Id);
		}
		
		
	
	
	
	////
	// public List<Resolemitida> findResolucionemitidaByAllName() {
	// return resolucionDAO.findResolucionemitidaByAllName();
	//
	// }
	// public List<Resolucion> findresol() {
	//
	//
	//// StringBuffer queryBuffer = new StringBuffer();
	//// queryBuffer.append(" FROM Resolucion");
	//
	//// return find(Resolucion.class, queryBuffer.toString());
	// return resolucionDAO.findresol();
	//
	//
	// }
	// public List<Resolemitida> finddnicodresol(String dni,String cod ){
	//// StringBuffer queryBuffer = new StringBuffer();
	//// queryBuffer.append(" FROM Resolemitida WHERE
	//// Resolemitida.codresolucion="+cod+" || Docente.dni="+dni);
	//// query=query+"");
	//// );
	//
	//// String query = "FROM SessionElection WHERE userSystem.id=" +
	//// userSystemId;
	//// query = query + " and '" + dateString + "' between election.dateIni and
	//// election.dateEnd ";
	//
	//// return find(Resolemitida.class, queryBuffer.toString());
	// return resolucionDAO.finddnicodresol( dni);
	// }
	// public List<Docente> finddnidocente(String dni){
	// StringBuffer queryBuffer = new StringBuffer();
	// queryBuffer.append(" FROM Docente WHERE Docente.dni="+dni);
	// query=query+"");
	// );

	// String query = "FROM SessionElection WHERE userSystem.id=" +
	// userSystemId;
	// query = query + " and '" + dateString + "' between election.dateIni and
	// election.dateEnd ";

	// return find(Docente.class, queryBuffer.toString());
	// return resolucionDAO.finddnidocente(dni);
	// }

	// public List<Iten> findIten() {
	// return resolucionDAO.findIten();
	// }

}
