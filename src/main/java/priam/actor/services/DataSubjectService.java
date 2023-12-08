package priam.actor.services;

import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.dto.DataSubjectResponseDTO;

public interface DataSubjectService {
    DataSubjectResponseDTO findDataSubject(int idDataSubject);
    int getDataSubjectIdByIdRef(String idref);
    DataSubjectResponseDTO getDataSubjectByIdRef(String idref);
    DSCategoryResponseDTO getDataSubjectCategoryById(int dscId);
}
