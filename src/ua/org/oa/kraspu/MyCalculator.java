package ua.org.oa.kraspu;

public class MyCalculator {

  public static int power (int n, int p) throws MyException {
    int pow = 1;
    if (n == 0 && p == 0) {
      throw new MyException("\t\tn and p should not be zero");
    }else if (n < 0 || p < 0) {
      throw new MyException("\t\tn or p should not be negative");
    }else {
      for (int i = 0; i < p; i++) {
        pow *= n;
      }
    }
    return pow;
  }


}
