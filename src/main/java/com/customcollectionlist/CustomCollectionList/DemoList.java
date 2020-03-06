package com.customcollectionlist.CustomCollectionList;

public class DemoList
{
    public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList<>();
 
        list.add(10);
        list.add(5);
        list.add(35);
        System.out.println("list is : "+list);
         
        list.remove(2);
        System.out.println("New updated list is : "+list);
         
        System.out.println("2nd element is : "+ list.get(1) );
        System.out.println("3rd element is : "+ list.get(2) );
 
        System.out.println("Size of the list is : "+list.size());
    }
}
