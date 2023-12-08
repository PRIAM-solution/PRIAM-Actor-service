package priam.datasubject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DataSubject;

public interface DataSubjectRepository extends JpaRepository<DataSubject, Integer> {
    DataSubject findDataSubjectByIdRef(String idRef);

}
