package com.mockito.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void findTheGreatestNumber() {
         SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
         int result = businessImpl.findTheGreatestNumber();
         assertEquals(24,result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retirieveAllData(){
        return new int[] {24,6,15};
    }
}