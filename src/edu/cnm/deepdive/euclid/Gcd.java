package edu.cnm.deepdive.euclid;

public class Gcd {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int result = gcd(a, b);
      System.out.printf("Gcd(%d, %d) = %d %n", a, b, result);



    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      System.out.println("Must use integers only");

    } catch (ArrayIndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("Must have two parameters");
    }


  }


  public static int gcd(int a, int b) {
    return 0;


  }
}
