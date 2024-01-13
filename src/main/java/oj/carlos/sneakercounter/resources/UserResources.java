package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.services.UserService;
import oj.carlos.sneakercounter.vo.v1.UserVO;
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
    public List<UserVO> findAll(){
        return  service.findAll();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserVO getById(@PathVariable long id){
        return service.findById(id);
    }
    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserVO create(@RequestBody UserVO user){
        return service.create(user);
    }
    @PutMapping(consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserVO update(@RequestBody UserVO user){
        return service.update(user);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable long id){

        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
