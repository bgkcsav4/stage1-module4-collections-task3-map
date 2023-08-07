package com.epam.mjc.collections.map;

import java.util.Map;

import java.util.HashMap;
public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            swappedMap.put(value, key);
        }

        return swappedMap;
    }

}
