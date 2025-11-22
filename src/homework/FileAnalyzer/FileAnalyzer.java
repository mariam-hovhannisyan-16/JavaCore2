package homework.FileAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FileAnalyzer {

    public List<String> readWords(String path) throws IOException {
        String content = Files.readString(Paths.get(path));
        return Arrays.stream(content.toLowerCase().split("[^\\p{L}\\p{N}]+"))
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public Map<String, Integer> wordMap(String path) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        for (String word : readWords(path)) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public int totalWordCount(String path) throws IOException {
        return readWords(path).size();
    }

    public int uniqueWordCount(String path) throws IOException {
        return new HashSet<>(readWords(path)).size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        Map<String, Integer> map = wordMap(path);

        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(n)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        int count = 0;
        for (String w : readWords(path)) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}