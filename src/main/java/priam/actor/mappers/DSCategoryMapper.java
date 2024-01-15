package priam.actor.mappers;

import org.mapstruct.Mapper;
import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.entities.DataSubjectCategory;

@Mapper(componentModel = "spring")
public interface DSCategoryMapper {
    DSCategoryResponseDTO DSCategoryToDSCategoryResponseDTO(DataSubjectCategory dataSubjectCategory);
    DataSubjectCategory DSCategoryResponseDTOToDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO);
}
