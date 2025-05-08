package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CarTest {

    @Test
    void accelerate_should_increaseCarSpeed() {

        //arrange
        Car car = new Car("toyota","camry");
        int speedChange = 15;
        int expectedSpeed = 15;
        //act
        car.accelerate(speedChange);
        //assert
        assertEquals(expectedSpeed,car.getSpeed());
    }
    @Test
    public void brake_should_decreaseCarSpeed() {
        // arrange
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed = 5;
        car.accelerate(speedUpBy);
        // act
        car.brake(slowDownBy);
        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

}