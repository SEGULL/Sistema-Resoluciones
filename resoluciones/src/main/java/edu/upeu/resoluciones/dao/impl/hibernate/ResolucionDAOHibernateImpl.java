package edu.upeu.resoluciones.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import edu.upeu.resoluciones.dao.ResolucionDAO;
import edu.upeu.resoluciones.domain.Resolucion;

@Repository
public class ResolucionDAOHibernateImpl extends
		GenericDaoHibernateImpl<Resolucion, String> implements ResolucionDAO {

}
