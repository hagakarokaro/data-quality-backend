package id.co.nti.bi.data.quality.backend.repository;

import id.co.nti.bi.data.quality.backend.entity.dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("dummyRepo")
public interface dummyRepo extends JpaRepository<dummy, UUID> {
}
