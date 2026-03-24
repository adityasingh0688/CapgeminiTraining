package com.gal.algo;

import java.io.*;
import java.util.*;

public class WordCounter {

    private String wordToSearch;
    private FileProvider fileListProvider;

    public void setWordToSearch(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public void setFileListProvider(FileProvider fileListProvider) {
        this.fileListProvider = fileListProvider;
    }

    public Map<String,Integer> createMapResult() throws Exception {

        Map<String,Integer> result = new HashMap<>();

        for(File file : fileListProvider.getFiles()) {

            BufferedReader reader = new BufferedReader(new FileReader(file));

            int count = 0;
            String line;

            while((line = reader.readLine()) != null) {

                if(line.contains(wordToSearch)) {
                    count++;
                }
            }

            result.put(file.getName(), count);
            reader.close();
        }

        return result;
    }
}