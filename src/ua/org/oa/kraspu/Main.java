package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws MyException{

    //1.  Find Maximum.
    //    Write a method that returns the largest integer in the list.
    //    You can assume that the list has at least one element.

    int arr[] = {3, 7, 1, 45, 33, 12, 0};

    System.out.println("1.  Max number is\t " + Mathematic.maxNumber(arr));

    //2.  Write a method that returns the average of a list of integers
    System.out.println("2.  The average is\t " + Mathematic.average(arr));

    //3. Write a method that converts all strings in a list to their upper case.
    //
    //    public List<String> makeCapitalLetters(List<String> list){
    //        List<String> changedList;
    //        return changedList;
    //   }
    ArrayList<String> list = new ArrayList<String>();
    list.add("\t\tHello, my name is Pavlo");
    list.add("\t\tNice to meet you!");
    System.out.println("3.  IN UPPER CASE:");
    Mathematic.makeCapitalLetters(list);


    //4. Given: 1,3,55,6,7,8,23,11,55,33,22,4,5,7,8,9,12.
    //   Task: calculate a sum of all even numbers
    int arr1[] = {1, 3, 55, 6, 7, 8, 23, 11, 55, 33, 22, 4, 5, 7, 8, 9, 12};
    int sumEven = 0;
    for (int i : arr1) {
      if (i % 2 == 0) {
        sumEven += i;
      }
    }
    System.out.println("4.  The sum of all even numbers is: " + sumEven);

    //5.  Longest Common Sequence
    //    Given two strings, write a method that finds the longest common sub-sequence.
    System.out.println("5.  Longest Common Sequence");
    String str1 = "Например, есть такая";
    System.out.println("\t\t" + str1);
    String str2 = "и              есть такая";
    System.out.println("\t\t" + str2);
    System.out.println("\t\tLongest Common Sequence:" + "\"" + Sequence.longestSubstring(str1, str2) + "\"");

    //6.  Loop
    System.out.println("6.  Loop");
    Mathematic.loop(2);

    //7. Inheritance
    System.out.println("7. Inheritance");
    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();

    //8.  Java Abstract Class
    System.out.println("8.  Java Abstract Class");
    MyBook book = new MyBook();
    book.setTitle("A tale of two cities");
    System.out.println(book.getTitle());

    System.out.println("9.  Exception");
    try{
      System.out.println("\t\t" + MyCalculator.power(3,5));
      System.out.println("\t\t" + MyCalculator.power(2,4));
      System.out.println("\t\t" + MyCalculator.power(0,0));
      System.out.println("\t\t" + MyCalculator.power(-1,-2));
      System.out.println("\t\t" + MyCalculator.power(-1,3));
    }catch (MyException e) {
      System.out.println(e.getLocalizedMessage());
    }

    //9.  Exception





  }



}

