package tp3_hcahe.skynet_hcache.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp3_hcahe.skynet_hcache.entity.Avion;


@Repository
public interface AvionRepository extends JpaRepository<Avion,UUID> {

}
