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
    public SneakerVO findById(Long id) {


        Sneaker entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found"));
        return DozerMapper.parseObject(entity, SneakerVO.class);

    }
    public List<SneakerVO> findAll(){


        return DozerMapper.parseListObjects(repository.findAll(), SneakerVO.class) ;
    }
    public SneakerVO create(SneakerVO sneakerVO){
        Sneaker entity = DozerMapper.parseObject(sneakerVO, Sneaker.class);
        return DozerMapper.parseObject(repository.save(entity), SneakerVO.class );
    }
    public SneakerVO update(SneakerVO sneakerVO){

        Sneaker sneaker1 = repository.findById(sneakerVO.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        sneaker1.setColorWay( sneakerVO.getColorWay());
        sneaker1.setModel(sneakerVO.getModel());
        sneaker1.setReleaseDate(sneakerVO.getReleaseDate());
        sneaker1.setHistory(sneakerVO.getHistory());
        sneaker1.setDesigner(sneakerVO.getDesigner());
        sneaker1.setBrand(sneakerVO.getBrand());
        sneaker1.setCollab(sneakerVO.getCollab());

        return DozerMapper.parseObject(repository.save(sneaker1), SneakerVO.class );
    }

    public void delete(Long id){
        Sneaker sneaker1 = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(sneaker1);
    }



}
