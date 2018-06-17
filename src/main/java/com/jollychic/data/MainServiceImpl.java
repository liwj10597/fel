package com.jollychic.data;

public class MainServiceImpl implements MainService {
    @Override
    public void setName(String name) {
        System.out.println("My name is " + name);
    }
}
