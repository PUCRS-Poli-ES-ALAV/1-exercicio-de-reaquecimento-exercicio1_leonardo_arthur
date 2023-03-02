package br.pucrs.alav;

public class Recursion {
	public static int ex1(int n1, int n2){
    if (n1 == 1){
      return n2;
    }
    return n2 + ex1(n1 - 1, n2);
  }
}
