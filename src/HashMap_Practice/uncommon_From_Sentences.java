package HashMap_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uncommon_From_Sentences {
    public static void main(String[] args) {

        String sentence1 = "the quick", sentence11 = "brown fox"; // return ["the", "quick", "brown", "fox"]
        String sentence2 = "the tortoise beat the haire", sentence22 = "the tortoise lost to the haire"; // return ["beat", "to", "lost"]
        String sentence3 = "copper coffee pot", sentence33 = "hot coffee pot"; // return ["copper", "hot"]

        System.out.println(uncommonFromSentences(sentence1, sentence11));
        System.out.println(uncommonFromSentences(sentence2, sentence22));
        System.out.println(uncommonFromSentences(sentence3, sentence33));
    }

    public static List<String> uncommonFromSentences(String sentence1, String sentence2) {
        Map<String, Integer> wordCounts = new HashMap<>();
        countWords(sentence1, wordCounts);
        countWords(sentence2, wordCounts);

        List<String> uncommonWords = new ArrayList<>();
        for(String key: wordCounts.keySet()) {
            if(wordCounts.get(key) == 1) {
                uncommonWords.add(key);
            }
        }

        return uncommonWords;
    }

    private static void countWords(String sentence, Map<String, Integer> counts) {
        String[] words = sentence.split(" ");
        for(String word: words) {
            if(counts.containsKey(word)) {
                counts.put(word, -1);
            } else {
                counts.put(word, 1);
            }
        }
    }
}
