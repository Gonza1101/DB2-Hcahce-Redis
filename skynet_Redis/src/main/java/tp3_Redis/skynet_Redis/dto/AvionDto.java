package tp3_Redis.skynet_Redis.dto;

import java.util.UUID;

public class AvionDto {
	
	private UUID id;
	private String numeroSerieAvion;
	private String nombreTipoAvion;
	private Integer totalAsiento;
	
	public AvionDto(String numeroSerieAvion, String nombreTipoAvion, Integer totalAsiento) {
		this.numeroSerieAvion = numeroSerieAvion;
		this.nombreTipoAvion = nombreTipoAvion;
		this.totalAsiento = totalAsiento;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNumeroSerieAvion() {
		return numeroSerieAvion;
	}

	public void setNumeroSerieAvion(String numeroSerieAvion) {
		this.numeroSerieAvion = numeroSerieAvion;
	}

	public String getNombreTipoAvion() {
		return nombreTipoAvion;
	}

	public void setNombreTipoAvion(String nombreTipoAvion) {
		this.nombreTipoAvion = nombreTipoAvion;
	}

	public Integer getTotalAsiento() {
		return totalAsiento;
	}

	public void setTotalAsiento(Integer totalAsiento) {
		this.totalAsiento = totalAsiento;
	}
}
