package com.corndel.pixmate.exercises;

/**
 * @see <a href="https://tech-docs.corndel.com/java/while-loops.html">While Loops in Java</a>
 * @see <a href="https://tech-docs.corndel.com/java/for-loops.html">For Loops in Java</a>
 */
public class Exercise1a {

  /**
   * Adds together all the positive even numbers smaller than or equal to n.
   * <p>
   * For example, if n = 8, the method returns 20 (2 + 4 + 6 + 8).
   * </p>
   *
   * @param n the upper limit (inclusive)
   * @return the sum of the even numbers smaller than or equal to n
   */
  public static int addEven(int n) {
    int sum = 0;
    for(int i = 2; i <= n; i += 2){
      sum += i;
    }
    return sum;
  }
}