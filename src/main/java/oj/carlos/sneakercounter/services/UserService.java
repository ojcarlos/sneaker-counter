package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.exceptions.ResourceNotFoundException;
import oj.carlos.sneakercounter.mapper.DozerMapper;
import oj.carlos.sneakercounter.repositories.UserRepository;

import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import oj.carlos.sneakercounter.vo.v1.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found"));

    }
    public List<User> findAll(){
        return repository.findAll();
    }
    public User create(User user){
        return repository.save(user);
    }
    public User update(User user){
        User user1 = repository.findById(user.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        user1.setEmail(user.getEmail());
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        return repository.save(user);
    }

    public void delete(Long id){
        User user1 = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(user1);
    }

}
