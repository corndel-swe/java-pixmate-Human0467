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
    // Using a for loop
//    int sum = 0;
//    for(int i = 2; i <= n; i += 2){
//      sum += i;
//    }

    // using a while loop
    int sum = 0;
    int i = 2;
    while(i <= n){
      sum += i;
      i += 2;
    }
    return sum;
  }
}