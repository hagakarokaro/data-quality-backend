package id.co.nti.bi.data.quality.backend.repository;

import id.co.nti.bi.data.quality.backend.entity.DataIntegrity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository ("dataIntegrityRepository")
public interface DataIntegrityRepository extends JpaRepository<DataIntegrity, UUID> {

}
