package main.java.util;

import main.java.entity.City;

import java.util.ArrayList;
import java.util.List;

public class CityUtil {

    public static List<City> getCityList() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("Bangalore"));
        cityList.add(new City("Hyderabad"));
        cityList.add(new City("Pune"));
        cityList.add(new City("Delhi"));
        return cityList;
    }
}
