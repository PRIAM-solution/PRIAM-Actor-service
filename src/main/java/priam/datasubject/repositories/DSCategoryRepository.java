package priam.datasubject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import priam.datasubject.entities.DSCategory;
import priam.datasubject.entities.DataSubject;

public interface DSCategoryRepository extends JpaRepository<DSCategory, Integer> {
    DSCategory findDSCategoryByDscId(int dscId);
}
