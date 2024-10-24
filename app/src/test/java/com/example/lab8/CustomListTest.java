package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList mockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = mockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "Count should be 1");
    }

}
