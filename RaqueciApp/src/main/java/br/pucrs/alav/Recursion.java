package br.pucrs.alav;

public class Recursion {
    public static int ex1(int n1, int n2){
        if (n1 == 1){
        return n2;
    }
        return n2 + ex1(n1 - 1, n2);
  }

  public static int ex3(int max){
    if (max == 1){
      return 1;
    }
    return max + 1/ex3(max - 1);
  }

  public static boolean ex8(String st, int c1, int length){
    if (c1 == length){
      return true;
    }
    if( st.charAt(c1) != st.charAt(length)){
      return false;
    }
    else{
      return ex8(st, c1 + 1, length -1);
    }
  }
}
