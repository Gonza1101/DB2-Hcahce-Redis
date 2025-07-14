package tp3_Redis.skynet_Redis.repository;


import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp3_Redis.skynet_Redis.entity.Aeropuerto;


@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, UUID> {
	
	Optional<Aeropuerto> findBynombreaeropuerto(String nombreAeropuerto);
}
