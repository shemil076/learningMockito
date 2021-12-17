package com.mockito.mockito;

public class SomeBusinessImpl {
    private DataService dataService;


    int findTheGreatestNumber(){
        int[] data = dataService.retirieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}


