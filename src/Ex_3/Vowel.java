package Ex_3;

import java.util.*;

public class Vowel {
    String str;
    String []word;
     Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();
    TreeMap<Integer, String> hashMap = new TreeMap(reverseOrderComparator);
    public Vowel(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = in.nextLine();
        word = str.split(" ");
    }

    public void CountVowel() {

        for (int i = 0; i < word.length; i++) {
            String buff = String.join("", word[i]);
            int count = 0;
            System.out.println(buff);
            for (char c : buff.toLowerCase().toCharArray()) {
                if ("аеиоуюэяыё".indexOf(c) >= 0) {
                    count++;
                }
            }
            hashMap.put(count, buff);
        }
        System.out.println("Words: ");
        System.out.println(hashMap);
        System.out.println('\n' + "Sorted words: ");
        Set<Integer> keys = hashMap.keySet();
        for(Integer key: keys)  {
            System.out.println(key + " --> " + hashMap.get(key));
        }
    }
    public void UpperCase() {
        int index;
        int[] indexOfFirstVowelsInAWord = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                if ("АаЕеЁёИиОоУуЫыЭэЮюЯя".indexOf(word[i].charAt(j)) > -1) {
                    index = j;
                    indexOfFirstVowelsInAWord[i] = index;
                    break;
                }
            }
        }
        int[] indexOfFirstVowel = indexOfFirstVowelsInAWord;
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i].substring(0, indexOfFirstVowel[i]) +
                    word[i].substring(indexOfFirstVowel[i], indexOfFirstVowel[i] + 1).toUpperCase() +
                    word[i].substring(indexOfFirstVowel[i] + 1, word[i].length()) + " ");
        }
    }
}
