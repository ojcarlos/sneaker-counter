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

    public UserVO findById(Long id) {


        User entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found"));
        return DozerMapper.parseObject(entity, UserVO.class);

    }
    public List<UserVO> findAll(){

        return DozerMapper.parseListObjects(repository.findAll(),UserVO.class);
    }
    public UserVO create(UserVO user){
        User entity = DozerMapper.parseObject(user, User.class);
        return DozerMapper.parseObject(repository.save(entity), UserVO.class);
    }
    public UserVO update(UserVO user){
        User user1 = repository.findById(user.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        user1.setEmail(user.getEmail());
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        return DozerMapper.parseObject(repository.save(user1), UserVO.class);
    }

    public void delete(Long id){
        User user1 = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(user1);
    }
}
