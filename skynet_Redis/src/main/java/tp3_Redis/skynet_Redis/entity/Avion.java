package tp3_Redis.skynet_Redis.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Avion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private UUID id;
	@Column
	private String numeroserieavion;
	private String nombretipoavion;
	private Integer totalasiento;
	private Integer version;
	
	public String getNumeroSerieAvion() {
		return numeroserieavion;
	}
	public void setNumeroSerieAvion(String numeroSerieAvion) {
		this.numeroserieavion = numeroSerieAvion;
	}
	public String getNombreTipoAvion() {
		return nombretipoavion;
	}
	public void setNombreTipoAvion(String nombreTipoAvion) {
		this.nombretipoavion = nombreTipoAvion;
	}
	public Integer getTotalAsiento() {
		return totalasiento;
	}
	public void setTotalAsiento(Integer totalAsiento) {
		this.totalasiento = totalAsiento;
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
