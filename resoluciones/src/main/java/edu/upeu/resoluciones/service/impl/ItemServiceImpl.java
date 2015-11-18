package edu.upeu.resoluciones.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.upeu.resoluciones.dao.ItemDAO;
import edu.upeu.resoluciones.domain.Docente;
import edu.upeu.resoluciones.domain.Item;

import edu.upeu.resoluciones.service.ItemService;
import edu.upeu.resoluciones.web.form.ItemForm;

@Service
@Transactional(readOnly = true)
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDAO itemDAO;

	public List<ItemForm> listar() {
		List<ItemForm> lista = new ArrayList<ItemForm>();
		List<Item> r = itemDAO.getAll(Item.class);
		for (Item resolucion : r) {
			ItemForm cf = new ItemForm();

			cf.setId(resolucion.getId().toString());
			cf.setNombre(resolucion.getNombre());
			cf.setTipo(resolucion.getTipo());
			
			lista.add(cf);
		}

		return lista;
	}

	@Transactional(readOnly = false)
	public void guardar(ItemForm p) {
		Item c = new Item();
		c.setNombre(p.getNombre());
		c.setTipo(p.getTipo());

		if (StringUtils.isEmpty(p.getId())) {
			itemDAO.insert(c);
		} else {
			c.setId(p.getId());
			itemDAO.update(c);
		}

	}

	public ItemForm getItemPorId(String id) {
		Item item = itemDAO.findByPK(Item.class, id);
		ItemForm cf = new ItemForm();
		cf.setId(item.getId().toString());
		cf.setNombre(item.getNombre());
		cf.setTipo(item.getTipo());

		return cf;
	}

	
	
}
