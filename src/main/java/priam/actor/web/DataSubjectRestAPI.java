package priam.actor.web;

import org.springframework.web.bind.annotation.*;
import priam.actor.dto.DSCategoryRequestDTO;
import priam.actor.dto.DSCategoryResponseDTO;
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
    @GetMapping(path = "/DataSubject/{id}")
    public DataSubjectResponseDTO getDataSubjectId(@PathVariable int id) {
        return dataSubjectService.findDataSubject(id);
    }

   @GetMapping(path = "/DataSubject/ref/{idRef}")
    public DataSubjectResponseDTO getDataSubjectByRef(@PathVariable String idRef) {
        return dataSubjectService.getDataSubjectByIdRef(idRef);
    }

    @PostMapping(path = "/actor/DataSubjectCategory")
    public DSCategoryResponseDTO createDSCategory(@RequestBody DSCategoryRequestDTO dSCategoryRequestDTO) {
        return dataSubjectService.saveDSCategory(dSCategoryRequestDTO);
    }
    @GetMapping(path = "/actor/DataSubjectCategories")
    public List<DSCategoryResponseDTO> getAllDSCategories() {
        return dataSubjectService.getAllDataSubjectCategories();
    }

    @GetMapping(path = "/actor/DataSubjectCategory/{dscId}")
    public DSCategoryResponseDTO getDSCategoryById(@PathVariable int dscId) {
        return dataSubjectService.getDataSubjectCategoryById(dscId);
    }
}
