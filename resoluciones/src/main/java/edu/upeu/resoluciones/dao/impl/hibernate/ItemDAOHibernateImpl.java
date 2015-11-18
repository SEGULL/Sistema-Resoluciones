package edu.upeu.resoluciones.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import edu.upeu.resoluciones.dao.ItemDAO;
import edu.upeu.resoluciones.domain.Item;

@Repository
public class ItemDAOHibernateImpl extends
		GenericDaoHibernateImpl<Item, String> implements ItemDAO {

}
