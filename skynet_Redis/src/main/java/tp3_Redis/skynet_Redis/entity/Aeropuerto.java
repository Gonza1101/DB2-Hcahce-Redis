package tp3_Redis.skynet_Redis.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aeropuerto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private UUID id;
	@Column
	private String nombreaeropuerto;
	private String ciudad;
	private String pais;
	private Integer version;
	
	public String getNombreAeropuerto() {
		return nombreaeropuerto;
	}
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreaeropuerto = nombreAeropuerto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
