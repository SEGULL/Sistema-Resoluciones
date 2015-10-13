package edu.upeu.resoluciones.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import edu.upeu.resoluciones.dao.ResolucionItemDAO;
import edu.upeu.resoluciones.domain.ResolucionItem;

@Repository
public class ResolucionItemDAOHibernateImpl extends GenericDaoHibernateImpl<ResolucionItem, String> implements ResolucionItemDAO {

}
