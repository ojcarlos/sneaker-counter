package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.services.SneakerService;
import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/sneaker")
public class SneakerResources {
    @Autowired
    private SneakerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SneakerVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SneakerVO getById(@PathVariable long id){
        return service.findById(id);
    }

    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SneakerVO create(@RequestBody SneakerVO sneaker){
        return service.create(sneaker);
    }
    @PutMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SneakerVO update(@RequestBody SneakerVO sneaker){
        return service.update(sneaker);
    }
    @DeleteMapping(value =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable long id){

        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
