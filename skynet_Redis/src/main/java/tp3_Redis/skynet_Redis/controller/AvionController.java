package tp3_Redis.skynet_Redis.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tp3_Redis.skynet_Redis.dto.AvionDto;
import tp3_Redis.skynet_Redis.entity.Avion;
import tp3_Redis.skynet_Redis.service.AvionService;

@RestController
public class AvionController {

	@Autowired
	private AvionService avionServicio;

	@GetMapping("/aviones")
	public List<Avion> getAviones(){
		return this.avionServicio.findAll();
	}
	
	@GetMapping("/avion/{id}")
	public Avion getAvionById(@PathVariable UUID id) {
		System.out.println("AvionController");
		return this.avionServicio.findById(id);
	}
	
	@PostMapping("/avion")
	public String crear(@RequestBody AvionDto nuevoAvion) {
		this.avionServicio.crear(nuevoAvion);
		return "Avion Agregado";
	}
}
