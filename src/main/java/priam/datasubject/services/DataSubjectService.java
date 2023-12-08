package priam.datasubject.services;

import priam.datasubject.dto.DSCategoryResponseDTO;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DataSubject;

public interface DataSubjectService {
    DataSubjectResponseDTO findDataSubject(int idDataSubject);
    int getDataSubjectIdByIdRef(String idref);
    DataSubjectResponseDTO getDataSubjectByIdRef(String idref);
    DSCategoryResponseDTO getDataSubjectCategoryById(int dscId);
}
