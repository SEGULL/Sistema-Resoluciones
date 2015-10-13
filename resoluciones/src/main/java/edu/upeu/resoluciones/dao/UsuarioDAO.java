package edu.upeu.resoluciones.dao;

import edu.upeu.resoluciones.domain.Usuario;

public interface UsuarioDAO extends GenericDao<Usuario, String>{

	Usuario getUsuarioPorUsernameYContrasenia(String username,
			String contrasenia);
}
