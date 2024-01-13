package oj.carlos.sneakercounter.config;

import oj.carlos.sneakercounter.entities.Counter;
import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.repositories.CounterRepository;
import oj.carlos.sneakercounter.repositories.SneakerRepository;
import oj.carlos.sneakercounter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private SneakerRepository sneakerRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CounterRepository counterRepository;
    @Override
    public void run(String... args) throws Exception {
        Sneaker sneaker1 = new Sneaker(null,"JORDAN17", "CINZENTO CEMENT",
                Instant.parse("2019-06-20T19:53:07Z"),
                "Lançadas em 1988, as " +
                "Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas três décadas de " +
                "colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora " +
                "emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas " +
                "de sapatilhas mais notáveis em todo o mundo.", "TINKER HATFIELD","JORDAN",
                "", "");
        Sneaker sneaker2 = new Sneaker(null,"JORDAN01", "CHICAGO",
                Instant.parse("2019-06-20T19:53:07Z"),
                "Lançadas em 1988, as " +
                        "Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas três décadas de " +
                        "colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora " +
                        "emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas " +
                        "de sapatilhas mais notáveis em todo o mundo.", "TINKER HATFIELD","JORDAN",
                "", "");
        Sneaker sneaker3 = new Sneaker(null,"JORDAN02", "BLUE",
                Instant.parse("2019-06-20T19:53:07Z"),
                "Lançadas em 1988, as " +
                        "Air Jordan 3 foram o primeiro design de Tinker Hatfield nas suas três décadas de " +
                        "colaboração com o legado Jordan. A partir desta parceria, Tinker criou o agora " +
                        "emblemático estampado de elefante. Até hoje, as AJ3 continuam a ser uma das silhuetas " +
                        "de sapatilhas mais notáveis em todo o mundo.", "TINKER HATFIELD","JORDAN",
                "", "");
        sneakerRepository.saveAll(Arrays.asList(sneaker2,sneaker1,sneaker3));
        User u1 = new User(null, "Joao das neves", "joao@exemplo.com", "senha");
        User u2 = new User(null, "Maria do Carmo", "maria@carmo.com", "senhadamaria");
        userRepository.saveAll(Arrays.asList(u1,u2));
        Counter c1 = new Counter(sneaker1, u1, 3);
        Counter c2 = new Counter(sneaker2, u2, 7);
        Counter c3 = new Counter(sneaker3, u1, 3);
        Counter c4 = new Counter(sneaker1, u2, 7);
        counterRepository.saveAll(Arrays.asList(c4,c2,c1,c3));

    }
}
