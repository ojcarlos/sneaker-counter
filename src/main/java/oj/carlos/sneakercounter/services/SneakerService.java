package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.exceptions.ResourceNotFoundException;
import oj.carlos.sneakercounter.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class SneakerService {
    @Autowired
    private SneakerRepository repository;
    public Sneaker findById(Long id) {


        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found"));

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

        return repository.save(sneaker);
    }

    public void delete(Long id){
        Sneaker sneaker1 = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(sneaker1);
    }



}
