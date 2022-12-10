package com.toy._03_behavioral_patterns._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String path;
    private int result;

    public FileProcessor(String path, int result) {
        this.path = path;
        this.result = result;
    }

    public final int process(Operator operator) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                this.result = operator.getResult(this.result, Integer.parseInt(line));
            }
            return this.result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
