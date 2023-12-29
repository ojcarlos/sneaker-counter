package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Sneaker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class SneakerService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(SneakerService.class.getName());

    public Sneaker findById(Long id) {
        logger.info("find one person");
        Sneaker sneaker = new Sneaker();
        sneaker.setId(counter.incrementAndGet());
        sneaker.setBrand("JORDAN");
        sneaker.setCollab("");
        sneaker.setDesigner("TINKER HATFIELD");
        sneaker.setHistory("Lançadas em 1988, as Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas" +
                " três décadas de colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora " +
                "emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas de " +
                "sapatilhas mais notáveis em todo o mundo.");
        sneaker.setModel("JORDAN 3");
        sneaker.setColorWay("CINZENTO CEMENT");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1988);
        sneaker.setReleaseDate(c);

        return sneaker;

    }
    public List<Sneaker> findAll(){
        List<Sneaker> sneakers = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            Sneaker sneaker = mockSneaker(i);
            sneakers.add(sneaker);
        }
        return sneakers;
    }
    public Sneaker create(Sneaker sneaker){
        return sneaker;
    }
    public Sneaker update(Sneaker sneaker){
        return sneaker;
    }

    public void delete(Long id){
        logger.info("deleted" + id);
    }


    private Sneaker mockSneaker(int i) {
        Long id = Integer.toUnsignedLong(i);
        Sneaker sneaker = new Sneaker();
        sneaker.setId(id);
        sneaker.setBrand("JORDAN");
        sneaker.setCollab("");
        sneaker.setDesigner("TINKER HATFIELD");
        sneaker.setHistory("Lançadas em 1988, as Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas" +
                " três décadas de colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora " +
                "emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas de " +
                "sapatilhas mais notáveis em todo o mundo.");
        sneaker.setModel("JORDAN" + i);
        sneaker.setColorWay("CINZENTO CEMENT");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, (1998 + i));
        sneaker.setReleaseDate(c);
        return sneaker;
    }
}
