package com.joy.gifsample;

import com.joy.gifsample.model.Person;
import com.joy.gifsample.model.Shipwreck;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.assertThat;

public class ShipwreckSunny {
    private Shipwreck shipwreck;
    private Person person;

    @Given("there is a shipwreck")
    public void givenThereisAShipwreck() {
        shipwreck = new Shipwreck(123L, "YoonWreck");
    }

    @When("I have a valid authorization")
    public void whenIhaveAValidAuthorization() {
        person = new Person("Joy", "Officer");
    }

    @Then("you can add and remove shipwreck")
    public void thenYouCanAddAndRemoveShipwreck() {
        assertThat(shipwreck.getId()).isEqualTo(123L);
        assertThat(shipwreck.getName()).isEqualTo("YoonWreck");
    }

}
