package priam.actor.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;
import priam.actor.entities.DataSubject;

@Mapper(componentModel = "spring")
public interface DataSubjectMapper {
    @Mapping(target = "dscId", source = "dataSubject.dsCategory.dscId")
    @Mapping(target = "dscName", source = "dataSubject.dsCategory.dscName")
    DataSubjectResponseDTO DataSubjectToDataSubjectResponseDTO(DataSubject dataSubject);

    @Mapping(target = "dsCategory.dscId", source = "dataSubjectRequestDTO.dscId")
    DataSubject DataSubjectRequestDTOToDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO);
}
