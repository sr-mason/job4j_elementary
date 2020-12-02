package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then21() {
        int result = Max.max(21, 2);
        assertThat(result, is(21));
    }

    @Test
    public void whenMax2To1Then232() {
        int result = Max.max(22, 232);
        assertThat(result, is(232));
    }

    @Test
    public void whenMax1To1Then2() {
        int result = Max.max(11, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenMax1To0Then12() {
        int result = Max.max(12, 0);
        assertThat(result, is(12));
    }

    @Test
    public void whenMax3To3Then452() {
        int result = Max.max(12, 10, 452);
        assertThat(result, is(452));
    }

    @Test
    public void whenMax3To4Then452() {
        int result = Max.max(12, 10, 452, 12);
        assertThat(result, is(452));
    }
}