package com.example.military;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void  looses_when_lotery_number_is_too_low() {
        Loteria loteria = new Loteria(5,1);
        Player player = new Player(2,loteria);
        assertEquals(false,player.play());

    }
    @Test
    public void  win_when_lotery_number_is_too_equals() {
        Loteria loteria = new Loteria(5,1);
        Player player = new Player(2,loteria);
        assertEquals(true,player.play());

    }

}