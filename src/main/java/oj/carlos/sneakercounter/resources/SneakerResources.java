package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.services.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/sneaker")
public class SneakerResources {
    @Autowired
    private SneakerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Sneaker> findAll(){
        return service.findAll();
    }

    @GetMapping(value =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sneaker getById(@PathVariable long id){
        return service.findById(id);
    }

    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Sneaker create(@RequestBody Sneaker sneaker){
        return service.create(sneaker);
    }
    @PutMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Sneaker update(@RequestBody Sneaker sneaker){
        return service.create(sneaker);
    }
    @DeleteMapping(value =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable long id){
        service.delete(id);
    }

}
