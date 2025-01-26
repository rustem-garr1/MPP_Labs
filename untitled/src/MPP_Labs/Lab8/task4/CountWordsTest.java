package MPP_Labs.Lab8.task4;

import java.util.ArrayList;
import java.util.List;

public class CountWordsTest {


    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        CountWordsTest instance = new CountWordsTest();

        int result=instance.countWords(fruits, 'a', 'o', 6);
        System.out.println(result);
    }

    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(String.valueOf(c)))
                .filter(word -> !word.contains(String.valueOf(d)))
                .count();
    }

//    public int countWords(List<String> words, char c, char d, int len){
//        int result = 0;
//        for(String word:words){
//            if(word.length()==len){
//                if(word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d))){
//                    result+=1;
//                }
//            }
//        }
//        return result;
//    }
}
