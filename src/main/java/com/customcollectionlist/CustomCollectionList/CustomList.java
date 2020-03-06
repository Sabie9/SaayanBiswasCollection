package com.customcollectionlist.CustomCollectionList;

import java.util.Arrays;

public class CustomList<E> 
{
    private int s = 0;   //Size of list
    private static final int DEF_CAPACITY = 10;  //Default list capacity is 10
    private Object elements[];    //Array for storing all elements to the list
 
    public CustomList() {
        elements = new Object[DEF_CAPACITY];
    }

    public void add(E e) {
        if (s == elements.length) {
            Capacity();
        }
        elements[s++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if ((i >= s) || (i < 0)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
     
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if ((i >= s) || (i < 0)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        s--;
        return (E) item;
    }
     
    public int size() {
        return s;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < s ;i++) {
             sb.append(elements[i].toString());
             if(i<(s-1)){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void Capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
