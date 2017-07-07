package com.solmit.entidad;
// Generated 14/06/2017 03:28:50 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsuarioRol generated by hbm2java
 */
@Entity
@Table(name = "usuario_rol", catalog = "tienda")
public class UsuarioRol implements java.io.Serializable {

	private UsuarioRolId id;
	private Rol rol;
	private Usuario usuario;

	public UsuarioRol() {
	}

	public UsuarioRol(UsuarioRolId id, Rol rol, Usuario usuario) {
		this.id = id;
		this.rol = rol;
		this.usuario = usuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rolNombre", column = @Column(name = "rol_nombre", nullable = false, length = 20)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false, length = 20)) })
	public UsuarioRolId getId() {
		return this.id;
	}

	public void setId(UsuarioRolId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol_nombre", nullable = false, insertable = false, updatable = false)
	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
