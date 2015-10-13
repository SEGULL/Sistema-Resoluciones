package edu.upeu.resoluciones.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.upeu.resoluciones.dao.ItemDAO;
import edu.upeu.resoluciones.dao.ResolucionItemDAO;
import edu.upeu.resoluciones.dao.ResolucionDAO;
import edu.upeu.resoluciones.domain.Item;
import edu.upeu.resoluciones.domain.Resolucion;
import edu.upeu.resoluciones.domain.ResolucionItem;
import edu.upeu.resoluciones.service.ResolucionService;
import edu.upeu.resoluciones.web.form.ItemForm;
import edu.upeu.resoluciones.web.form.ResolucionForm;

@Service
@Transactional(readOnly = true)
public class ResolucionServiceImpl implements ResolucionService {

	@Autowired
	private ResolucionDAO resolucionDAO;
	@Autowired
	private ResolucionItemDAO resolucionItemDAO;
	@Autowired
	private ItemDAO itemDAO;

	public List<ResolucionForm> getListaResolucion() {

		List<ResolucionForm> lf = new ArrayList<ResolucionForm>();

		List<Resolucion> lista = resolucionDAO.getAll(Resolucion.class);

		for (Resolucion d : lista) {
			ResolucionForm df = new ResolucionForm();
			df.setId(d.getId());
			df.setNombre(d.getNombre());
			

			lf.add(df);
		}

		return lf;
	}

	@Transactional(readOnly = false)
	public void guardarResolucion(ResolucionForm df) {
		Resolucion d = new Resolucion();
		
		d.setNombre(df.getNombre());

		if (StringUtils.isEmpty(df.getId())) {
			resolucionDAO.insert(d);
		} else {
			d.setId(df.getId());
			resolucionDAO.update(d);
		}
	}

	public ResolucionForm getResolucionPorId(String id) {
		ResolucionForm df = new ResolucionForm();
		Resolucion d = resolucionDAO.findByPK(Resolucion.class, id);

		if (d != null) {
			df.setId(d.getId().toString());
			df.setNombre(d.getNombre());
			
		}

		return df;
	}

	@Override
	public ResolucionForm getResolucionItemPorId(String id) {

		ResolucionForm df = new ResolucionForm();

		Resolucion d = resolucionDAO.findByPK(Resolucion.class, id);

		if (d != null) {
			df.setId(d.getId());
			df.setNombre(d.getNombre());
		
			
			List<ItemForm> ldc = new ArrayList<ItemForm>();

			for (ResolucionItem dc : d.getItems()) {
				ItemForm cf = new ItemForm();
				cf.setId(dc.getItem().getId());
				cf.setNombre(dc.getItem().getNombre());
				cf.setTipo(dc.getItem().getTipo());

				ldc.add(cf);
			}

			df.setItems(ldc);

		}

		return df;
	}

	

	@Override
	public ResolucionForm getResolucionAllItemsPorId(String id) {

		List<Item> items = itemDAO.getAll(Item.class);
		ResolucionForm df = new ResolucionForm();

		Resolucion d = resolucionDAO.findByPK(Resolucion.class, id);

		if (d != null) {
			df.setId(d.getId());
			df.setNombre(d.getNombre());
			

			List<ItemForm> ldc = new ArrayList<ItemForm>();

			// hago el recorrido de la lista de items
			for (Item c : items) {
				ItemForm cf = new ItemForm();
				cf.setId(c.getId());
				cf.setNombre(c.getNombre());
				

				// verifico si el item actual esta contenido dentro de los
				// itemss que ensenia ea la resolucion
				for (ResolucionItem cc : d.getItems()) {
					if (cc.getItem().equals(c)) {
						cf.setChecked("checked='checked'");
					}

				}

				ldc.add(cf);
			}

			df.setItems(ldc);

		}

		return df;
	}

	@Transactional(readOnly = false)
	public void guardarItemsResolucion(String id, String[] ids) {
		Resolucion d = new Resolucion();
		d.setId(id);
		List<ResolucionItem> ldc = resolucionItemDAO.getAllRestrictionEQ(
				ResolucionItem.class, "resolucion.id", id);
		for (ResolucionItem dc : ldc) {
			resolucionItemDAO.remove(dc);
		}

		for (String i : ids) {
			ResolucionItem dc = new ResolucionItem();
			Item c = new Item();
			c.setId(i);
			dc.setItem(c);
			dc.setResolucion(d);
			resolucionItemDAO.insert(dc);
		}
	}
}
