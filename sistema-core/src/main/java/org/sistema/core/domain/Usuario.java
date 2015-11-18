package org.sistema.core.domain;

public class Usuario extends BaseEntity {

	private static final long serialVersionUID = 0L;
        private String nombre;
	private String password;
	private String tipo;

	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
