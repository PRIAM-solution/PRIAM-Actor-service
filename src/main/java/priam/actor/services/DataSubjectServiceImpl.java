package priam.actor.services;

import org.springframework.stereotype.Service;
import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;
import priam.actor.entities.DataSubjectCategory;
import priam.actor.entities.DataSubject;
import priam.actor.mappers.DSCategoryMapper;
import priam.actor.mappers.DataSubjectMapper;
import priam.actor.repositories.DataSubjectCategoryRepository;
import priam.actor.repositories.DataSubjectRepository;

import javax.annotation.Generated;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)
@Service
@Transactional
public class DataSubjectServiceImpl implements DataSubjectService {
    final DataSubjectRepository dataSubjectRepository;
    final DataSubjectCategoryRepository dataSubjectCategoryRepository;
    final DataSubjectMapper dataSubjectMapper;

    final DSCategoryMapper dsCategoryMapper;

    public DataSubjectServiceImpl(DataSubjectRepository dataSubjectRepository, DataSubjectCategoryRepository dataSubjectCategoryRepository, DataSubjectMapper dataSubjectMapper, DSCategoryMapper dsCategoryMapper) {
        this.dataSubjectRepository = dataSubjectRepository;
        this.dataSubjectCategoryRepository = dataSubjectCategoryRepository;
        this.dataSubjectMapper = dataSubjectMapper;
        this.dsCategoryMapper = dsCategoryMapper;
    }

    @Override
    public DataSubjectResponseDTO saveDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO) {
        DataSubject dataSubject = dataSubjectMapper.DataSubjectRequestDTOToDataSubject(dataSubjectRequestDTO);
        DataSubject result = dataSubjectRepository.save(dataSubject);
        return dataSubjectMapper.DataSubjectToDataSubjectResponseDTO(result);
    }
    @Override
    public DataSubjectResponseDTO findDataSubject(int idDataSubject) {
        DataSubject dataSubject = dataSubjectRepository.findById(idDataSubject).get();
        DataSubjectResponseDTO dataSubjectResponseDTO =
                dataSubjectMapper.DataSubjectToDataSubjectResponseDTO(dataSubject);
        return dataSubjectResponseDTO;
    }

    @Override
    public DataSubjectResponseDTO getDataSubjectByIdRef(String idRef) {
        DataSubject dataSubject = dataSubjectRepository.findByReferenceId(idRef);
        DataSubjectResponseDTO dataSubjectResponseDTO =
                dataSubjectMapper.DataSubjectToDataSubjectResponseDTO(dataSubject);
        return dataSubjectResponseDTO;
    }

    @Override
    public int getDataSubjectIdByIdRef(String idRef) {
        DataSubject dataSubject = dataSubjectRepository.findByReferenceId(idRef);
        return dataSubject.getDataSubjectId();
    }

    @Override
    public DSCategoryResponseDTO saveDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO) {
        DataSubjectCategory dataSubjectCategory = dsCategoryMapper.DSCategoryResponseDTOToDSCategory(dsCategoryRequestDTO);
        DataSubjectCategory result = dataSubjectCategoryRepository.save(dataSubjectCategory);
        return dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(result);
    }

    @Override
    public List<DSCategoryResponseDTO> getAllDataSubjectCategories() {
        List<DataSubjectCategory> result = dataSubjectCategoryRepository.findAll();
        List<DSCategoryResponseDTO> response = new ArrayList<>();
        result.forEach(dsc -> {
            response.add(dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(dsc));
        });
        return response;
    }

    @Override
    public DSCategoryResponseDTO getDataSubjectCategoryById(int dscId) {
        DataSubjectCategory dataSubjectCategory = dataSubjectCategoryRepository.findByDataSubjectCategoryId(dscId);
        DSCategoryResponseDTO dsCategoryResponseDTO =
                dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(dataSubjectCategory);

        return dsCategoryResponseDTO;
    }

}
