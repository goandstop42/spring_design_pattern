package me.whiteship.designpatterns._03_behavioral_patterns._22_template.moon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Template이 되는 곳, 알고리즘을 담고 있는 곳이다
 *
 */
public abstract class FileProcessor {

    private String path;
    public FileProcessor(String path) {
        this.path = path;
    }

    public final int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

	protected abstract int getResult(int result, int line);
}
