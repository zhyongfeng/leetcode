package code2019;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
有一个由空格分隔的由多个字符组成的字符串，String text = "a b k c d d k"
写一个函数，输出字符串中每一个字符出现的次数
运行结果：a:1 b:1 k:2 c:1 d:2
 */
public class Code20190329 {

    public static LinkedHashMap count(String text) {

        String[] array = text.split(" ");

        LinkedHashMap map = new LinkedHashMap<>();

        for (String c : array) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int count = Integer.valueOf(map.get(c).toString()) + 1;
                map.put(c, count);
            }
        }
        return map;
    }

    public static String toString(LinkedHashMap<String, Integer> map) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> mm : map.entrySet()) {
            result.append(mm.getKey()).append(":").append(mm.getValue()).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(toString(count("a b k c d d k")));
        }

    }

}
