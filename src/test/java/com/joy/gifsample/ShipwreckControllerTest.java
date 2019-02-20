package com.joy.gifsample;

import com.joy.gifsample.controller.ShipwreckController;
import com.joy.gifsample.model.Shipwreck;
import com.joy.gifsample.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository repository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() {
        Shipwreck shipwreck = new Shipwreck(1L, "Test");

        when(repository.findById(1L)).thenReturn(Optional.of(shipwreck));
        Shipwreck wreck = repository.findById(1L).get();
//        Use Junit assertions
//        assertEquals(1L, sc.get(1L).getId().longValue());

//        Use hamcrest
        assertThat(wreck.getId(), is(1L));
    }
}
