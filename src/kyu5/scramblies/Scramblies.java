package kyu5.scramblies;


/**
 * Created by Vilkas on 19/05/2017.
 * https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        StringBuilder s1 = new StringBuilder(str1);
        for (int i = 0; i < str2.length(); i++) {
            String c = String.valueOf(str2.charAt(i));
            int index = s1.indexOf(c);
            if (index >= 0) {
                s1.deleteCharAt(index);
            } else return false;
        }
        return true;
    }


}