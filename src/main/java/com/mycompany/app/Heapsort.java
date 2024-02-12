package com.mycompany.app;

import java.util.ArrayList;

public class Heapsort<T extends Comparable<T>> {
    ArrayList<T> givenList;

    Heapsort(){
        givenList=new ArrayList<>();
    }

    public void swap(int firstIndex,int secondIndex){
        T temp=givenList.get(firstIndex);
        givenList.set(firstIndex,givenList.get(secondIndex));
        givenList.set(secondIndex, temp);
        
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int leftNode(int index){
        return (index*2)+1;
    }
    public int rightNode(int index){
        return (index*2)+2;
    }

    public void insert(T value){
        givenList.add(value);// intially value added at the last of the heap
        upHeap(givenList.size()-1);//we upheap the value based on the nodes
    }

    public void upHeap(int index){

        if(index==0){
            return;
        }
        int p=parent(index);
        if(givenList.get(index).compareTo(givenList.get(p))<0){
            swap(index,p);
            upHeap(p);
        }

    }

    public void downHeap(int index){
        int min=index;
        int leftNode=leftNode(index);
        int rightNode=rightNode(index);
        if(leftNode<givenList.size()&& givenList.get(min).compareTo(givenList.get(leftNode))>0){ //compare the left node element with parent node
            min=leftNode;

        }
        if(rightNode<givenList.size()&& givenList.get(min).compareTo(givenList.get(rightNode))>0){//compare the right node element with parent node
            min=rightNode;

        }

        if(min!=index){
            swap(min, index);
            downHeap(min);
        }
    }

    public T remove() throws Exception{
        if(givenList.isEmpty()){
            throw new Exception("Removing from empty heap");
        }

        T temp=givenList.get(0);
        T last=givenList.remove(givenList.size()-1);
        if(!givenList.isEmpty()){
            downHeap(0);
        }
        return temp;
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data= new ArrayList<>();
        while (!givenList.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

public static void main (String[] args) throws Exception {
    Heapsort<Integer> givenHeap=new Heapsort<>();
    givenHeap.insert(23);
    givenHeap.insert(34);
    givenHeap.insert(49);
    givenHeap.insert(59);
    givenHeap.insert(25);
    givenHeap.insert(98);
}


}
