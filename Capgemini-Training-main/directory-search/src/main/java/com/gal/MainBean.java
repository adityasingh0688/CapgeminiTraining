package com.gal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gal.algo.WordCounter;

import java.util.Map;

public class MainBean {

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        WordCounter wc = context.getBean(WordCounter.class);

        Map<String,Integer> result = wc.createMapResult();

        result.forEach((file,count) ->
                System.out.println(file + " -> " + count));
    }
}