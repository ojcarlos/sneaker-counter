package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.exceptions.ResourceNotFoundException;
import oj.carlos.sneakercounter.mapper.DozerMapper;
import oj.carlos.sneakercounter.repositories.SneakerRepository;
import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class SneakerService {
    @Autowired
    private SneakerRepository repository;
    public Sneaker findById(Long id) {


        Sneaker entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found"));
        return entity;

    }
    public List<Sneaker> findAll(){


        return repository.findAll();
    }
    public Sneaker create(Sneaker sneaker){

        return repository.save(sneaker);
    }
    public Sneaker update(Sneaker sneaker){

        Sneaker sneaker1 = repository.findById(sneaker.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        sneaker1.setColorWay( sneaker.getColorWay());
        sneaker1.setModel(sneaker.getModel());
        sneaker1.setReleaseDate(sneaker.getReleaseDate());
        sneaker1.setHistory(sneaker.getHistory());
        sneaker1.setDesigner(sneaker.getDesigner());
        sneaker1.setBrand(sneaker.getBrand());
        sneaker1.setCollab(sneaker.getCollab());

        return repository.save(sneaker1);
    }

    public void delete(Long id){
        Sneaker sneaker1 = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(sneaker1);
    }



}
