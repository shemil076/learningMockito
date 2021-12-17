package com.mockito.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplSMockTest {

    @Test
    void findTheGreatestNumber() {

         DataService dataServiceMock =mock(DataService.class);
//         dataServiceMock.retirieveAllData() => new int[]{24,15,3}

        when(dataServiceMock.retirieveAllData()).thenReturn(new int[]{24,15,3});


         SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
         int result = businessImpl.findTheGreatestNumber();
         assertEquals(24,result);
    }
}
