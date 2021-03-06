package ma.bkam.zoneapi.zoneapi.dao.repository;

import ma.bkam.zoneapi.zoneapi.dao.model.ZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<ZoneEntity, Long> {
}
