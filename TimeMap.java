package com.ciklum.study.timemap;

import java.util.Date;
import java.util.HashMap;

public class TimeMap<K,V> {
    private int size;
    private HashMap<K, Entry> map = new HashMap<K, Entry>();

    public void put(K key, V value){
        map.put(key, new Entry(value));
        size++;
    }

    public V get(K key) {
        V result =  (V)map.get(key).getValue();
        return  isAlive(map.get(key).getDate()) ? result : null;
    }


    public boolean isAlive(Date entry1) {
        Date utd = new Date();
        return (utd.getTime() - entry1.getTime() ) <= 500;
    }

    public class Entry<K> {

        private V value;
        private Date date;

        public Date getDate() {
            return date;
        }

        public V getValue() {
            return value;
        }

        public Entry(V value) {
            this.value = value;
            this.date = new Date();
        }
    }
}



