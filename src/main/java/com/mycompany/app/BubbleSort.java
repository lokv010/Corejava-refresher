package com.mycompany.app;

public class BubbleSort {
    
static void bubbleSort(int[] givenArray){
    for (int i=0;i<givenArray.length-1;i++){
        for(int j=1;j<givenArray.length-i-1;j++){
            //swap if item is small
            if(givenArray[i]<givenArray[j-1]){
                int temp=givenArray[j];
                givenArray[j]=givenArray[j-1];
                givenArray[j-1]=temp;

            }
        }
    }

}
    public static void main(String[] args) {

        int[] givenArray={2,4,5,6,1};
      
        bubbleSort(givenArray);
        
    }
}
