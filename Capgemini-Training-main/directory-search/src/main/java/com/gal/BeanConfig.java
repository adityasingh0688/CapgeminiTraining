package com.gal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gal.algo.WordCounter;
import com.gal.algo.FileProvider;
@Configuration
public class BeanConfig {
    @Bean
    public String dirToSearch(){
        return "/Users/vaduniniranjan/Desktop/Java/Java_Code";
    }
    @Bean
    public FileProvider fileProvider(){
        return new FileProvider(dirToSearch(),".java");
    }
    @Bean
    public WordCounter wordCounter(){
        WordCounter wc = new WordCounter();
        wc.setWordToSearch("System");
        wc.setFileListProvider(fileProvider());
        return wc;
    }
}