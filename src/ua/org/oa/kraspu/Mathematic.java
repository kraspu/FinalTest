package ua.org.oa.kraspu;

import java.util.ArrayList;
import java.util.List;

public class Mathematic {

  //1.  Find Maximum.
  //    Write a method that returns the largest integer in the list.
  //    You can assume that the list has at least one element.
  public static int maxNumber(int[] array) {
    int max = array[0];
    for (int i : array) {
      if (max < i) {
        max = i;
      }
    }
    return max;
  }

  //2.  Write a method that returns the average of a list of integers
  public static double average(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return (double) sum / array.length;
  }

  //3.  Write a method that converts all strings in a list to their upper case.
  //
  //    public List<String> makeCapitalLetters(List<String> list){
  //        List<String> changedList;
  //        return changedList;
  //    }

  public static List<String> makeCapitalLetters(List<String> list) {
    List<String> changedList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      changedList.add(list.get(i).toUpperCase());
      System.out.println(changedList.get(i));
    }
    return changedList;
  }

  //6. Loop
  public static void loop(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println("\t\t" + n + " * " + i + " = " + n*i);
    }
  }


}
