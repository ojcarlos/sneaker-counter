package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.Counter;
import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.services.CounterService;
import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "counter")
public class CounterResources {

    @Autowired
    private CounterService service;
    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Counter create(@RequestBody Counter counter){
        return service.create(counter);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Counter> findALL(){
        return service.findAll();
    }
    @PutMapping(value = "/{userId}/{sneakerId}/{count}")
    public ResponseEntity<?> update(@PathVariable long userId, @PathVariable long sneakerId,@PathVariable int count ){
        service.update(userId, sneakerId, count);
        return ResponseEntity.noContent().build();
    }
}
