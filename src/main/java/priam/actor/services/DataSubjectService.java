package priam.actor.services;

import priam.actor.dto.DataSubjectCategoryRequestDTO;
import priam.actor.dto.DataSubjectCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;

import java.util.List;

public interface DataSubjectService {
    DataSubjectResponseDTO saveDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO);
    DataSubjectResponseDTO findDataSubject(int dataSubjectId);
    int getDataSubjectIdByIdRef(String idRef);
    DataSubjectResponseDTO getDataSubjectByIdRef(String idRef);
    DataSubjectCategoryResponseDTO saveDataSubjectCategory(DataSubjectCategoryRequestDTO dataSubjectCategoryRequestDTO);
    List<DataSubjectCategoryResponseDTO> getAllDataSubjectCategories();
    DataSubjectCategoryResponseDTO getDataSubjectCategoryById(int dataSubjectCategoryId);
}
