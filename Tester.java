package com.ciklum.study.timemap;


public class Tester  {

    public static void main(String[] args) throws Exception {
        TimeMap<String,String> map = new TimeMap<String,String>();
        map.put(null, "1dsfdfsd");
        Thread.sleep(50);

        System.out.println(map.get(null));
    }
}
