package tp3_Redis.skynet_Redis.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tp3_Redis.skynet_Redis.dto.AeropuertoDto;
import tp3_Redis.skynet_Redis.entity.Aeropuerto;
import tp3_Redis.skynet_Redis.service.AeropuertoService;

@RestController
public class AeropuertoController {
	
	@Autowired
	private AeropuertoService aeropuertoService;
	
	@GetMapping("/")
	public String helloWorld(){
		return "Llegaste al World";
	}
	
	@GetMapping("/aeropuertos")
	public List<Aeropuerto> getAeropuertos(){
		return this.aeropuertoService.findAll();
	}
	
	@GetMapping("/aeropuerto/{id}")
	public Aeropuerto getAeropuerto(@PathVariable UUID id) {
		return this.aeropuertoService.findById(id);
	}
	
	@PutMapping("/aeropuerto")
	public Aeropuerto upDateCiudadAeropuerto(@RequestBody AeropuertoDto nuevoAeropuerto) {
		
		return this.aeropuertoService.upDateNombreAeropuerto(nuevoAeropuerto);
	}
	
	@PostMapping("/aeropuerto")
	public String addAeropuerto(@RequestBody AeropuertoDto nuevoAeropuerto) {
		this.aeropuertoService.crear(nuevoAeropuerto);
		return "Agregado";
	}
}
