package com.mycompany.app;

/**
 * Linersearch
 */
public class Linersearch {

    static int findNumber(int[] givenArray, int targetNumber){
        if(givenArray.length==0){
            return -1;
        }
        for (int index=0;index<givenArray.length;index++){
            if(givenArray[index]==targetNumber){
                return index;
            }
        }
        return -1;
    }


    static int findBetweenRange(int[]givenArray,int targetNumber,int startIndex,int endIndex){
        if(givenArray.length==0){
            return -1;
        }
        for(int i=startIndex;i<endIndex;i++){
            if(givenArray[i]==targetNumber){
                return i;
            }
           
            }
                return -1;

    }


    static boolean findNumberBoolean(int[] givenArray,int targetNumber){
        if(givenArray.length==0){
            return false;
        }
        for(int index=0;index<givenArray.length;index++){
            if(givenArray[index]==targetNumber){
                return true;
            }
        }
        return false;
    }

        static int findMin(int[]givenArray){
            if(givenArray.length==0){
                return -1;
            }
            int minValue=givenArray[0];
            for(int i=0;i<givenArray.length;i++){
                
                    if(givenArray[i]<minValue){
                        minValue=givenArray[i];
                    }      
            }
            return minValue;
        }

        static int findMax(int[]givenArray){
            if(givenArray.length==0){
                return -1;
            }
            int max=givenArray[0];
            for(int i=0;i<givenArray.length;i++){
                if(givenArray[i]>max){
                    max=givenArray[i];
                }
            }
            return max;
        }


    public static void main(String[] args) {
        int[] givenArray={21,34,53,24,45,65};
        int result=findNumber(givenArray, 45);
        int resultRange=findBetweenRange(givenArray,34, 0, 3);
        System.out.println("The result found index is :" + result);
        System.out.println("the provided range:"+resultRange);;
    }
    
}