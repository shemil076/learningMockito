package com.mockito.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

    @Test
    public void test() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());
    }

    @Test
    public void testGEt() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }
}

