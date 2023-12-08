package priam.actor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import priam.actor.entities.DSCategory;

public interface DSCategoryRepository extends JpaRepository<DSCategory, Integer> {
    DSCategory findDSCategoryByDscId(int dscId);
}
