package ru.job4j.condition;

import org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class ArithmeticActionsTest {

    @Test
    public void selectActionAdded() {
        String action = ArithmeticActions.selectAction(5, 10, 15);
        assertThat(action, is("added"));
    }

    @Test
    public void selectActionSubtracted() {
        String action = ArithmeticActions.selectAction(10, 5, 5);
        assertThat(action, is("subtracted"));
    }

    @Test
    public void selectActionMultiplied() {
        String action = ArithmeticActions.selectAction(15, 5, 3);
        assertThat(action, is("divided"));
    }

    @Test
    public void selectActionDivided() {
    }
}