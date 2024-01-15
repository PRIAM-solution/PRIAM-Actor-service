package priam.actor.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;
import priam.actor.entities.DataSubject;

@Mapper(componentModel = "spring")
public interface DataSubjectMapper {

    DataSubjectResponseDTO DataSubjectToDataSubjectResponseDTO(DataSubject dataSubject);

    DataSubject DataSubjectRequestDTOToDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO);
}
