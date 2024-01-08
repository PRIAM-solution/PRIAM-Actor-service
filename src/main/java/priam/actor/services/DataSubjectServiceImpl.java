package priam.actor.services;

import org.springframework.stereotype.Service;
import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;
import priam.actor.entities.DSCategory;
import priam.actor.entities.DataSubject;
import priam.actor.mappers.DSCategoryMapper;
import priam.actor.mappers.DataSubjectMapper;
import priam.actor.repositories.DSCategoryRepository;
import priam.actor.repositories.DataSubjectRepository;

import javax.annotation.Generated;
import javax.transaction.Transactional;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)
@Service
@Transactional
public class DataSubjectServiceImpl implements DataSubjectService {
    final DataSubjectRepository dataSubjectRepository;
    final DSCategoryRepository dsCategoryRepository;
    final DataSubjectMapper dataSubjectMapper;

    final DSCategoryMapper dsCategoryMapper;

    public DataSubjectServiceImpl(DataSubjectRepository dataSubjectRepository, DSCategoryRepository dsCategoryRepository, DataSubjectMapper dataSubjectMapper, DSCategoryMapper dsCategoryMapper) {
        this.dataSubjectRepository = dataSubjectRepository;
        this.dsCategoryRepository = dsCategoryRepository;
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
        DataSubject dataSubject = dataSubjectRepository.findDataSubjectByIdRef(idRef);
        DataSubjectResponseDTO dataSubjectResponseDTO =
                dataSubjectMapper.DataSubjectToDataSubjectResponseDTO(dataSubject);
        return dataSubjectResponseDTO;
    }

    @Override
    public int getDataSubjectIdByIdRef(String idRef) {
        DataSubject dataSubject = dataSubjectRepository.findDataSubjectByIdRef(idRef);
        return dataSubject.getId();
    }

    @Override
    public DSCategoryResponseDTO saveDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO) {
        DSCategory dsCategory = dsCategoryMapper.DSCategoryResponseDTOToDSCategory(dsCategoryRequestDTO);
        DSCategory result = dsCategoryRepository.save(dsCategory);
        return dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(result);
    }

    @Override
    public DSCategoryResponseDTO getDataSubjectCategoryById(int dscId) {
        DSCategory dsCategory = dsCategoryRepository.findDSCategoryByDscId(dscId);
        DSCategoryResponseDTO dsCategoryResponseDTO =
                dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(dsCategory);

        return dsCategoryResponseDTO;
    }

}
