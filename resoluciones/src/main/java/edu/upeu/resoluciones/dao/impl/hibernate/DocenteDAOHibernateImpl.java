package edu.upeu.resoluciones.dao.impl.hibernate;


import org.springframework.stereotype.Repository;

import edu.upeu.resoluciones.dao.DocenteDAO;
import edu.upeu.resoluciones.domain.Docente;


@Repository
public class DocenteDAOHibernateImpl extends
		GenericDaoHibernateImpl<Docente, String> implements DocenteDAO {

	
}
