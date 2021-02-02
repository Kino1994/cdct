package jadevicentel.topo;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import jadevicentel.topo.controller.TopoController;

@SpringBootTest
public abstract class BaseCDC {

    @Autowired
    TopoController topoController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(topoController);
    }
}