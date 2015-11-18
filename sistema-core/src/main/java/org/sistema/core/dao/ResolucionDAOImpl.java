package org.sistema.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.sistema.core.domain.Datos;
import org.sistema.core.domain.Docente;

//import java.util.List;

import org.sistema.core.domain.Resolemitida;
import org.sistema.core.domain.Resolucion;
import org.sistema.core.domain.Usuario;

public class ResolucionDAOImpl  extends BaseDAOHibernate implements ResolucionDAO {
	
	
	/**
	 * impldaoresoluciones busqueda por DNI
	 * @param dni
	 * @return
	 */
	public List<Resolemitida> finddnicodresoemida(String dni){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Resolemitida  WHERE docente.dni='"+dni+"'");
//		queryBuffer.append(" FROM Resolemitida  WHERE docente.dni='"+dni+"' and codresolucion='sadasd'");
//		queryBuffer.append(" FROM Resolemitida");
		return find(Resolemitida.class, queryBuffer.toString());
	}
	
	/**
	** Reportar usuario con cantidad por resoluciones
	*/		
	public List<Resolemitida> FindUsuarioCanResol(String nombre){
//				StringBuffer queryBuffer = new StringBuffer();
//				queryBuffer.append("select usuario.nombre,count(resolemitida.id) "
//						+ "from resolemitida, usuario where resolemitida.id_2=usuario.id and usuario.nombre=´"+nombre+"´");
//				return find(Resolemitida.class, queryBuffer.toString());
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();

		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append("select usuario.nombre as nombre ,count(resolemitida.id) as count "
				+ "from resolemitida, usuario where resolemitida.id_2=usuario.id and usuario.nombre='"+nombre+"'");
		SQLQuery query = session.createSQLQuery(queryBuffer.toString());
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		query.addEntity(Resolemitida.class);
		@SuppressWarnings("unchecked")
		List<Object[]> results = query.list();

		List<Resolemitida> returnReso = new ArrayList<Resolemitida>();
						
		for (Object[] object : results) {
			Resolemitida reso = new Resolemitida();
			reso.setNombre(object[0].toString());
			reso.setCountReso( Integer.parseInt(object[1].toString()));
			returnReso.add(reso);
		}
		return returnReso;
	}
	
	
	/**
	 * reporta datos de docente haciendo busqueda pro DNI
	 * @param dni
	 * @return
	 */
	public List<Docente> FinReporteDniDoc(String dni){
		
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Docente  WHERE dni='"+dni+"'");
		return find(Docente.class, queryBuffer.toString());
	}
	
	
	
	/**
	 * guardar resolucion emitida
	 * @param resolemitida
	 */
	public void saveresolucionemitida(Resolemitida resolemitida){
		this.save(resolemitida);
	}
			//foranikel usuario
			public Usuario findIdUsuario(int Id){
				StringBuffer queryBuffer = new StringBuffer();
				queryBuffer.append(" FROM Usuario  WHERE Id="+Id);
				return findFirst(Usuario.class, queryBuffer.toString());
			}
			//foranikey docente
			public Docente findIdDocente(int Id){
				StringBuffer queryBuffer = new StringBuffer();
				queryBuffer.append(" FROM Docente  WHERE Id="+Id);
				return findFirst(Docente.class, queryBuffer.toString());
			}
			//Foranikey resolucion
			public Resolucion findIdResolucion(int Id){
				StringBuffer queryBuffer = new StringBuffer();
				queryBuffer.append(" FROM Resolucion  WHERE Id="+Id);
				return findFirst(Resolucion.class, queryBuffer.toString());
			}
	/*
	* guardar datos con la resolucion emitida
	*/
	public void savedatosresolemitida(Datos datosemitidos){
				this.save(datosemitidos);
	}
			//Foranikey resolemitida
			public Resolemitida findIdResolemitidarepor(int Id){
				StringBuffer queryBuffer = new StringBuffer();
				queryBuffer.append(" FROM Resolemitida  WHERE Id="+Id);
				return findFirst(Resolemitida.class, queryBuffer.toString());
			}
	
	/*
	* Reporta toda las las resoluciones emitidas
	*/	
	public List<Resolemitida> findResolucionemitidaByAllName() {
			StringBuffer queryBuffer = new StringBuffer();
			queryBuffer.append("FROM Resolemitida");
		//and Resolemitida.id=Docente.id  and Resolemitida.Id=Docente.Id
			return find(Resolemitida.class, queryBuffer.toString());
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Resolucion> findresol() {

		
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Resolucion");
	
		return find(Resolucion.class, queryBuffer.toString());
	
	
	}
	
	
	
	
	public List<Docente> finddnidocente(String dni){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Docente WHERE  Docente.dni="+dni);

		return find(Docente.class, queryBuffer.toString());
	}
	
	
}
