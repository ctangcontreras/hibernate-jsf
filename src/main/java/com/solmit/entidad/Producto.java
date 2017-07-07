package com.solmit.entidad;
// Generated 14/06/2017 03:28:50 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "tienda")
public class Producto implements java.io.Serializable {

	private Integer idProducto;
	private Categoria categoria;
	private String nombre;
	private String descripcion;
	private Long precio;
	private Integer stock;
	private Integer importancia;
	private String imagen;
	private Set<DetallePedido> detallePedidos = new HashSet<DetallePedido>(0);

	public Producto() {
	}

	public Producto(Categoria categoria) {
		this.categoria = categoria;
	}

	public Producto(Categoria categoria, String nombre, String descripcion, Long precio, Integer stock,
			Integer importancia, String imagen, Set<DetallePedido> detallePedidos) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.importancia = importancia;
		this.imagen = imagen;
		this.detallePedidos = detallePedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_producto", unique = true, nullable = false)
	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "nombre", length = 128)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 256)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "precio", precision = 10, scale = 0)
	public Long getPrecio() {
		return this.precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	@Column(name = "stock")
	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Column(name = "importancia")
	public Integer getImportancia() {
		return this.importancia;
	}

	public void setImportancia(Integer importancia) {
		this.importancia = importancia;
	}

	@Column(name = "imagen", length = 20)
	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<DetallePedido> getDetallePedidos() {
		return this.detallePedidos;
	}

	public void setDetallePedidos(Set<DetallePedido> detallePedidos) {
		this.detallePedidos = detallePedidos;
	}

}
