package com.pairprogramming.vendingmachine;

import java.util.List;

public interface VendingMachine {
    // return price of item
    public int getPriceByItem();

    // vm should keep track of cumulative amount
    public void insertCoin();

    // vm should be able to refund
    public List<?> refund();

    // calculate change and return item selected
    public Object collectItemAndChange();

    // reset inventory
    public void reset();
}
