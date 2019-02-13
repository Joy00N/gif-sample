package com.joy.gifsample;

import com.joy.gifsample.model.Shipwreck;
import com.joy.gifsample.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository repository;

    @Test
    public void testFindAll(){
        List<Shipwreck> shipwreckList = repository.findAll();
        assertThat(shipwreckList.size()).isGreaterThanOrEqualTo(1);
    }
}
