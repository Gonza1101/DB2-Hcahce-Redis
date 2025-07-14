package tp3_Redis.skynet_Redis.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp3_Redis.skynet_Redis.entity.Avion;


@Repository
public interface AvionRepository extends JpaRepository<Avion,UUID> {

}
