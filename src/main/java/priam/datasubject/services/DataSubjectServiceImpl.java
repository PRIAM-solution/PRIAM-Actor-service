package priam.datasubject.services;

import org.springframework.stereotype.Service;
import priam.datasubject.dto.DSCategoryResponseDTO;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DSCategory;
import priam.datasubject.entities.DataSubject;
import priam.datasubject.mappers.DSCategoryMapper;
import priam.datasubject.mappers.DataSubjectMapper;
import priam.datasubject.repositories.DSCategoryRepository;
import priam.datasubject.repositories.DataSubjectRepository;

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
    public DataSubjectResponseDTO findDataSubject(int idDataSubject) {
        DataSubject dataSubject = dataSubjectRepository.findById(idDataSubject).get();
        DataSubjectResponseDTO dataSubjectResponseDTO =
                dataSubjectMapper.DataSubjectToDataSubjectResponseDTO(dataSubject);
        System.out.println(dataSubject.getId());
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
    public DSCategoryResponseDTO getDataSubjectCategoryById(int dscId) {
        DSCategory dsCategory = dsCategoryRepository.findDSCategoryByDscId(dscId);
        DSCategoryResponseDTO dsCategoryResponseDTO =
                dsCategoryMapper.DSCategoryToDSCategoryResponseDTO(dsCategory);

        return dsCategoryResponseDTO;
    }

}
