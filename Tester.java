package com.ciklum.study.timemap;


public class Tester  {

    public static void main(String[] args) throws Exception {
        TimeMap map = new TimeMap();
        map.put("1", "1dsfdfsd");
        Thread.sleep(5003);

        System.out.println(map.get("1"));
    }
}
