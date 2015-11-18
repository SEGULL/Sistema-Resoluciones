package edu.upeu.resoluciones.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.upeu.resoluciones.dao.DocenteDAO;
import edu.upeu.resoluciones.domain.Docente;
import edu.upeu.resoluciones.service.DocenteService;
import edu.upeu.resoluciones.web.form.DocenteForm;

@Service
@Transactional(readOnly = true)
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteDAO docenteDAO;

	public List<DocenteForm> listarDocentes() {

		List<DocenteForm> l = new ArrayList<DocenteForm>();

		List<Docente> lista = docenteDAO.getAll(Docente.class);

		for (Docente p : lista) {
			DocenteForm pf = new DocenteForm();
			pf.setId(p.getId().toString());
			pf.setNombre(p.getNombre());
			pf.setApePat(p.getApePat());
			pf.setApeMat(p.getApeMat());
			pf.setDni(p.getDni());
			pf.setNombre_region(p.getNombre_region());
			pf.setNombre_un_eje(p.getNombre_un_eje());
			pf.setNombre_or_inter(p.getNombre_or_inter());
			pf.setProvincia(p.getProvincia());
			pf.setDistrito(p.getDistrito());
			pf.setTipo_ie(p.getTipo_ie());
			pf.setGestion(p.getGestion());
			pf.setZona(p.getZona());
			pf.setCodigo_mod_ie(p.getCodigo_mod_ie());
			pf.setClave8(p.getClave8());
			pf.setNivel_educativo(p.getNivel_educativo());
			pf.setNivel_educacion_educativa(p.getNivel_educacion_educativa());
			pf.setCodigo_plaza(p.getCodigo_plaza());
			pf.setSub_tipo_trabajador(p.getTipo_trabajador());
			pf.setSub_tipo_trabajador(p.getSub_tipo_trabajador());
			pf.setCargo(p.getCargo());
			pf.setSituacion_laboral(p.getSituacion_laboral());
			pf.setMotivo_vac(p.getMotivo_vac());
			pf.setCategoria(p.getCategoria());
			pf.setJornada(p.getJornada());
			pf.setEstado(p.getEstado());
			pf.setCodigo_modular(p.getCodigo_modular());
			pf.setFecha_nacimiento(p.getFecha_nacimiento());
			pf.setFecha_inicio(p.getFecha_inicio());
			pf.setFecha_termino(p.getFecha_termino());
			pf.setTipo_registro(p.getTipo_registro());
			pf.setLey(p.getLey());

			l.add(pf);
		}

		return l;
	}

	

	public DocenteForm getDocentePorId(String id) {
		DocenteForm d = new DocenteForm();
		Docente docente = docenteDAO.findByPK(Docente.class, id);

		if (docente != null) {
			d.setNombre(docente.getNombre());
			d.setApePat(docente.getApePat());
			d.setApeMat(docente.getApeMat());
			d.setDni(docente.getDni());
			d.setNombre_region(docente.getNombre_region());
			d.setNombre_un_eje(docente.getNombre_un_eje());
			d.setNombre_or_inter(docente.getNombre_or_inter());
			d.setProvincia(docente.getProvincia());
			d.setDistrito(docente.getDistrito());
			d.setTipo_ie(docente.getTipo_ie());
			d.setGestion(docente.getGestion());
			d.setZona(docente.getZona());
			d.setCodigo_mod_ie(docente.getCodigo_mod_ie());
			d.setClave8(docente.getClave8());
			d.setNivel_educativo(docente.getNivel_educativo());
			d.setNivel_educacion_educativa(docente.getNivel_educacion_educativa());
			d.setCodigo_plaza(docente.getCodigo_plaza());
			d.setSub_tipo_trabajador(docente.getTipo_trabajador());
			d.setSub_tipo_trabajador(docente.getSub_tipo_trabajador());
			d.setCargo(docente.getCargo());
			d.setSituacion_laboral(docente.getSituacion_laboral());
			d.setMotivo_vac(docente.getMotivo_vac());
			d.setCategoria(docente.getCategoria());
			d.setJornada(docente.getJornada());
			d.setEstado(docente.getEstado());
			d.setCodigo_modular(docente.getCodigo_modular());
			d.setFecha_nacimiento(docente.getFecha_nacimiento());
			d.setFecha_inicio(docente.getFecha_inicio());
			d.setFecha_termino(docente.getFecha_termino());
			d.setTipo_registro(docente.getTipo_registro());
			d.setLey(docente.getLey());

		
	}

		return d;
}
}