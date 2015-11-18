package edu.upeu.resoluciones.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -1866810597143940033L;
	@Id
	@GeneratedValue(generator = "genId")
	@GenericGenerator(name = "genId", strategy = "edu.upeu.resoluciones.util.GeneradorIDRandom")
	@Column(name = "ID_USUARIO")
	private String id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "PASSWD")
	private String password;

	//INSERT INTO `usuario`(`ID_USUARIO`, `NOMBRE`, `PASSWD`, `USERNAME`) VALUES (1,'admin',md5('admin'),'admin')
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
