package priam.actor.services;

import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;

import java.util.List;

public interface DataSubjectService {
    DataSubjectResponseDTO saveDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO);
    DataSubjectResponseDTO findDataSubject(int idDataSubject);
    int getDataSubjectIdByIdRef(String idref);
    DataSubjectResponseDTO getDataSubjectByIdRef(String idref);
    DSCategoryResponseDTO saveDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO);
    List<DSCategoryResponseDTO> getAllDataSubjectCategories();
    DSCategoryResponseDTO getDataSubjectCategoryById(int dscId);
}
