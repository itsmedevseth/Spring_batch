package com.devseth.batch.batch.writter;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirstItemWritter implements ItemWriter<Long> {
    @Override
    public void write(List<? extends Long> items) throws Exception {
        System.out.println("inside Item Writer");
        items.stream().forEach(System.out::println);

    }
}
