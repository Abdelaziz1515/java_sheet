package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomobileTest {
    Automobile automobile=new
            Automobile();

    @Test
    public void getInput() {

        automobile.getInput();
    }

    @Test
    void calculateCost() {

        automobile.price=5;
        automobile.fuelConsumption=20;
        automobile.distance=100;
        automobile.calculateCost();
        assertEquals (25,automobile.calculateCost());

    }
}