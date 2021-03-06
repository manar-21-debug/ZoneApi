package ma.bkam.zoneapi.zoneapi.dao.repository;

import ma.bkam.zoneapi.zoneapi.dao.model.VilleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends JpaRepository<VilleEntity, Long> {
}
