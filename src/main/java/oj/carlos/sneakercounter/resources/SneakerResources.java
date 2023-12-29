package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.services.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/sneaker")
public class SneakerResources {
    @Autowired
    private SneakerService service;

    @RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Sneaker> findAll(){
        return service.findAll();
    }

    @RequestMapping(value =  "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Sneaker getById(@PathVariable long id){
        return service.findById(id);
    }

}
