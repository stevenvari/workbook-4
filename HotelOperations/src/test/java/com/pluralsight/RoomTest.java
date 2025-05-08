package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        //arrange
         Room room = new Room(1,139,true,true,true);

        //act
        room.checkIn();

        //assert
        assertFalse(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        //arrange
        Room room = new Room(1,139,true,true,true);

        //act
        room.checkIn();
        room.checkOut();


        // assert
        assertTrue(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //arrange
        Room room = new Room(1,139,true,true,true);
        //act
        
        room.cleanRoom();

        //assert
        assertFalse(room.isDirty());
    }
}