package me.whiteship.designpatterns._02_structural_patterns._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        // collections
    	// 넘긴 건 배열이지만 받는 건 리스트
        List<String> strings = Arrays.asList("a", "b", "c");
        
        // Collections.enumeration : adpater
        // strings : adaptee (기존 객체)
        // Enumeration : target interface
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);

        // io
        // input.txt String을 보냈는데 target interface인 InputStream 으로 나옴
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)) {
            while(reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
