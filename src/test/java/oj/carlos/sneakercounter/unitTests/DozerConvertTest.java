package oj.carlos.sneakercounter.unitTests;

import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.mapper.DozerMapper;
import oj.carlos.sneakercounter.vo.v1.SneakerVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DozerConvertTest {
    MockSneaker inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockSneaker();
    }

    @Test
    public void parseEntityToVOTest() {
        SneakerVO output = DozerMapper.parseObject(inputObject.mockEntity(), SneakerVO.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("brand Test0", output.getBrand());
        assertEquals("collab Test0", output.getCollab());
        assertEquals("Colorway Test0", output.getColorWay());
        assertEquals("Designer Test0", output.getDesigner());
        assertEquals("history Test0", output.getHistory());
        assertEquals("img Test0", output.getImgUrl());
        assertEquals("Model Test0", output.getModel());
        assertEquals("Data Test0", output.getReleaseDate());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<SneakerVO> outputList = DozerMapper.parseListObjects(inputObject.mockEntityList(), SneakerVO.class);
        SneakerVO output0 = outputList.get(0);

        assertEquals(Long.valueOf(0L), output0.getId());
        assertEquals("brand Test0", output0.getBrand());
        assertEquals("collab Test0", output0.getCollab());
        assertEquals("Colorway Test0", output0.getColorWay());
        assertEquals("Designer Test0", output0.getDesigner());
        assertEquals("history Test0", output0.getHistory());
        assertEquals("img Test0", output0.getImgUrl());
        assertEquals("Model Test0", output0.getModel());
        assertEquals("Data Test0", output0.getReleaseDate());

        SneakerVO output7 = outputList.get(7);

        assertEquals(Long.valueOf(7L), output7.getId());
        assertEquals("brand Test7", output7.getBrand());
        assertEquals("collab Test7", output7.getCollab());
        assertEquals("Colorway Test7", output7.getColorWay());
        assertEquals("Designer Test7", output7.getDesigner());
        assertEquals("history Test7", output7.getHistory());
        assertEquals("img Test7", output7.getImgUrl());
        assertEquals("Model Test7", output7.getModel());
        assertEquals("Data Test7", output7.getReleaseDate());
        SneakerVO output12 = outputList.get(12);

        assertEquals(Long.valueOf(12L), output12.getId());
        assertEquals("brand Test12", output12.getBrand());
        assertEquals("collab Test12", output12.getCollab());
        assertEquals("Colorway Test12", output12.getColorWay());
        assertEquals("Designer Test12", output12.getDesigner());
        assertEquals("history Test12", output12.getHistory());
        assertEquals("img Test12", output12.getImgUrl());
        assertEquals("Model Test12", output12.getModel());
        assertEquals("Data Test12", output12.getReleaseDate());
    }

    @Test
    public void parseVOToEntityTest() {
        Sneaker output = DozerMapper.parseObject(inputObject.mockVO(), Sneaker.class);
        assertEquals(Long.valueOf(0L), output.getId());

        assertEquals("brand Test0", output.getBrand());
        assertEquals("collab Test0", output.getCollab());
        assertEquals("Colorway Test0", output.getColorWay());
        assertEquals("Designer Test0", output.getDesigner());
        assertEquals("history Test0", output.getHistory());
        assertEquals("img Test0", output.getImgUrl());
        assertEquals("Model Test0", output.getModel());
        assertEquals("Data Test0", output.getReleaseDate());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Sneaker> outputList = DozerMapper.parseListObjects(inputObject.mockVOList(), Sneaker.class);
        Sneaker output0 = outputList.get(0);

        assertEquals(Long.valueOf(0L), output0.getId());
        assertEquals("brand Test0", output0.getBrand());
        assertEquals("collab Test0", output0.getCollab());
        assertEquals("Colorway Test0", output0.getColorWay());
        assertEquals("Designer Test0", output0.getDesigner());
        assertEquals("history Test0", output0.getHistory());
        assertEquals("img Test0", output0.getImgUrl());
        assertEquals("Model Test0", output0.getModel());
        assertEquals("Data Test0", output0.getReleaseDate());

        Sneaker output7 = outputList.get(7);

        assertEquals(Long.valueOf(7L), output7.getId());
        assertEquals("brand Test7", output7.getBrand());
        assertEquals("collab Test7", output7.getCollab());
        assertEquals("Colorway Test7", output7.getColorWay());
        assertEquals("Designer Test7", output7.getDesigner());
        assertEquals("history Test7", output7.getHistory());
        assertEquals("img Test7", output7.getImgUrl());
        assertEquals("Model Test7", output7.getModel());
        assertEquals("Data Test7", output7.getReleaseDate());

        Sneaker output12 = outputList.get(12);

        assertEquals(Long.valueOf(12L), output12.getId());
        assertEquals("brand Test12", output12.getBrand());
        assertEquals("collab Test12", output12.getCollab());
        assertEquals("Colorway Test12", output12.getColorWay());
        assertEquals("Designer Test12", output12.getDesigner());
        assertEquals("history Test12", output12.getHistory());
        assertEquals("img Test12", output12.getImgUrl());
        assertEquals("Model Test12", output12.getModel());
        assertEquals("Data Test12", output12.getReleaseDate());
    }
}
