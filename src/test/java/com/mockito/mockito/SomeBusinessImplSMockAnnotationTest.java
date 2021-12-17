package com.mockito.mockito;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class);
public class SomeBusinessImplSMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;


    @Test
   public void findTheGreatestNumber() {
        when(dataServiceMock.retirieveAllData()).thenReturn(new int[]{24,15,3});
         int result = businessImpl.findTheGreatestNumber();
         assertEquals(24,result);
    }
}
