package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Sneaker;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class SneakerService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(SneakerService.class.getName());

    public Sneaker findById(Long id){
        logger.info("find one person");
        Sneaker sneaker = new Sneaker();
        sneaker.setId(counter.incrementAndGet());
        sneaker.setBrand("JORDAN");
        sneaker.setCollab("");
        sneaker.setDesigner("TINKER HATFIELD");
        sneaker.setHistory("Lançadas em 1988, as Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas três décadas de colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas de sapatilhas mais notáveis em todo o mundo.");
        sneaker.setModel("JORDAN 3");
        sneaker.setColorWay("CINZENTO CEMENT");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1988);
        sneaker.setReleaseDate(c);

        return sneaker;
    }
}
