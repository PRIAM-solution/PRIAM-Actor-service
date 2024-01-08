package priam.actor.services;

import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;

public interface DataSubjectService {
    DataSubjectResponseDTO saveDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO);
    DataSubjectResponseDTO findDataSubject(int idDataSubject);
    int getDataSubjectIdByIdRef(String idref);
    DataSubjectResponseDTO getDataSubjectByIdRef(String idref);
    DSCategoryResponseDTO saveDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO);
    DSCategoryResponseDTO getDataSubjectCategoryById(int dscId);
}
