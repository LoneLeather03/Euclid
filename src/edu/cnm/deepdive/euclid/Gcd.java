package edu.cnm.deepdive.euclid;

public class Gcd {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.printf("a = %d, b = %d%n", a, b);



    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      System.out.println("Must use integers only");

    }
    catch (ArrayIndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("Must have two parameters");
    }

  }
}
