package oj.carlos.sneakercounter.unitTests;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MockSneaker {
    public Sneaker mockEntity() {
        return mockEntity(0);
    }

    public SneakerVO mockVO() {
        return mockVO(0);
    }

    public List<Sneaker> mockEntityList() {
        List<Sneaker> sneakers = new ArrayList<Sneaker>();
        for (int i = 0; i < 14; i++) {
            sneakers.add(mockEntity(i));
        }
        return sneakers;
    }

    public List<SneakerVO> mockVOList() {
        List<SneakerVO> sneakers = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            sneakers.add(mockVO(i));
        }
        return sneakers;
    }

    public Sneaker mockEntity(Integer number) {
        Sneaker sneaker = new Sneaker();
        sneaker.setCollab("collab Test" + number);
        sneaker.setBrand("brand Test" + number);
        sneaker.setDesigner("Designer Test" + number);
        sneaker.setId(number.longValue());
        sneaker.setHistory("history Test" + number);
        sneaker.setModel("Model Test" + number);
        sneaker.setReleaseDate("Data Test" + number);
        sneaker.setColorWay("Colorway Test" + number);
        sneaker.setImgUrl("img Test" + number);
        return sneaker;
    }

    public SneakerVO mockVO(Integer number) {
        SneakerVO sneaker = new SneakerVO();
        sneaker.setCollab("collab Test" + number);
        sneaker.setBrand("brand Test" + number);
        sneaker.setDesigner("Designer Test" + number);
        sneaker.setId(number.longValue());
        sneaker.setHistory("history Test" + number);
        sneaker.setModel("Model Test" + number);
        sneaker.setReleaseDate("Data Test" + number);
        sneaker.setColorWay("Colorway Test" + number);
        sneaker.setImgUrl("img Test" + number);
        return sneaker;
    }
}
