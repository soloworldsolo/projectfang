package com.hokage.projectfang.problems;

import java.util.List;

public class CakeDistribution {

    public int distribute(int[] input, int noOfBread) {
        int currentIndex = 0;
         while (noOfBread >0) {
             noOfBread = noOfBread - input[currentIndex];
             if(noOfBread <=0 ) {
                 if(++currentIndex <input.length) {
                     return  currentIndex;
                 }else {
                     return 0;
                 }
             }else if(noOfBread <input[currentIndex]){
                 if(++currentIndex <input.length) {
                     return  currentIndex;
                 }else {
                     return 0;
                 }
             }

             if(++currentIndex >= input.length) {
                 currentIndex = 0;
             }
         }
        return currentIndex;
    }
}
