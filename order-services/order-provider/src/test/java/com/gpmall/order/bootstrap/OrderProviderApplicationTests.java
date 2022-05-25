package com.gpmall.order.bootstrap;

import com.gpmall.order.dal.entitys.Stock;
import com.gpmall.order.dal.persistence.StockMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderProviderApplicationTests {

    @Autowired
    StockMapper stockMapper;

    @Test
    public void contextLoads() {
        ArrayList list = new ArrayList();
        list.add("100053312");
        List<Stock> list1 = stockMapper.findStocksForUpdate(list);

        for (Stock stock : list1) {
            System.out.println(stock);
        }
    }

}
