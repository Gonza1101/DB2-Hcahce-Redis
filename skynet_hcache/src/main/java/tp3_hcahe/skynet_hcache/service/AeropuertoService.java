package tp3_hcahe.skynet_hcache.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import tp3_hcahe.skynet_hcache.dto.AeropuertoDto;
import tp3_hcahe.skynet_hcache.entity.Aeropuerto;
import tp3_hcahe.skynet_hcache.repository.AeropuertoRepository;

@Service
public class AeropuertoService {
	
	@Autowired
	private AeropuertoRepository aeropuertoRepository;
	
	public List<Aeropuerto> findAll(){
		return this.aeropuertoRepository.findAll();
	}
	
	@Cacheable(cacheNames = {"skynethCache"}, key="#id")
	public Aeropuerto findById(UUID id) {
		return this.aeropuertoRepository.findById(id).get();
	}
	
	@CachePut(value="skynethCache", key="#result.id")
	public Aeropuerto upDateNombreAeropuerto(AeropuertoDto nuevoAeropuerto) {
		Aeropuerto viejoAeropuerto = this.aeropuertoRepository.findById(nuevoAeropuerto.getId())
				.orElseThrow(() -> new IllegalArgumentException("Error-Nombre Aeropuerto Inexistente - " + nuevoAeropuerto.getNombreAeropuerto()));
		viejoAeropuerto.setNombreAeropuerto(nuevoAeropuerto.getNombreAeropuerto());
		viejoAeropuerto.setVersion(viejoAeropuerto.getVersion()+1);
		Aeropuerto updateCiudadAeropuerto = aeropuertoRepository.save(viejoAeropuerto);
		return updateCiudadAeropuerto;
	}
	
	public Aeropuerto crear (AeropuertoDto nuevoAeropuerto) {
		Aeropuerto nAeropuerto = new Aeropuerto();
		nAeropuerto.setId(UUID.randomUUID());
		nAeropuerto.setNombreAeropuerto(nuevoAeropuerto.getNombreAeropuerto());
		nAeropuerto.setCiudad(nuevoAeropuerto.getCiudad());
		nAeropuerto.setPais(nuevoAeropuerto.getPais());
		nAeropuerto.setVersion(0);
		return this.aeropuertoRepository.save(nAeropuerto);
	}
}
