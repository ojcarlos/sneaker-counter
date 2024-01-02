package oj.carlos.sneakercounter.resources;

import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserResources {

    @Autowired
    private UserService service;
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll(){
        return  service.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getById(@PathVariable long id){
        return service.findById(id);
    }
    @RequestMapping(method = RequestMethod.POST,
            consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user){
        return service.create(user);
    }
    @RequestMapping(method = RequestMethod.PUT,
            consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable long id){
        service.delete(id);
    }


}
