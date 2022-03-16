package id.co.nti.bi.neuralbidataquality.repository;

import id.co.nti.bi.neuralbidataquality.entity.dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("dummyRepo")
public interface dummyRepo extends JpaRepository<dummy, UUID> {
}
