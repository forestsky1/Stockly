package com.larkspur.stockly.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import com.larkspur.stockly.Data.StockHandler;
import com.larkspur.stockly.Models.IStock;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestStockHandler {
    private final StockHandler _stockHandler = new StockHandler();

    @Before
    public void setup() {

    }

    @Test
    public void getSingleStock() {
        IStock resultStock;
        String stockName = "Visa";
        resultStock = _stockHandler.getStock(stockName);
        assertEquals(stockName, resultStock.getCompName());
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


}