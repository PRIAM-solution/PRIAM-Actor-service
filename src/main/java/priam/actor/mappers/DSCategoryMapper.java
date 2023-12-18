package priam.actor.mappers;

import org.mapstruct.Mapper;
import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
import priam.actor.entities.DSCategory;

@Mapper(componentModel = "spring")
public interface DSCategoryMapper {
    DSCategoryResponseDTO DSCategoryToDSCategoryResponseDTO(DSCategory dsCategory);
    DSCategory DSCategoryResponseDTOToDSCategory(DSCategoryRequestDTO dsCategoryRequestDTO);
}
