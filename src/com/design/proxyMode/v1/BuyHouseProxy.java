package com.design.proxyMode.v1;

public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");
    }

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }
}
