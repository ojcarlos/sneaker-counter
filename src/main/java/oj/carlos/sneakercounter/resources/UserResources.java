package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserResources {

    @Autowired
    private UserService service;
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll(){
        return  service.findAll();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getById(@PathVariable long id){
        return service.findById(id);
    }
    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user){
        return service.create(user);
    }
    @PutMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable long id){

        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
