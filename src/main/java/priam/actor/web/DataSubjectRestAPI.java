package priam.actor.web;

import org.springframework.web.bind.annotation.*;
import priam.actor.dto.DataSubjectCategoryRequestDTO;
import priam.actor.dto.DataSubjectCategoryResponseDTO;
import priam.actor.dto.DataSubjectRequestDTO;
import priam.actor.dto.DataSubjectResponseDTO;
import priam.actor.mappers.DataSubjectMapper;
import priam.actor.services.DataSubjectService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataSubjectRestAPI {

    private DataSubjectService dataSubjectService;
    private DataSubjectMapper dataSubjectMapper;

    public DataSubjectRestAPI(DataSubjectService dataSubjectService) {
        this.dataSubjectService = dataSubjectService;
    }

    @PostMapping(path = "/DataSubject")
    public DataSubjectResponseDTO createDataSubject(@RequestBody DataSubjectRequestDTO dataSubjectRequestDTO) {
        return dataSubjectService.saveDataSubject(dataSubjectRequestDTO);
    }

    @GetMapping(path = "/DataSubject/{dataSubjectId}")
    public DataSubjectResponseDTO getDataSubjectId(@PathVariable int dataSubjectId) {
        return dataSubjectService.findDataSubject(dataSubjectId);
    }

    @GetMapping(path = "/DataSubject/ref/{idRef}")
    public DataSubjectResponseDTO getDataSubjectByRef(@PathVariable String idRef) {
        return dataSubjectService.getDataSubjectByIdRef(idRef);
    }

    @PostMapping(path = "/actor/DataSubjectCategory")
    public DataSubjectCategoryResponseDTO createDataSubjectCategory(@RequestBody DataSubjectCategoryRequestDTO dSCategoryRequestDTO) {
        return dataSubjectService.saveDataSubjectCategory(dSCategoryRequestDTO);
    }

    @GetMapping(path = "/actor/DataSubjectCategories")
    public List<DataSubjectCategoryResponseDTO> getAllDataSubjectCategories() {
        return dataSubjectService.getAllDataSubjectCategories();
    }

    @GetMapping(path = "/actor/DataSubjectCategory/{dataSubjectCategoryId}")
    public DataSubjectCategoryResponseDTO getDataSubjectCategoryById(@PathVariable int dataSubjectCategoryId) {
        return dataSubjectService.getDataSubjectCategoryById(dataSubjectCategoryId);
    }
}
