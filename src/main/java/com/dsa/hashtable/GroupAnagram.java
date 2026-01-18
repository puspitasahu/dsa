package com.dsa.hashtable;

import java.util.*;

public class GroupAnagram{
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> str =groupAnagram(strs);
        System.out.println(str);
    }

    private static List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }

      return new ArrayList<>(map.values());

    }
}
