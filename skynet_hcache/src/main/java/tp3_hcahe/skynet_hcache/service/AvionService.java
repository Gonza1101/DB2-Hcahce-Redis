package tp3_hcahe.skynet_hcache.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import tp3_hcahe.skynet_hcache.dto.AvionDto;
import tp3_hcahe.skynet_hcache.entity.Avion;
import tp3_hcahe.skynet_hcache.repository.AvionRepository;

@Service
public class AvionService {
	
	@Autowired
	AvionRepository avionRepositorio;
	
	public List<Avion> findAll(){
		return this.avionRepositorio.findAll();
	}
	
	@Cacheable(cacheNames = {"skynethCache"}, key="#id")
	public Avion findById(UUID id) {
		return avionRepositorio.findById(id).get();
	}
	
	public Avion crear(AvionDto nuevoAvion) {
		Avion nAvion = new Avion();
		nAvion.setId(UUID.randomUUID());
		nAvion.setNombreTipoAvion(nuevoAvion.getNombreTipoAvion());
		nAvion.setNumeroSerieAvion(nuevoAvion.getNumeroSerieAvion());
		nAvion.setTotalAsiento(nuevoAvion.getTotalAsiento());
		nAvion.setVersion(0);
		return this.avionRepositorio.save(nAvion);
	}
}
