package com.compare.main;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {
	public static void main(String[] args) {
        List<MyData> list1 = new ArrayList<MyData>();
        list1.add(new MyData("Mark", true));
        list1.add(new MyData("Steve", true));
        list1.add(new MyData("Rick", true));

        List<MyData> list2 = new ArrayList<MyData>();
        list2.add(new MyData("Mark", true));
        list2.add(new MyData("Steve", true));
        list2.add(new MyData("Rick", true));
        list2.add(new MyData("Adam", true));

        System.out.println("Lists are equal:" + CompLists(list1, list2));

}
	
    public static boolean CompLists(List<MyData> list1, List<MyData> list2){
        boolean flag = true;
        for (int i = 0; i < list1.size(); i++){
            // if listB does not contain at least one element in listA, set flag to false
            if (!list2.contains(list1.get(i))){
                flag = false;
                break;
            }
        }
        
        return flag;
  }
}