package com.mycompany.app;

class Binraysearch {

    static int searchBinary(int[] givenArray, int target){
        int start=0;
        int end=givenArray.length-1;

        while (start<=end) {
            // int mid=(start)+end/2 //the number might exceed the range of int
        int mid= start+(end-start)/2;

        if(target<givenArray[mid]){
            end=mid-1;
        }else if(target>givenArray[mid]){
                start=mid+1;
        }else{
            return mid;
        }
        
        }
        return -1;
       
        
    }

    static int searchAgnosticBinary(int[] givenArray,int target){
        int start=0;
        int end=givenArray.length-1;
        boolean asc=start<end;
        while (start<=end) 
        {
            // int mid=(start)+end/2 //the number might exceed the range of int
              int mid= start+(end-start)/2;
                if(givenArray[mid]==target){
                    return mid;
                }

                if(!asc){
                    if(target<givenArray[mid]){
                        end=mid-1;
                    }else if(target>givenArray[mid]){
                            start=mid+1;
                    }
                    
                }else{
                    if(target>givenArray[mid]){
                        end=mid-1;
                    }else if(target<givenArray[mid]){
                            start=mid+1;
                    }
                    
                }
               
            }
       
            return -1;


    }
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,9,23,35,47,67,85};
        int target=35;
        int answ=searchBinary(arr, target);
        System.out.println("the answer is "+ answ);

        int[] unknownArray={89,73,64,52,40,28};
        int target2=40;
        int answ2=searchAgnosticBinary(unknownArray, target2);
        System.out.println("the answer for agnostic search is"+answ2);
    }
}