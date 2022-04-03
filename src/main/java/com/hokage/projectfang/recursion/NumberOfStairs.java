package com.hokage.projectfang.recursion;

import java.util.HashMap;
import java.util.Map;

public class NumberOfStairs {
    int result = 0;
    Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int nOfStairs) {
       cache.put(1,1);
       cache.put(2,2);
       return  noOfStaits(nOfStairs);
    }

    private int noOfStaits(int nOfStairs) {
        if(nOfStairs <=2 ) {
            return  nOfStairs;
        }

        if(cache.containsKey(nOfStairs) ){
            return cache.get(nOfStairs);
        }

      int res =  noOfStaits(nOfStairs -2) + noOfStaits(nOfStairs-1);
      cache.put(nOfStairs , res);
      return cache.get(nOfStairs);
    }
}